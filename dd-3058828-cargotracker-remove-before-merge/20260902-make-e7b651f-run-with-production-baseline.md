# Make the `e7b651f` production baseline run on Open Liberty with JDK 17

Work autonomously in:

```text
/home/edburns/workareas/cargotracker-01
```

Do not ask for routine implementation decisions. Investigate, implement, run the
application, diagnose failures, and iterate until the acceptance criteria below
are satisfied.

## Goal

Make this exact command work on JDK 17:

```bash
./mvnw clean package -Popenliberty liberty:run
```

The command must build the historical application, start Open Liberty in the
foreground, deploy Cargo Tracker successfully, and make the application
available at:

```text
http://localhost:8080/cargo-tracker/
```

This is preparation for an LLM feature-reimplementation experiment. The
application behavior at this historical baseline must remain intact.

## Critical experiment boundary

The worktree is intentionally detached at:

```text
e7b651fb3ed8bc17c338face1c7ff960618fcd95
2020-09-27
Update README.md
```

Its parent is:

```text
f0c5e52aa1419b684364bb803e4d76e1fb20338d
```

The later commit `bc24dea` adds the "Change Arrival Deadline Date" feature that
will be reimplemented in a separate experiment. That feature must remain absent.

Do **not**:

- check out, cherry-pick, merge, copy, or inspect the implementation from
  `bc24dea` or later feature commits;
- add any ability to change a cargo's arrival deadline;
- add `BookingService.changeDeadline`, arrival-deadline backing beans, an
  arrival-deadline dialog, or the associated test;
- modernize application behavior merely to resemble current `master`;
- rewrite Git history or move the worktree away from `e7b651f`;
- commit the changes unless explicitly requested.

You may inspect later commits that contain build-tool, Maven-wrapper, or Open
Liberty configuration, but use them only as compatibility research. Do not
import later application or feature behavior.

## Current baseline facts

The current tree is a Java EE 7 application using the `javax.*` namespace:

- `pom.xml` compiles with source/target `1.7`.
- The platform API is `javax:javaee-api:7.0`.
- PrimeFaces is `8.0`.
- JUnit is `4.12`.
- Arquillian is `1.4.1.Final`.
- Tests are skipped by default through `<skipTests>true</skipTests>`.
- The only application-server Maven profile is the active-by-default `payara`
  profile.
- The Payara profile uses Codehaus Cargo 1.8.1 and Payara 4.1.2.181.
- There is no `openliberty` Maven profile.
- There is no `mvnw`, `mvnw.cmd`, or `.mvn/wrapper` directory.
- The README's original local command is `mvn package cargo:run` on Java 8.

Application resource requirements visible in the baseline include:

- Faces 2.2;
- CDI 1.1;
- EJB 3.2, including message-driven beans and timers;
- JPA 2.1 with EclipseLink behavior;
- JAX-RS 2.0;
- WebSocket 1.0;
- JSON-P 1.0;
- Bean Validation 1.1;
- Batch 1.0;
- JMS 2.0.

`src/main/webapp/WEB-INF/web.xml` defines:

- context root behavior for `/cargo-tracker`;
- environment entry `java:app/configuration/GraphTraversalUrl`, whose value is
  Maven-filtered from `${webapp.graphTraversalUrl}`;
- application data source `java:app/jdbc/CargoTrackerDatabase`;
- Derby JDBC URL
  `jdbc:derby:${webapp.databaseTempDir}/cargo-tracker-database;create=true`;
- five JMS destinations using resource adapter `jmsra`:
  - `java:app/jms/CargoHandledQueue`
  - `java:app/jms/MisdirectedCargoQueue`
  - `java:app/jms/DeliveredCargoQueue`
  - `java:app/jms/RejectedRegistrationAttemptsQueue`
  - `java:app/jms/HandlingEventRegistrationAttemptQueue`

`src/main/resources/META-INF/persistence.xml` uses:

```text
java:app/jdbc/CargoTrackerDatabase
```

and requests schema creation through the Java EE 7
`javax.persistence.schema-generation.database.action` property.

## Known historical context

Use this context to accelerate investigation, but verify compatibility against
the `e7b651f` tree.

### Current working repository

The sibling worktree at `/home/edburns/workareas/cargotracker` currently runs on
JDK 17 with:

```bash
./mvnw clean package -Popenliberty liberty:run
```

That current tree is Jakarta EE 10 and therefore its application dependencies,
feature versions, deployment descriptors, and `jakarta.*` configuration cannot
be copied wholesale into this Java EE 7 baseline.

Useful build-plumbing ideas from the current tree include:

- an official Maven wrapper;
- `io.openliberty.tools:liberty-maven-plugin`;
- binding Liberty creation and feature installation into the Maven lifecycle;
- copying a JDBC driver into Liberty shared resources;
- keeping Liberty configuration under `src/main/liberty/config`;
- using HTTP port 8080 and context root `/cargo-tracker`.

### Historical Liberty work

- Commit `ec8926e` introduced the later Jakarta EE 10 Open Liberty profile and
  configuration. It is useful for Maven-plugin structure, not as a compatible
  Java EE 7 server configuration.
- A pre-revert tree at `8684526` contained an incomplete Java EE 8-era
  `openliberty` profile using Liberty Maven Plugin 3.5.1 and Derby 10.14.2.0.
  It did not contain a checked-in Liberty `server.xml`, and the related work was
  later removed by `f27a56e`. Treat it as research, not a known-good solution.
- Commit `a9c1af3` later introduced the Maven wrapper. Use the official wrapper
  structure, but choose a Maven distribution that works reliably with this
  project on JDK 17.

## Implementation requirements

### 1. Preserve Java EE 7 application semantics

Prefer running the existing `javax.*` application on an Open Liberty runtime
that supports Java EE 7 and JDK 17. Avoid a broad `javax.*` to `jakarta.*`
migration; that would make this a different production baseline and contaminate
the feature experiment.

Changing compiler settings from Java 7 bytecode to a JDK-17-compatible release
is acceptable if required, but do not rewrite application source merely to use
new Java language features.

Do not delete or disable application subsystems to get a superficial startup.
Faces, persistence, messaging/MDBs, batch, REST, WebSocket, and sample-data
initialization must remain functional.

### 2. Add an official Maven wrapper

Add:

```text
mvnw
mvnw.cmd
.mvn/wrapper/maven-wrapper.properties
```

The Unix script must be executable. Do not create a custom shell wrapper that
only happens to be named `mvnw`.

### 3. Add a real `openliberty` Maven profile

Add an `openliberty` profile that:

- uses a Liberty Maven Plugin version compatible with JDK 17;
- creates or installs Open Liberty as needed;
- installs the required server features during the normal lifecycle;
- packages and deploys `target/cargo-tracker.war`;
- supports the exact combined invocation
  `./mvnw clean package -Popenliberty liberty:run`;
- does not require a separately installed application server;
- does not require Docker, Azure, PostgreSQL, or another external service.

The default Payara profile may remain for historical fidelity, but activating
`openliberty` must not accidentally activate incompatible Payara behavior or
dependencies.

### 4. Add complete local Liberty configuration

Create the necessary files under `src/main/liberty/config`, normally including
`server.xml` and any required supporting properties/options.

Select Liberty features compatible with the application's Java EE 7 APIs.
An aggregate Java EE 7 feature may be appropriate, but verify that it actually
covers all application requirements, including batch, WebSocket, JMS/MDBs,
persistence, and Faces.

Configure:

- HTTP on port `8080`;
- context root `/cargo-tracker`;
- deployment of `cargo-tracker.war`;
- a local embedded JDBC database;
- `java:app/jdbc/CargoTrackerDatabase`;
- any data source needed by EJB timers or persistent executors;
- an embedded messaging engine/server;
- all five JMS queues and activation specifications required by the MDBs;
- class loading/shared libraries necessary for the JDBC driver;
- application bindings needed for the existing resource references.

Prefer preserving the baseline's Derby persistence semantics if Derby can run
reliably on JDK 17 and the selected Liberty version. If a different embedded
database is necessary, keep the change limited to build and server/resource
configuration and explain why Derby was not viable. Do not introduce an
external database requirement.

Pay close attention to Java EE 7 versus Jakarta EE 9+ feature names, resource
adapter names, JMS destination bindings, JDBC driver class names, and the
location into which Maven copies shared libraries.

### 5. Keep Maven resource filtering correct

The WAR plugin must continue filtering deployment descriptors so
`${webapp.graphTraversalUrl}` and `${webapp.databaseTempDir}` resolve to valid
local values for the Open Liberty profile.

Use a worktree-local database directory rather than relying on an unsafe global
temporary location when practical. Add generated runtime/database paths to
`.gitignore` if needed.

### 6. Update directly relevant documentation

Update `README.md` with concise JDK 17/Open Liberty instructions using the exact
command and URL from this task. Preserve the historical documentation where it
does not conflict with the new supported path.

## Required process

1. Confirm the worktree is at `e7b651f` and inspect the initial Git status.
2. Establish the actual baseline failure before editing. The missing Maven
   wrapper is expected to be the first problem.
3. Inspect the application annotations, MDB destination lookups, timers,
   resource references, and test packaging before designing `server.xml`.
4. Make minimal, coherent build/runtime changes.
5. Run Maven only with JDK 17:

   ```bash
   export JAVA_HOME="/usr/lib/jvm/msopenjdk-17-amd64"
   export ANT_HOME="/usr/share/ant"
   export M2_HOME="/usr/share/maven"
   export PATH="${M2_HOME}/bin:${ANT_HOME}/bin:${JAVA_HOME}/bin:${PATH}"
   ```

6. Whenever invoking Maven, stream stdout and stderr through `tee` to a
   specifically named log file using:

   ```text
   YYYYMMDD-HHMM-job-logs.txt
   ```

   Keep diagnostic logs under
   `dd-3058828-cargotracker-remove-before-merge/` so they are clearly
   disposable and do not become product changes.
7. Iterate through compilation, Liberty feature installation, server startup,
   deployment, data-source initialization, messaging activation, and HTTP
   behavior. Do not stop after `BUILD SUCCESS` if the deployed application is
   broken.
8. Run the exact acceptance command in the foreground. Once Liberty reports
   ready, verify the application using `curl`.
9. Stop the server cleanly after verification and make sure no detached process
   remains.
10. Inspect `git diff` and `git status`. Retain only intentional source,
    configuration, wrapper, ignore, and documentation changes. Do not include
    downloaded servers, generated databases, build output, or diagnostic logs
    in the product diff.

Do not edit or delete this prompt file. The
`dd-3058828-cargotracker-remove-before-merge` directory is an operational
artifact and must not be treated as product source or committed.

## Acceptance criteria

All of the following must be true:

1. JDK 17 is demonstrably active:

   ```bash
   ./mvnw --version
   ```

   reports Java 17.

2. This exact command progresses through a successful Maven package and starts
   Open Liberty:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

3. Liberty reports that the server and `cargo-tracker` application started
   successfully, with no unresolved application-level deployment errors.

4. This request returns HTTP 200:

   ```bash
   curl --fail --show-error --silent \
     http://localhost:8080/cargo-tracker/ \
     > /dev/null
   ```

5. The returned application page is Cargo Tracker, not a generic Liberty page
   or error document.

6. At least one representative application endpoint or workflow that exercises
   initialized sample data also succeeds. For example, confirm that the public
   tracking UI can reach the `ABC123` sample cargo, or use an existing REST
   endpoint appropriate to this baseline.

7. Persistence initializes without fatal schema/data-source errors.

8. All five MDBs can resolve their JMS destinations and activate. Do not accept
   a server that returns the home page while messaging remains nonfunctional.

9. The server can be stopped cleanly.

10. No "Change Arrival Deadline Date" implementation is present.

11. The final diff contains no unrelated application refactoring or feature
    work.

## Final response

Lead with whether the exact command and HTTP verification succeeded. Then
report:

- the root causes found;
- the meaningful files changed and why;
- the selected Liberty, Maven Wrapper, JDBC, and Java compatibility choices;
- the exact verification commands and results;
- any non-fatal Liberty warnings that remain;
- confirmation that the arrival-deadline feature is still absent;
- confirmation that no server process was left running.

If anything remains incomplete, state exactly which acceptance criterion is
not met and continue attempting reasonable fixes before concluding that it is
blocked.
