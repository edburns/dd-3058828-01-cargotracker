# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `9745f6cf-dda0-4c73-b572-c8acc15e8fdf`  
> - **Started:** 9/2/2026, 5:54:28 PM  
> - **Duration:** 4m 0s  
> - **Exported:** 9/2/2026, 5:58:29 PM  

---

<sub>8s</sub>

### User

Invoke skill `shepherd-task-20-create-issues-from-plan` with these inputs:

- CAMPAIGN_ID: 5426f64c-a653-4ff1-ba39-00209a83cdb4
- LESSON_PROPAGATION: campaign
- REPO: edburns/dd-3058828-01-cargotracker
- BASE_BRANCH: experiment/shepherd-treatment
- PARENT_ISSUE: 3
- PLAN_DIRECTORY: 3-arrival-deadline-treatment-remove-before-merge
- PLAN_FILE_NAME: add-change-arrival-deadline-feature-ignorance-reduction-plan.md
- QUESTIONS_SECTION: ## Phase 3 — Ignorance reduction: questions to answer before writing code
- IMPLEMENTATION_SECTION: ## Phase 4 — Implementation (five serial issues)
- EXPECTED_TASK_COUNT: 5
- BASE_REMOTE: origin
- LOG_DIRECTORY: C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754
- DRAFT_VALIDATOR: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1
- ISSUE_BODY_VERIFIER: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1



---

<sub>16s</sub>

### `skill`

**shepherd-task-20-create-issues-from-plan**

<details>
<summary>Arguments</summary>

```json
{
  "skill": "shepherd-task-20-create-issues-from-plan"
}
```

</details>

```
Skill "shepherd-task-20-create-issues-from-plan" loaded successfully. Follow the instructions in the skill context.
```


---

<sub>21s</sub>

### Copilot

I’m validating the campaign inputs, plan structure, repository state, and issue-format conventions before drafting any GitHub mutations.

---

<sub>39s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\01-1682-java-tool-ergonomics.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\01-1682-java-tool-ergonomics.md

<details>
<summary>15 lines</summary>

```
# Example 01: 1682-java-tool-ergonomics-prompts-remove-before-merge

Read `copilot-sdk/1682-java-tool-ergonomics-prompts-remove-before-merge/dd-3018003-ignorance-reduction-for-implementation-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 3 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating issues of type **Task** as children of Epic https://github.com/github/copilot-sdk/issues/1682 . These issues correspond to the sub-sections in `## Phase 4 — Implementation (the build order)`.

I want you to use `gh` to create issues as sub-issues of 1682.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Set the type to **Task**.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `upstream`: `edburns/1682-java-tool-ergonomics`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `1682-java-tool-ergonomics-prompts-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**, I want you to carefully consider if there additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>40s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\02-1810-java-tool-as-lambda.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\02-1810-java-tool-as-lambda.md

<details>
<summary>12 lines</summary>

```
# Example 02: 1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge

Carefully read the plan `copilot-sdk/1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`.

We have completed Phases 1 - 3. We are now on Phase 4.

For each sub item in Phase 4, file a child issue of Feature #1810.

Use `gh` to look at Epic #1682 and its child issues for the standard of verbosity and concreteness for issue descriptions.

The issue should be assignable to a coding agent and there must be sufficient detail in the description for the agent to proceed to completion.

Pull out the specific relevant content from Phase 3 as it applies to this current issue in Phase 4.

Tell the agent to take `edburns/1810-java-tool-ergonomics-tool-as-lambda` as the base branch. When I assign the issue to the coding agent, I will set this as the base branch.

Tell the agent to read `1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`, which is present on the branch, for context.

Tell the agent which sub-item within Phase 4 they are solving.

Tell the agent that each issue will be assigned, resolved and merged to the base branch in the order in which they appear in the plan.

No work is to start until I assign each issue to the coding agent, in turn.
```

</details>


---

<sub>39s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\03-dd-3017826-java-real-estate-demo.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\03-dd-3017826-java-real-estate-demo.md

<details>
<summary>14 lines</summary>

```
# Example 03: dd-3017826-java-real-estate-demo-remove-before-merge

Read `dd-3017826-java-real-estate-demo-remove-before-merge\dd-3017826-java-real-estate-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/2 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #2.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/2-build-out-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `dd-3017826-java-real-estate-demo-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>38s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\04-28-python-agent-demo.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\04-28-python-agent-demo.md

<details>
<summary>16 lines</summary>

```
# Example 04: 28-python-agent-demo-remove-before-merge

Read `28-python-agent-demo-remove-before-merge/28-python-agent-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`. These pertain to the implementation tasks in Phase 3. ✅✅✅ Make sure to put into the description explicit instructions on how to access the relevant spike research.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/28 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #28

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Again, ✅✅For each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`, include the relevant Resolution values in the issue description. These pertain to the implementation tasks in Phase 3. ✅✅✅ Make sure to put into the description explicit instructions on how to access the relevant spike research for that task.

- For tasks dealing with the UI, make sure to refer to the relevant screengrabs, but only ones within `28-python-agent-demo-remove-before-merge/`.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/28-python-agent-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `28-python-agent-demo-remove-before-merge/`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>40s</sub>

### `glob`

**3-arrival-deadline-treatment-remove-before-merge/****

"3-arrival-deadline-treatment-remove-before-merge/**"

<details>
<summary>7 matches</summary>

```
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\shepherd-test-experiment.json
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\shepherd-campaign.json
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\campaign-lessons.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\create-issues-otel-20260902-1754.jsonl
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\20260902-1754-invoke-shepherd-task-20-create-issues-from-plan-skill.ps1
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\20260902-1754-invoke-shepherd-task-20-create-issues-from-plan-skill.md
```

</details>


---

<sub>41s</sub>

### `powershell`

**Validate paths, branch, remotes, and worktree**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; if (-not [System.IO.Path]::IsPathRooted($logDir)) { throw 'LOG_DIRECTORY is not absolute' }; if (-not (Test-Path -LiteralPath $logDir -PathType Container)) { throw 'LOG_DIRECTORY does not exist' }; $bodyDir=Join-Path $logDir 'issue-bodies'; New-Item -ItemType Directory -Path $bodyDir -Force | Out-Null; $probe=Join-Path $bodyDir '.write-probe'; [IO.File]::WriteAllText($probe,'ok'); Remove-Item -LiteralPath $probe; $scripts=@('C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1','C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'); foreach($s in $scripts){ if(-not [System.IO.Path]::IsPathRooted($s) -or -not (Test-Path -LiteralPath $s -PathType Leaf)){ throw \"Invalid script: $s\" } }; git remote -v; git branch --list 'experiment/shepherd-treatment'; git remote get-url origin; git --no-pager status --short",
  "description": "Validate paths, branch, remotes, and worktree",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>6 lines</summary>

```
origin	https://github.com/edburns/dd-3058828-01-cargotracker.git (fetch)
origin	https://github.com/edburns/dd-3058828-01-cargotracker.git (push)
* experiment/shepherd-treatment
https://github.com/edburns/dd-3058828-01-cargotracker.git
?? 3-arrival-deadline-treatment-remove-before-merge/prompts/
<shellId: 0 completed with exit code 0>
```

</details>


---

<sub>41s</sub>

### `powershell`

**Inspect repository, parent, and children**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3058828-01-cargotracker'; gh api \"repos/$repo\" --jq '{default_branch,owner:{login:.owner.login,type:.owner.type}}'; gh api \"repos/$repo/issues/3\" --jq '{number,state,title,repository_url}'; gh api \"repos/$repo/issues/3/sub_issues\" --paginate --jq '.[] | {id,number,title}'",
  "description": "Inspect repository, parent, and children",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

```
{"default_branch":"20260902-2104Z-commit-e7b651f-liberty","owner":{"login":"edburns","type":"User"}}
{"number":3,"repository_url":"https://api.github.com/repos/edburns/dd-3058828-01-cargotracker","state":"open","title":"[Campaign][campaign] Cargo Tracker arrival-deadline experiment"}
<shellId: 1 completed with exit code 0>
```


---

<sub>53s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 1-220)

<details>
<summary>171 lines</summary>

````
# Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)

Human DRI: Ed Burns  
Starting commit: `9b9f311b2a3a2854bdac947593950d9edb6bca7d` (`Make the system ready for implementation`)  
Working directory: `/home/edburns/workareas/cargotracker-01/`  
Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0  
Baseline run instructions: `README.md`  
Baseline preparation prompt: `dd-3058828-cargotracker-remove-before-merge/20260902-make-e7b651f-run-with-production-baseline.md`  
Historical issue: `eclipse-ee4j/cargotracker#64`  

Related directories and files:

- `src/main/java/org/eclipse/cargotracker/application/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
- `src/main/webapp/admin/dialogs/`
- `src/main/webapp/admin/tables/listNotRouted.xhtml`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

---

## Goal

Add an Administration dashboard operation that lets a shipping administrator
change the arrival deadline of a cargo listed in the **Not Routed Cargo** table.
The operation must preserve Cargo Tracker's layered architecture:

1. The application service owns the domain mutation.
2. The booking facade shields the web layer from domain types.
3. A JSF backing bean loads and submits the editable date.
4. A PrimeFaces dynamic dialog presents the editor.
5. The existing Not Routed Cargo table opens the dialog and refreshes after a
   successful update.

### User-visible acceptance behavior

Using the stable sample cargo `DEF789`:

1. Start the application with Java 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Open `http://localhost:8080/cargo-tracker/`.
3. Select **Administration**.
4. Find `DEF789` in the **Not Routed Cargo** table.
5. The Deadline cell displays its date together with an edit icon.
6. Hovering over the deadline displays:
   `Click to change cargo arrival deadline date.`
7. Selecting the deadline opens a modal dialog titled **Change Deadline**.
8. The dialog displays the cargo's origin and destination as read-only
   context.
9. The date editor is initialized to the cargo's current arrival deadline.
10. Selecting a different date and pressing **Update** closes the dialog and
    refreshes the Administration view.
11. The new date is shown in the Not Routed Cargo table.
12. Reloading the page continues to show the new date for the lifetime of the
    running in-memory sample application.
13. Pressing **Cancel** closes the dialog without changing the deadline.

### Domain acceptance behavior

Changing the deadline must:

- locate the cargo by `TrackingId`;
- preserve its existing origin;
- preserve its existing destination;
- replace only the arrival deadline in its `RouteSpecification`;
- apply the specification through `Cargo.specifyNewRoute(...)`;
- preserve the currently assigned itinerary rather than silently discarding
  it;
- allow the domain model to recalculate routing status and delivery-derived
  values against the new route specification;
- persist the changed cargo through `CargoRepository.store(...)`.

### Hard scope constraints

- Begin from commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d`.
- Preserve Java EE 7 and the `javax.*` namespace.
- Preserve the Java 7 source/target level used by this historical codebase.
- Run the application on JDK 17 using the existing Open Liberty profile.
- Do not migrate the application to Jakarta EE 8+, Jakarta EE 9+, Spring, or a
  different UI framework.
- Do not replace the in-memory Derby configuration or the Open Liberty runtime.
- Do not redesign unrelated cargo booking, routing, destination editing,
  messaging, batch, REST, or persistence behavior.
- Do not copy commits or files from feature-bearing branches. This plan is the
  implementation specification.
- Implement the five build issues below in order. Each issue must be complete
  and gated before the next issue begins.

---

## Completed phases

### Phase 1 ✅ — Establish a runnable feature-absent baseline

- Commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d` is based on the historical
  feature-absent commit and contains only the compatibility work needed to run
  the sample on JDK 17 and Open Liberty.
- `./mvnw clean package -Popenliberty liberty:run` starts the application.
- The home page and Administration flows return HTTP 200.
- JSF view metadata is placed at `UIViewRoot` scope for MyFaces compatibility.
- The internal routing REST client works without a Jersey/MOXy classloading
  conflict.
- The scheduled batch job has the local authorization it needs.

### Phase 2 ✅ — Verify the before and after user experience

- Before implementation, `DEF789` appears in the Not Routed Cargo table with a
  plain-text deadline and no edit operation.
- The neighboring Destination column demonstrates the existing PrimeFaces
  dynamic-dialog interaction pattern.
- The desired after behavior has been manually exercised: open the deadline
  editor, choose a new date, update, refresh the table, and observe the
  persisted value.
- The historical architectural boundaries and affected files have been
  identified.

---

## Phase 3 — Ignorance reduction: questions to answer before writing code

Resolve these questions before production implementation begins. The
recommendations intentionally define the desired design closely enough that an
implementing agent should not need to invent a different architecture.

### 3.1 — Which cargos expose the edit operation?

**Question:** Should deadline editing be exposed for all cargos or only for
cargos displayed in the Not Routed Cargo table?

The requested feature originates in the Administration dashboard's Not Routed
Cargo table. Other tables represent routed, misrouted, claimed, or otherwise
progressed cargo. Adding the affordance to every table would expand the feature
and require additional business rules about changing deadlines after handling
has begun.

| Option | UI scope | Trade-off |
|--------|----------|-----------|
| A | Not Routed Cargo table only | Matches the requested feature and the established destination-edit affordance. |
| B | Every Administration cargo table | Broader capability, but introduces lifecycle and authorization questions outside the request. |
| C | Cargo details page only | Avoids table complexity but does not meet the requested dashboard interaction. |

The application-service operation itself does not need to encode a UI-table
restriction. It should accept a tracking ID and apply the domain mutation to
the located cargo. The presentation layer determines where the operation is
offered.

**Recommendation:** Option A. Add the edit affordance only to
`src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
operation generally usable for a valid cargo.

**Resolution:**

Select Option A. Expose the edit affordance only in
`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.

### 3.2 — What is the exact domain mutation?

**Question:** Should the feature mutate the existing `RouteSpecification`, add
a setter to `Cargo`, or replace the specification using the existing domain
operation?

`RouteSpecification` is a value object describing origin, destination, and
arrival deadline. The existing `changeDestination(...)` implementation already
establishes the correct pattern: create a replacement specification, call
`Cargo.specifyNewRoute(...)`, and store the aggregate.

Proposed application-service shape:

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

Proposed implementation:

```java
Cargo cargo = cargoRepository.find(trackingId);
RouteSpecification specification = new RouteSpecification(
        cargo.getOrigin(),
        cargo.getRouteSpecification().getDestination(),
        deadline);
        
cargo.specifyNewRoute(specification);
cargoRepository.store(cargo);
```

Calling `specifyNewRoute(...)` is significant. It lets the aggregate recalculate
delivery and routing status relative to the new specification. Direct field
mutation or a persistence-only update would bypass that behavior.

**Recommendation:** Replace the `RouteSpecification` through
`Cargo.specifyNewRoute(...)`. Preserve origin, destination, and itinerary.
Persist using the existing repository. Do not add a deadline setter to the
domain model.

**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.

### 3.3 — What should happen to an existing itinerary and delivery state?

**Question:** When a routed cargo's deadline changes, should its itinerary be
cleared, retained, or recomputed?

Although the UI initially exposes the feature only for unrouted cargo, the
application operation should have deterministic domain behavior if invoked for
a routed cargo. The existing `changeDestination(...)` behavior preserves the
assigned itinerary and lets `Cargo.specifyNewRoute(...)` recalculate whether
that itinerary still satisfies the new specification.
````

</details>


---

<sub>54s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 221--1)

<details>
<summary>430 lines</summary>

````

The core application test should deliberately invoke the operation after:

1. booking a cargo;
2. requesting route candidates;
3. assigning an itinerary;
4. changing its destination;
5. changing its deadline.

This sequence verifies that the feature uses the aggregate correctly rather
than assuming the cargo always has an empty itinerary.

**Recommendation:** Preserve the itinerary. Let the domain model recompute
routing and delivery-derived state. Assert all unaffected fields explicitly in
`BookingServiceTest`.

**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.

### 3.4 — What type crosses the facade boundary?

**Question:** Should the booking facade accept a `Date`, a formatted string, or
a newly introduced request DTO?

The existing facade already uses `java.util.Date` for
`bookNewCargo(...)`. Introducing another representation for this one operation
would create unnecessary conversion code and depart from the historical
application style.

Proposed facade shape:

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

The implementation converts only the identifier:

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

**Recommendation:** Use `String` for the tracking ID and `java.util.Date` for
the deadline. Do not expose `TrackingId`, `Cargo`, or `RouteSpecification` to
the JSF layer and do not introduce a new DTO solely for this command.

**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.

### 3.5 — How is the DTO's formatted deadline converted for editing?

**Question:** `CargoRoute` exposes its deadline as formatted strings, while
`p:datePicker` binds naturally to `java.util.Date`. How should the backing bean
initialize the editor?

At the starting commit:

- `CargoRoute.getArrivalDeadline()` returns
  `MM/dd/yyyy hh:mm a z`.
- `CargoRoute.getArrivalDeadlineDate()` returns only the date component.
- The table displays `getArrivalDeadlineDate()`.

Options:

| Option | Approach | Trade-off |
|--------|----------|-----------|
| A | Parse `cargo.getArrivalDeadlineDate()` with `MM/dd/yyyy` | Small, localized change; preserves the existing DTO contract. |
| B | Add a `Date` property to `CargoRoute` | Cleaner typing, but broadens a DTO used throughout the application. |
| C | Reload the domain object in the backing bean | Violates the facade boundary. |

The formatter/parser must be created per operation or per view bean; do not add
a shared mutable `SimpleDateFormat`.

**Recommendation:** Option A. Load `CargoRoute` through
`BookingServiceFacade.loadCargoForRouting(trackingId)` and parse
`cargo.getArrivalDeadlineDate()` using `new SimpleDateFormat("MM/dd/yyyy")`.
Surface an explicit failure if the existing DTO value cannot be parsed; do not
silently submit a null date.

**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.

### 3.6 — Which JSF bean scopes and interaction pattern should be used?

**Question:** Should deadline editing introduce a new navigation page, use an
inline editor, or mirror the existing Change Destination dynamic-dialog
pattern?

The baseline already contains:

- `ChangeDestination`, a CDI `@Named` and JSF `@ViewScoped` editor bean;
- `ChangeDestinationDialog`, a session-scoped JSF managed bean that opens and
  closes a PrimeFaces dynamic dialog;
- `changeDestination.xhtml`, a dialog view;
- a `dialogReturn` Ajax listener that refreshes `tableNotRouted`.

Using the same pattern minimizes changes and provides a consistent user
experience.

Proposed bean names:

```text
changeArrivalDeadlineDate
changeArrivalDeadlineDateDialog
```

**Recommendation:** Add a serializable CDI `@Named @ViewScoped`
`ChangeArrivalDeadlineDate` editor and a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped`
launcher. Mirror the existing destination-dialog lifecycle rather than
introducing a new navigation or inline-edit framework.

**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.

### 3.7 — What is the dynamic-dialog contract?

**Question:** What path, request parameters, dimensions, and close result should
the PrimeFaces dialog use?

The launcher needs one parameter, `trackingId`, supplied as a
`Map<String, List<String>>`. The dialog metadata binds the parameter and invokes
the editor bean's `load()` action.

Proposed launcher contract:

```java
PrimeFaces.current().dialog().openDynamic(
        "/admin/dialogs/changeArrivalDeadlineDate.xhtml",
        options,
        params);
```

Required options:

| Option | Value |
|--------|-------|
| `modal` | `true` |
| `draggable` | `true` |
| `resizable` | `false` |
| `contentWidth` | `410` |
| `contentHeight` | `280` |

Required completion behavior:

- successful update: `closeDynamic("DONE")`;
- cancel: `closeDynamic("")`;
- caller listens for `dialogReturn` and updates `tableNotRouted`.

Because Open Liberty uses MyFaces, `<f:metadata>` must be a direct child of the
view root, before `<h:head>` and `<h:body>`. It must not be nested inside
`<h:body>`.

**Recommendation:** Use the contract above and preserve the metadata placement
required by the prepared baseline.

**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.

### 3.8 — What date validation is required?

**Question:** Must the new deadline be non-null, in the future, after the
current date, or after itinerary completion?

The requested feature is an administrative correction to an existing arrival
deadline. No new domain policy about future dates is part of the request.
Inventing such a rule could reject dates accepted by existing cargo booking or
`RouteSpecification` behavior.

The UI must nevertheless prevent a null submission because the operation
requires a concrete replacement deadline.

**Recommendation:** Require a date value in the JSF form and display a normal
Faces validation message when it is absent. Do not add a new minimum-date,
future-date, or itinerary-date business rule. Continue to rely on the existing
domain model for its established invariants.

**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.

### 3.9 — How will the feature be tested on the prepared historical baseline?

**Question:** Which automated and runtime tests are mandatory, given that the
historical JUnit/Arquillian suite is configured for a remote Payara 4
container, while the prepared production baseline runs on JDK 17/Open Liberty?

The starting POM deliberately leaves `skipTests=true`. The Open Liberty profile
builds and compiles all test sources but does not provide a Liberty Arquillian
adapter. Modernizing the entire integration-test runtime is outside this
feature's scope.

The feature still needs layered evidence:

1. Extend `BookingServiceTest` with the domain/application assertions that
   specify the deadline mutation.
2. Ensure all test sources compile as part of
   `./mvnw clean package -Popenliberty`.
3. Add focused JUnit tests for facade and backing-bean delegation where they
   can run without a container, using hand-written fakes rather than adding a
   mocking framework.
4. Perform mandatory end-to-end verification against the running Open Liberty
   application.
5. Preserve the existing Payara Arquillian test path; do not delete, disable,
   or rewrite it to manufacture a passing result.

**Spike needed:** Before Issue 1 implementation, run the starting commit's
standard Open Liberty package command and record whether tests are compiled but
skipped. Confirm the new `BookingServiceTest` method can be added without
expanding the runtime modernization scope.

**Recommendation:** Treat the JDK 17/Open Liberty build plus HTTP/UI acceptance
as the mandatory executable gate. Keep the historical Arquillian test as a
precise application-layer specification and run it only when its documented
Payara environment is available.

**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---

## Phase 4 — Implementation (five serial issues)

Implement these issues in order. Each issue should be a separate commit. Do not
start an issue until the previous issue's gating criteria are satisfied.

### 4.1 — Issue 1: Add the application-layer deadline change operation

**What to build**

Add the core use case to the application layer. This issue must contain no JSF
or PrimeFaces changes.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`
- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

**Required API**

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

**Required implementation behavior**

1. Load the cargo using `cargoRepository.find(trackingId)`.
2. Obtain the current destination from
   `cargo.getRouteSpecification().getDestination()`.
3. Construct a replacement `RouteSpecification` from:
   - `cargo.getOrigin()`;
   - the current destination;
   - the new deadline.
4. Apply it using `cargo.specifyNewRoute(routeSpecification)`.
5. Persist using `cargoRepository.store(cargo)`.
6. Log the tracking ID and new deadline at `Level.INFO`, following the style of
   `changeDestination(...)`.

Do not:

- add a setter to `Cargo` or `RouteSpecification`;
- modify the origin or destination;
- clear or replace the itinerary directly;
- update persistence entities behind the aggregate's back.

**Tests to write first**

Append a sequential `testChangeDeadline()` case to `BookingServiceTest` after
`testChangeDestination()`. Build a new deadline one month after the test's
original `deadline`, invoke the service, reload the cargo with
`Cargo.findByTrackingId`, and assert:

- origin remains Chicago;
- destination remains Helsinki;
- stored deadline is the same calendar day as the requested new deadline;
- assigned itinerary remains unchanged;
- transport status remains `NOT_RECEIVED`;
- last known location remains `Location.UNKNOWN`;
- current voyage remains `Voyage.NONE`;
- cargo is not marked misdirected;
- estimated time of arrival is `Delivery.ETA_UNKOWN`;
- next expected activity is `Delivery.NO_ACTIVITY`;
- cargo is not unloaded at destination;
- routing status reflects the domain model's recalculation and remains
  `MISROUTED` for the established test sequence.

**Gating criteria**

- The test source compiles.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- No web, facade, REST, Liberty, or persistence configuration files change in
  this issue.

### 4.2 — Issue 2: Expose deadline changes through the booking facade

**What to build**

Expose the use case to presentation clients without leaking domain identifier
types into the web layer.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`

**Optional focused test file**

- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`

**Required API**

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

**Required implementation**

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

The facade must not:

- load and mutate `Cargo` itself;
- call `CargoRepository.store(...)`;
- parse a formatted date;
- introduce JSF or PrimeFaces types.

**Tests**

Where a container-free test is added, use a hand-written `BookingService` fake
or spy and prove that:

- the same `Date` object/value reaches the application service;
- the tracking-ID string is converted to an equivalent `TrackingId`;
- the facade delegates exactly once;
- no repository work is duplicated in the facade.

Do not add Mockito or another dependency solely for this test.

**Gating criteria**

- Existing facade consumers still compile.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- The application-layer test added in Issue 1 remains unchanged and compiling.

### 4.3 — Issue 3: Implement the deadline editor backing model

**What to build**

Add the view-scoped backing bean that loads a cargo's current deadline and
submits a replacement deadline through the booking facade. Do not add the
dialog launcher or XHTML in this issue.

**File to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`

**Required bean shape**

```java
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;
}
```

Required properties and methods:

- `getTrackingId()` / `setTrackingId(String)`
- `getCargo()`
- `getArrivalDeadlineDate()` / `setArrivalDeadlineDate(Date)`
- `load()`
- `changeArrivalDeadline()`

**Load behavior**

1. Call `bookingServiceFacade.loadCargoForRouting(trackingId)`.
2. Store the returned `CargoRoute`.
3. Parse `cargo.getArrivalDeadlineDate()` using `MM/dd/yyyy`.
4. Store the resulting `Date` in `arrivalDeadlineDate`.
5. Do not query a repository or domain object directly.
6. Do not ignore a parsing failure or merely print its stack trace. Surface a
   clear application/view error consistent with existing JSF behavior.

**Submit behavior**

1. Refuse a null date through JSF validation or explicit bean validation.
2. Call
   `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`.
3. Close the dynamic dialog with:

   ```java
   PrimeFaces.current().dialog().closeDynamic("DONE");
   ```

4. Do not close the dialog if the facade call fails.

**Tests to write**

Add a container-free JUnit test if practical, using a hand-written fake facade,
that proves:

- `load()` requests the correct tracking ID;
- `load()` converts an `MM/dd/yyyy` DTO date into the editable `Date`;
- `changeArrivalDeadline()` delegates the selected date and tracking ID;
- a malformed DTO deadline is surfaced rather than converted to null;
- a null selected date is rejected.

Do not add a mocking framework solely for these tests.

**Gating criteria**

- The bean is serializable and uses the established CDI/JSF annotations.
- The bean references only facade DTOs, not domain model classes.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.

### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog

**What to build**

Add the session-scoped dialog launcher and the dynamic dialog view. The dialog
must work when addressed directly with a `trackingId` query parameter, but it
is not yet linked from the dashboard in this issue.

**Files to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`

**Launcher requirements**

Use:

```java
@ManagedBean(name = "changeArrivalDeadlineDateDialog")
@SessionScoped
```

Implement:

- `showDialog(String trackingId)`
- `handleReturn(SelectEvent event)`
- `cancel()`

`showDialog(...)` must:

- set the options documented in Question 3.7;
- pass `trackingId` as a dynamic-dialog request parameter;
- open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`.

`cancel()` must close the dialog without invoking the facade.

**XHTML requirements**

The page title must be:

```xhtml
<title>Change Deadline</title>
```

Place metadata directly beneath the root `<html>` element and before
`<h:head>`:

```xhtml
<f:metadata>
    <f:viewParam name="trackingId"
                 value="#{changeArrivalDeadlineDate.trackingId}"/>
    <f:viewAction action="#{changeArrivalDeadlineDate.load}"/>
</f:metadata>
```

The form must display:

- `Origin:` and `changeArrivalDeadlineDate.cargo.originName`;
- `Destination:` and
  `changeArrivalDeadlineDate.cargo.finalDestinationName`;
- `Deadline:` and a `p:datePicker` bound to
  `changeArrivalDeadlineDate.arrivalDeadlineDate`;
- **Cancel**, invoking
  `changeArrivalDeadlineDateDialog.cancel()`;
- **Update**, invoking
  `changeArrivalDeadlineDate.changeArrivalDeadline()`.

The date picker must require a value. The Update action must reload or refresh
the calling Administration view after a successful dialog close, following the
existing destination-dialog behavior.

**Runtime tests**

With the application running, request:

```text
http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789
```

Verify:

- HTTP 200;
- title is **Change Deadline**;
- origin and destination render;
- the existing deadline is selected;
- no `TagException`, `Parent UIComponent`, `FacesException`, or server error is
  present;
- Cancel does not change the persisted deadline;
- Update changes the deadline.

**Gating criteria**

- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
- Direct dialog loading and both actions work.
- Destination editing continues to work.
- Stop Liberty cleanly before completing the issue.

### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard

**What to build**

Replace the plain deadline text in the Not Routed Cargo table with the
PrimeFaces command-link affordance that opens the completed dialog and refreshes
the table after return.

**File to modify**

- `src/main/webapp/admin/tables/listNotRouted.xhtml`

**Required UI shape**

Within the existing Deadline column, add a `p:commandLink` that:

- calls
  `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;
- retains the displayed
  `cargoNotRo

[Output truncated. Use view_range=[812, ...] to continue reading. In your next response, you may batch this with other view calls. File has at least 910 lines.]
````

</details>


---

<sub>53s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\shepherd-campaign.json.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\shepherd-campaign.json

<details>
<summary>12 lines</summary>

```
{
  "schemaVersion": 1,
  "campaignId": "5426f64c-a653-4ff1-ba39-00209a83cdb4",
  "campaignIssueNumber": 3,
  "campaignShortname": "arrival-deadline-treatment",
  "repository": "edburns/dd-3058828-01-cargotracker",
  "baseBranch": "experiment/shepherd-treatment",
  "lessonPropagation": "campaign",
  "campaignMetadataDirectory": "3-arrival-deadline-treatment-remove-before-merge",
  "lessonsFile": "campaign-lessons.md",
  "createdAt": "2026-09-03T00:54:16Z"
}
```

</details>


---

<sub>54s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\campaign-lessons.md.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\campaign-lessons.md

<details>
<summary>5 lines</summary>

```
# Campaign lessons

This file contains validated, reusable lessons for subsequent issues in this campaign.
The issue specification and repository instructions remain authoritative.

## Validated lessons

No validated lessons have been recorded yet.
```

</details>


---

<sub>55s</sub>

### `powershell`

**Verify base-branch campaign files and headings**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $branch='experiment/shepherd-treatment'; $plan='3-arrival-deadline-treatment-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'; $campaign='3-arrival-deadline-treatment-remove-before-merge/shepherd-campaign.json'; $lessons='3-arrival-deadline-treatment-remove-before-merge/campaign-lessons.md'; git cat-file -e \"$branch`:$plan\"; git cat-file -e \"$branch`:$campaign\"; git cat-file -e \"$branch`:$lessons\"; $basePlan = git show \"$branch`:$plan\" | Out-String; $localPlan = [IO.File]::ReadAllText((Join-Path (Get-Location) ($plan -replace '/','\\'))); $normBase=($basePlan -replace \"`r`n\",\"`n\").TrimEnd(\"`n\"); $normLocal=($localPlan -replace \"`r`n\",\"`n\").TrimEnd(\"`n\"); if($normBase -cne $normLocal){ throw 'Local plan differs from BASE_BRANCH' }; $qh='## Phase 3 — Ignorance reduction: questions to answer before writing code'; $ih='## Phase 4 — Implementation (five serial issues)'; \"questionsHeadingCount=$(([regex]::Matches($normBase,[regex]::Escape($qh))).Count)\"; \"implementationHeadingCount=$(([regex]::Matches($normBase,[regex]::Escape($ih))).Count)\"; git show \"$branch`:$campaign\"",
  "description": "Verify base-branch campaign files and headings",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>15 lines</summary>

```
questionsHeadingCount=1
implementationHeadingCount=1
{
  "schemaVersion": 1,
  "campaignId": "5426f64c-a653-4ff1-ba39-00209a83cdb4",
  "campaignIssueNumber": 3,
  "campaignShortname": "arrival-deadline-treatment",
  "repository": "edburns/dd-3058828-01-cargotracker",
  "baseBranch": "experiment/shepherd-treatment",
  "lessonPropagation": "campaign",
  "campaignMetadataDirectory": "3-arrival-deadline-treatment-remove-before-merge",
  "lessonsFile": "campaign-lessons.md",
  "createdAt": "2026-09-03T00:54:16Z"
}
<shellId: 2 completed with exit code 0>
```

</details>


---

<sub>1m 1s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 812-940)

<details>
<summary>79 lines</summary>

````
- adds the existing Font Awesome edit icon style;
- uses a stable component ID such as `arrivalDeadlineToUpdate`;
- listens for `dialogReturn`;
- invokes
  `changeArrivalDeadlineDateDialog.handleReturn`;
- updates `tableNotRouted`;
- provides the tooltip:
  `Click to change cargo arrival deadline date.`

Follow the adjacent Destination column's established structure and styling. Do
not alter tracking-ID routing or destination editing.

**End-to-end acceptance test**

1. Start from a clean build on JDK 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Confirm the home page returns HTTP 200.
3. Open Administration and locate `DEF789`.
4. Record the original deadline.
5. Confirm the deadline now has an edit icon and tooltip.
6. Open the deadline dialog.
7. Confirm origin and destination identify the same cargo.
8. Choose a visibly different date.
9. Press **Update**.
10. Confirm the dialog closes and the Not Routed Cargo table refreshes.
11. Confirm the table shows the selected date.
12. Reload the browser and confirm the selected date remains.
13. Reopen the dialog and confirm the editor initializes to the changed date.
14. Press **Cancel** and confirm no additional change occurs.
15. Verify the Destination edit dialog still opens.
16. Verify selecting `DEF789` for routing still loads without an error page.

**Log acceptance**

The final run must contain none of:

- `<f:metadata> Parent UIComponent`;
- `TagException`;
- `VerifyError`;
- `FacesException`;
- `CWWKZ0002E` or `CWWKZ0003E`;
- recurring batch authorization failures;
- new FFDC files attributable to this feature.

Transient JMS activation-order warnings are acceptable only if all message
endpoints subsequently activate, as established by the prepared baseline.

**Final regression and scope checks**

- `./mvnw clean package -Popenliberty` succeeds.
- The existing test sources and the new deadline test compile.
- No Java EE namespace migration occurred.
- No Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST
  compatibility fix from the starting commit was reverted.
- The feature affects only the intended application, facade, web, dialog,
  table, and test surfaces.
- Stop Liberty cleanly.

---

## Phase 5 — Documentation and implementation handoff

- Update `README.md` only if user-facing Administration capabilities are
  enumerated there; add one concise sentence that administrators can change an
  unrouted cargo's arrival deadline.
- Record the exact JDK 17 run command in the final issue or pull-request
  description:

  ```bash
  ./mvnw clean package -Popenliberty liberty:run
  ```

- Include `DEF789` and the before/after deadline values in the acceptance
  evidence.
- State explicitly that data is in-memory and resets when the application is
  rebuilt/restarted.

---

## Cross-cutting concerns

| Concern | Required treatment |
|---------|--------------------|
| Domain-driven design | Mutate the aggregate through `Cargo.specifyNewRoute(...)`; do not bypass it with persistence-level field updates. |
| Layering | Web bean → booking facade → booking service → cargo repository. |
| Date handling | Use `java.util.Date` at service/facade boundaries and `MM/dd/yyyy` for the date-only editor representation. |
| Time zones | Acceptance compares the calendar date displayed by the application; do not introduce a new timezone policy in this feature. |
| Error handling | Do not silently swallow parse, lookup, validation, or persistence failures. A failed update must not look successful. |
| JSF compatibility | Keep `<f:metadata>` at view-root scope for MyFaces. |
| Bean lifecycle | Editor is CDI `@ViewScoped`; dynamic-dialog launcher mirrors the existing session-scoped JSF managed bean. |
| Accessibility | Preserve visible labels; the date editor must have an associated label and validation feedback. |
| Backward compatibility | Existing destination editing, routing, tracking, REST, messaging, batch, and startup behavior must remain intact. |
| Test discipline | Add tests before production code where practical; every issue must preserve all prior gates. |
| Experiment integrity | Implement from this specification starting at `9b9f311b2a3a2854bdac947593950d9edb6bca7d`; do not cherry-pick or inspect feature-bearing commits. |
````

</details>


---

<sub>1m 1s</sub>

### `rg`

**^### 4\.[0-9]+**

"^### 4\.[0-9]+" in add-change-arrival-deadline-feature-ignorance-reduction-plan.md (3-arrival-deadline-treatment-remove-before-merge)

```
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:### 4.1 — Issue 1: Add the application-layer deadline change operation
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:### 4.2 — Issue 2: Expose deadline changes through the booking facade
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:### 4.3 — Issue 3: Implement the deadline editor backing model
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard
```


---

<sub>1m 2s</sub>

### `rg`

**^\*\*Resolution:\*\***

"^\*\*Resolution:\*\*" in add-change-arrival-deadline-feature-ignorance-reduction-plan.md (3-arrival-deadline-treatment-remove-before-merge)

<details>
<summary>9 matches</summary>

```
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md:**Resolution:**
```

</details>


---

<sub>1m 5s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md (lines 780-830)

<details>
<summary>37 lines</summary>

````
- no `TagException`, `Parent UIComponent`, `FacesException`, or server error is
  present;
- Cancel does not change the persisted deadline;
- Update changes the deadline.

**Gating criteria**

- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
- Direct dialog loading and both actions work.
- Destination editing continues to work.
- Stop Liberty cleanly before completing the issue.

### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard

**What to build**

Replace the plain deadline text in the Not Routed Cargo table with the
PrimeFaces command-link affordance that opens the completed dialog and refreshes
the table after return.

**File to modify**

- `src/main/webapp/admin/tables/listNotRouted.xhtml`

**Required UI shape**

Within the existing Deadline column, add a `p:commandLink` that:

- calls
  `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;
- retains the displayed
  `cargoNotRouted.arrivalDeadlineDate`;
- adds the existing Font Awesome edit icon style;
- uses a stable component ID such as `arrivalDeadlineToUpdate`;
- listens for `dialogReturn`;
- invokes
  `changeArrivalDeadlineDateDialog.handleReturn`;
- updates `tableNotRouted`;
- provides the tooltip:
  `Click to change cargo arrival deadline date.`

Follow the adjacent Destination column's established structure and styling. Do
not alter tracking-ID routing or destination editing.

**End-to-end acceptance test**

1. Start from a clean build on JDK 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```
````

</details>


---

<sub>1m 10s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1

<details>
<summary>59 lines</summary>

```
<#
.SYNOPSIS
    Validates persisted stage-20 issue bodies before GitHub mutation.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory)]
    [string]$BodyDirectory,

    [Parameter(Mandatory)]
    [ValidateRange(1, [int]::MaxValue)]
    [int]$ExpectedCount,

    [Parameter(Mandatory)]
    [ValidateSet('off', 'campaign')]
    [string]$LessonPropagation
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

if (-not (Test-Path -LiteralPath $BodyDirectory -PathType Container)) {
    throw "Stage-20 body directory does not exist: $BodyDirectory"
}

$bodyFiles = @(
    Get-ChildItem -LiteralPath $BodyDirectory -Filter '*-body.md' -File |
        Where-Object { $_.Name -notlike '*-observed-body.md' } |
        Sort-Object Name
)
if ($bodyFiles.Count -ne $ExpectedCount) {
    throw "Expected $ExpectedCount persisted stage-20 body files; found $($bodyFiles.Count)."
}

$requiredHeadings = @(
    '## Campaign context and required reading',
    '## Branch and execution order',
    '## Implement',
    '## Completion gates',
    '## Out of scope'
)

foreach ($bodyFile in $bodyFiles) {
    $text = [System.IO.File]::ReadAllText($bodyFile.FullName)
    $lines = [System.IO.File]::ReadAllLines($bodyFile.FullName)
    if ([string]::IsNullOrWhiteSpace($text) -or $text -notmatch "`r?`n" -or $lines.Count -le 1) {
        throw "Persisted issue body must contain physical Markdown lines: $($bodyFile.FullName)"
    }

    $firstNonblank = $lines | Where-Object { -not [string]::IsNullOrWhiteSpace($_) } | Select-Object -First 1
    if ($firstNonblank -notmatch '^##\s+\S') {
        throw "Persisted issue body must begin with a level-two heading: $($bodyFile.FullName)"
    }

    foreach ($heading in $requiredHeadings) {
        if ($lines -cnotcontains $heading) {
            throw "Persisted issue body is missing the physical heading '$heading': $($bodyFile.FullName)"
        }
    }

    $hasCampaignLessons = $lines -ccontains '## Campaign lessons (REQUIRED)'
    if ($LessonPropagation -eq 'campaign' -and -not $hasCampaignLessons) {
        throw "Treatment issue body is missing its campaign-lessons heading: $($bodyFile.FullName)"
    }
    if ($LessonPropagation -eq 'off' -and $hasCampaignLessons) {
        throw "Control issue body unexpectedly contains a campaign-lessons heading: $($bodyFile.FullName)"
    }
}

$bodyFiles
```

</details>


---

<sub>1m 12s</sub>

### Copilot

All nine implementation-gating questions have substantive resolution blocks, and the plan yields exactly five serial tasks. I’m now persisting the complete issue specifications and running the mandated pre-mutation validator.

---

<sub>2m 13s</sub>

### `apply_patch`

<details>
<summary>Arguments</summary>

````json
"*** Begin Patch\n*** Add File: 3-arrival-deadline-treatment-remove-before-merge/prompts/shepherd-task-20-20260902-1754/issue-bodies/01-4-1-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-treatment` branch, the directory `3-arrival-deadline-treatment-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`\n+- `### User-visible acceptance behavior`\n+- `### Domain acceptance behavior`\n+- `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.3 — What should happen to an existing itinerary and delivery state?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.1 — Issue 1: Add the application-layer deadline change operation`\n+- `## Cross-cutting concerns`\n+\n+The controlling resolutions are concrete: add `BookingService.changeDeadline(TrackingId, Date)`; load the cargo, create a replacement `RouteSpecification` with the existing origin, existing destination, and supplied deadline; call `Cargo.specifyNewRoute(...)`; and store through `CargoRepository`. Preserve the itinerary and let the aggregate recalculate delivery and routing state. In the established test sequence the itinerary remains unchanged and routing status remains `MISROUTED`. Require a non-null date at the UI boundary later, but add no new chronological business rule.\n+\n+Research established that the prepared Open Liberty build compiles the sequential Arquillian test sources while retaining historical `skipTests=true`; executing those tests still requires the documented remote Payara environment. Do not modernize Arquillian or add a mocking dependency. Implement production code from the specification rather than copying feature-bearing commits or research code.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-treatment` from remote `origin` as the PR base branch. This is serial task 1 of 5. Tasks are assigned, completed, and merged to the base branch in plan order. Do not start until this issue is assigned; the next task must not start until this task is complete, gated, and merged.\n+\n+Begin from the prepared feature-absent lineage identified in the plan. Preserve Java EE 7, `javax.*`, Java 7 source compatibility, JDK 17 execution, Open Liberty, and in-memory Derby.\n+\n+## Implement\n+\n+Modify only:\n+\n+- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`\n+- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`\n+- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`\n+\n+Add this application API:\n+\n+```java\n+void changeDeadline(TrackingId trackingId, Date deadline);\n+```\n+\n+Implement it by:\n+\n+1. Loading with `cargoRepository.find(trackingId)`.\n+2. Reading the current destination from `cargo.getRouteSpecification().getDestination()`.\n+3. Constructing a replacement `RouteSpecification` from `cargo.getOrigin()`, the current destination, and the supplied deadline.\n+4. Applying it with `cargo.specifyNewRoute(routeSpecification)`.\n+5. Persisting with `cargoRepository.store(cargo)`.\n+6. Logging tracking ID and deadline at `Level.INFO` in the established `changeDestination(...)` style.\n+\n+Write the test first. Append sequential `testChangeDeadline()` after `testChangeDestination()`. Advance the original test deadline by one month, invoke the new service method, reload with `Cargo.findByTrackingId`, and assert:\n+\n+- origin remains Chicago and destination remains Helsinki;\n+- the stored deadline is the same calendar day as requested;\n+- the assigned itinerary is unchanged;\n+- transport status is `NOT_RECEIVED`;\n+- last known location is `Location.UNKNOWN`;\n+- current voyage is `Voyage.NONE`;\n+- the cargo is not misdirected;\n+- ETA is `Delivery.ETA_UNKOWN`;\n+- next expected activity is `Delivery.NO_ACTIVITY`;\n+- the cargo is not unloaded at destination;\n+- routing status remains `MISROUTED`.\n+\n+## Completion gates\n+\n+- The new test source compiles in the prepared historical configuration.\n+- On JDK 17, `./mvnw clean package -Popenliberty` succeeds.\n+- Existing destination-change behavior remains intact.\n+- The diff contains no web, facade, REST, Liberty, Derby, messaging, batch, or persistence-configuration change.\n+- The test proves both the changed deadline and every preserved/recalculated field listed above, preventing facade and UI work from being built on an incorrect aggregate mutation.\n+\n+## Out of scope\n+\n+Do not add JSF, PrimeFaces, facade, REST, or dashboard changes. Do not add a mutable deadline setter, mutate persistence state behind the aggregate, clear or replace the itinerary, alter origin or destination, reroute the cargo, add chronological deadline policy, modernize Arquillian, migrate namespaces/frameworks, or inspect/cherry-pick feature-bearing commits.\n+\n+## Campaign lessons (REQUIRED)\n+\n+Campaign ID: `5426f64c-a653-4ff1-ba39-00209a83cdb4`.\n+\n+Before implementation, read `3-arrival-deadline-treatment-remove-before-merge/campaign-lessons.md` from `experiment/shepherd-treatment`.\n+Treat only entries under `Validated lessons` as advisory context; the issue specification and repository instructions remain authoritative.\n+\n+Before declaring the task complete, update that same file in this PR by adding a\n+`Candidate lessons for issue #<this issue's actual number>` section. Record only concise,\n+reusable repository discoveries, failed approaches worth avoiding, commands\n+that actually passed, and non-obvious constraints. Include applicability and\n+evidence. Do not include raw reasoning, secrets, complete trajectories, or\n+speculation. Preserve all existing validated lessons.\n*** Add File: 3-arrival-deadline-treatment-remove-before-merge/prompts/shepherd-task-20-20260902-1754/issue-bodies/02-4-2-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-treatment` branch, the directory `3-arrival-deadline-treatment-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then carefully re-read these exact sections:\n+\n+- `## Goal`\n+- `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.2 — Issue 2: Expose deadline changes through the booking facade`\n+- `## Cross-cutting concerns`\n+\n+The resolved facade contract is `void changeDeadline(String trackingId, Date arrivalDeadline)`. `DefaultBookingServiceFacade` converts only the identifier with `new TrackingId(trackingId)` and passes the same `Date` to the application service. The aggregate mutation belongs exclusively to `BookingService`: the facade must not load a cargo, access a repository, parse formatted dates, or expose domain types. No new chronological deadline rule is permitted.\n+\n+Research established that Open Liberty packaging compiles tests but the historical default skips Arquillian execution; a focused container-free test may use a hand-written fake, but no mocking dependency or test-runtime modernization is justified.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-treatment` from remote `origin` as the PR base branch. This is serial task 2 of 5 and depends on task 1 being merged. Tasks are assigned, completed, and merged to the base branch in plan order. Do not start until assigned and until the application-layer operation and its complete state-preservation test are present on the base branch.\n+\n+## Implement\n+\n+Modify:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`\n+\n+Optionally add:\n+\n+- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`\n+\n+Add:\n+\n+```java\n+void changeDeadline(String trackingId, Date arrivalDeadline);\n+```\n+\n+Delegate exactly as follows in behavior:\n+\n+```java\n+bookingService.changeDeadline(\n+        new TrackingId(trackingId),\n+        arrivalDeadline);\n+```\n+\n+Follow existing facade conventions and imports. If a focused test is practical without a container, use a hand-written `BookingService` fake/spy to prove that the tracking-ID string becomes an equivalent `TrackingId`, the same date object/value reaches the application service, delegation occurs exactly once, and no repository mutation is duplicated in the facade.\n+\n+## Completion gates\n+\n+- Existing facade consumers compile unchanged.\n+- On JDK 17, `./mvnw clean package -Popenliberty` succeeds.\n+- The application-layer test from task 1 remains unchanged and compiles.\n+- A focused test, if added, discriminates identifier conversion and single delegation from accidental duplicate domain/repository work.\n+- The production diff remains confined to the facade boundary (plus the optional focused test).\n+\n+## Out of scope\n+\n+Do not load or mutate `Cargo`, call `CargoRepository`, parse dates, introduce a request DTO, add formatted-string date parameters, expose `TrackingId` to the web layer, use JSF/PrimeFaces types, change the application-layer test, add dependencies, modernize Arquillian, or alter runtime/persistence configuration.\n+\n+## Campaign lessons (REQUIRED)\n+\n+Campaign ID: `5426f64c-a653-4ff1-ba39-00209a83cdb4`.\n+\n+Before implementation, read `3-arrival-deadline-treatment-remove-before-merge/campaign-lessons.md` from `experiment/shepherd-treatment`.\n+Treat only entries under `Validated lessons` as advisory context; the issue specification and repository instructions remain authoritative.\n+\n+Before declaring the task complete, update that same file in this PR by adding a\n+`Candidate lessons for issue #<this issue's actual number>` section. Record only concise,\n+reusable repository discoveries, failed approaches worth avoiding, commands\n+that actually passed, and non-obvious constraints. Include applicability and\n+evidence. Do not include raw reasoning, secrets, complete trajectories, or\n+speculation. Preserve all existing validated lessons.\n*** Add File: 3-arrival-deadline-treatment-remove-before-merge/prompts/shepherd-task-20-20260902-1754/issue-bodies/03-4-3-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-treatment` branch, the directory `3-arrival-deadline-treatment-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then carefully re-read:\n+\n+- `## Goal`\n+- `### Hard scope constraints`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.3 — Issue 3: Implement the deadline editor backing model`\n+- `## Cross-cutting concerns`\n+\n+Resolved decisions: use a serializable CDI `@Named @ViewScoped` editor. Keep the web layer behind `BookingServiceFacade`; use `String` and `java.util.Date`, not domain types. Load `CargoRoute` through `loadCargoForRouting(trackingId)`, parse its `MM/dd/yyyy` date with a per-load `SimpleDateFormat`, and surface malformed data explicitly. Require a non-null selection but add no future/relative-date rule. Successful submission delegates to the facade and closes with `\"DONE\"`; a failed submission must not look successful.\n+\n+The research finding is that container-free tests should use hand-written fakes where practical; do not add Mockito or modernize the historical Arquillian runtime.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-treatment` from remote `origin` as the PR base branch. This is serial task 3 of 5 and depends on tasks 1 and 2 being merged. Tasks are assigned, completed, and merged to the base branch in plan order. Do not start until assigned and the application and facade APIs exist on the base branch.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`\n+\n+Implement a serializable CDI `@Named @ViewScoped` bean with `serialVersionUID = 1L`, fields for `String trackingId`, `CargoRoute cargo`, `Date arrivalDeadlineDate`, and an injected `BookingServiceFacade`.\n+\n+Provide:\n+\n+- `getTrackingId()` / `setTrackingId(String)`\n+- `getCargo()`\n+- `getArrivalDeadlineDate()` / `setArrivalDeadlineDate(Date)`\n+- `load()`\n+- `changeArrivalDeadline()`\n+\n+`load()` must request the cargo through `bookingServiceFacade.loadCargoForRouting(trackingId)`, retain the returned DTO, parse `cargo.getArrivalDeadlineDate()` with a newly created `SimpleDateFormat(\"MM/dd/yyyy\")`, and store the editable date. Do not directly query domain or persistence objects. A parsing error must become a clear application/view failure consistent with repository JSF behavior; do not print-and-continue or produce a null editor value.\n+\n+`changeArrivalDeadline()` must reject a null selection, call `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`, and only after successful return call:\n+\n+```java\n+PrimeFaces.current().dialog().closeDynamic(\"DONE\");\n+```\n+\n+Add a focused container-free JUnit test if practical using a hand-written fake facade. Cover correct tracking-ID loading, date-only parsing, exact submit delegation, malformed DTO data, and null selection.\n+\n+## Completion gates\n+\n+- The bean is serializable and uses the established CDI/JSF annotations and repository error-handling conventions.\n+- It references facade types only, never domain or repository types.\n+- Malformed DTO dates and null selections are observable failures; neither can trigger facade mutation or successful dialog closure.\n+- A focused test, if feasible, discriminates `MM/dd/yyyy` conversion and prevents silent-null regression.\n+- On JDK 17, `./mvnw clean package -Popenliberty` succeeds and all prior task tests still compile.\n+\n+## Out of scope\n+\n+Do not create the launcher or XHTML, edit the dashboard, query repositories/domain objects, broaden `CargoRoute`, add shared mutable formatters, introduce a new DTO or date policy, add mocking dependencies, swallow exceptions, or close the dialog after a facade failure.\n+\n+## Campaign lessons (REQUIRED)\n+\n+Campaign ID: `5426f64c-a653-4ff1-ba39-00209a83cdb4`.\n+\n+Before implementation, read `3-arrival-deadline-treatment-remove-before-merge/campaign-lessons.md` from `experiment/shepherd-treatment`.\n+Treat only entries under `Validated lessons` as advisory context; the issue specification and repository instructions remain authoritative.\n+\n+Before declaring the task complete, update that same file in this PR by adding a\n+`Candidate lessons for issue #<this issue's actual number>` section. Record only concise,\n+reusable repository discoveries, failed approaches worth avoiding, commands\n+that actually passed, and non-obvious constraints. Include applicability and\n+evidence. Do not include raw reasoning, secrets, complete trajectories, or\n+speculation. Preserve all existing validated lessons.\n*** Add File: 3-arrival-deadline-treatment-remove-before-merge/prompts/shepherd-task-20-20260902-1754/issue-bodies/04-4-4-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-treatment` branch, the directory `3-arrival-deadline-treatment-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then carefully re-read:\n+\n+- `### User-visible acceptance behavior`\n+- `### Hard scope constraints`\n+- `### Phase 2 ✅ — Verify the before and after user experience`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog`\n+- `## Cross-cutting concerns`\n+\n+Resolved decisions: mirror the existing Change Destination interaction with a serializable session-scoped JSF managed launcher and the view-scoped editor from task 3. Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with one `trackingId` parameter; use modal/draggable `true`, resizable `false`, width `410`, and height `280`. Success closes with `\"DONE\"` and cancellation with `\"\"`. Require a date but impose no chronological policy.\n+\n+The prepared MyFaces baseline requires `<f:metadata>` directly beneath root `<html>`, before `<h:head>` and `<h:body>`; nesting metadata in the body causes component-parent failures. Research also established that Open Liberty runtime/HTTP/UI checks are mandatory because the historical Arquillian suite is compiled but skipped by default.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-treatment` from remote `origin` as the PR base branch. This is serial task 4 of 5 and depends on tasks 1–3 being merged. Tasks are assigned, completed, and merged to the base branch in plan order. Do not start until assigned and the tested editor bean is on the base branch.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`\n+- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`\n+\n+The serializable launcher must use:\n+\n+```java\n+@ManagedBean(name = \"changeArrivalDeadlineDateDialog\")\n+@SessionScoped\n+```\n+\n+Implement `showDialog(String trackingId)`, `handleReturn(SelectEvent event)`, and `cancel()`. `showDialog` passes `trackingId` as `Map<String,List<String>>`, sets the exact options above, and opens the exact dialog path. `cancel()` invokes no facade work and closes with the empty string.\n+\n+The XHTML title is `Change Deadline`. Put this metadata directly under root `<html>` before the head:\n+\n+```xhtml\n+<f:metadata>\n+    <f:viewParam name=\"trackingId\"\n+                 value=\"#{changeArrivalDeadlineDate.trackingId}\"/>\n+    <f:viewAction action=\"#{changeArrivalDeadlineDate.load}\"/>\n+</f:metadata>\n+```\n+\n+Display labeled, read-only origin and destination using `cargo.originName` and `cargo.finalDestinationName`; bind a required `p:datePicker` to `arrivalDeadlineDate` with visible validation feedback; add Cancel calling the launcher and Update calling the editor. Preserve the established destination-dialog lifecycle so successful return can refresh Administration.\n+\n+## Completion gates\n+\n+- On JDK 17, `./mvnw clean package -Popenliberty liberty:run` starts successfully.\n+- Direct request to `/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789` returns HTTP 200, has title **Change Deadline**, renders origin/destination, and selects the current deadline.\n+- No `TagException`, `<f:metadata> Parent UIComponent`, `FacesException`, or server error occurs.\n+- Cancel leaves the persisted deadline unchanged; Update changes it and closes only after success.\n+- Destination editing still works.\n+- Liberty is stopped cleanly before completion.\n+\n+## Out of scope\n+\n+Do not integrate the dashboard command link yet, change destination editing, introduce navigation/inline editing, move metadata into the body, add date business rules, bypass the editor/facade, modernize Arquillian, add dependencies, or alter Liberty/Derby/runtime compatibility configuration.\n+\n+## Campaign lessons (REQUIRED)\n+\n+Campaign ID: `5426f64c-a653-4ff1-ba39-00209a83cdb4`.\n+\n+Before implementation, read `3-arrival-deadline-treatment-remove-before-merge/campaign-lessons.md` from `experiment/shepherd-treatment`.\n+Treat only entries under `Validated lessons` as advisory context; the issue specification and repository instructions remain authoritative.\n+\n+Before declaring the task complete, update that same file in this PR by adding a\n+`Candidate lessons for issue #<this issue's actual number>` section. Record only concise,\n+reusable repository discoveries, failed approaches worth avoiding, commands\n+that actually passed, and non-obvious constraints. Include applicability and\n+evidence. Do not include raw reasoning, secrets, complete trajectories, or\n+speculation. Preserve all existing validated lessons.\n*** Add File: 3-arrival-deadline-treatment-remove-before-merge/prompts/shepherd-task-20-20260902-1754/issue-bodies/05-4-5-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-treatment` branch, the directory `3-arrival-deadline-treatment-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then carefully re-read:\n+\n+- `## Goal`\n+- `### User-visible acceptance behavior`\n+- `### Domain acceptance behavior`\n+- `### Hard scope constraints`\n+- `### Phase 2 ✅ — Verify the before and after user experience`\n+- `### 3.1 — Which cargos expose the edit operation?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard`\n+- `## Phase 5 — Documentation and implementation handoff`\n+- `## Cross-cutting concerns`\n+\n+The UI-scope resolution is Option A: expose editing only in `listNotRouted.xhtml`; application/facade APIs remain generally callable and must not encode table membership. Mirror the existing destination dynamic-dialog pattern. Successful return is `\"DONE\"`, cancellation is `\"\"`, the caller handles `dialogReturn`, and only `tableNotRouted` is updated. The selected date is required, but no future/relative-date rule is added.\n+\n+Runtime research established that the mandatory executable evidence is JDK 17 Open Liberty package/start, direct HTTP checks, and the complete `DEF789` browser flow. The historical Arquillian path remains compiled but skipped by default and must not be rewritten merely to manufacture a passing test.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-treatment` from remote `origin` as the PR base branch. This is serial task 5 of 5 and depends on tasks 1–4 being merged. Tasks are assigned, completed, and merged to the base branch in plan order. Do not start until assigned and the complete dialog works directly on the base branch.\n+\n+## Implement\n+\n+Modify only:\n+\n+- `src/main/webapp/admin/tables/listNotRouted.xhtml`\n+\n+Within the existing Deadline column, replace plain text with a `p:commandLink` that:\n+\n+- calls `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;\n+- continues to display `cargoNotRouted.arrivalDeadlineDate`;\n+- uses the existing Font Awesome edit-icon style;\n+- has a stable ID such as `arrivalDeadlineToUpdate`;\n+- listens for `dialogReturn`;\n+- invokes `changeArrivalDeadlineDateDialog.handleReturn`;\n+- updates `tableNotRouted`;\n+- exposes the exact tooltip `Click to change cargo arrival deadline date.`\n+\n+Follow the adjacent Destination column’s structure and styling. Keep visible date text and an accessible tooltip/label. Do not alter tracking-ID routing or destination editing.\n+\n+Perform the complete `DEF789` acceptance flow: record its original deadline; verify icon/tooltip; open the dialog; verify matching origin/destination and initial date; select a visibly different date; Update; verify close, table refresh, changed value, persistence after page reload, and changed value on reopen; Cancel and verify no further change; confirm Destination editing still opens and routing selection still loads.\n+\n+Update `README.md` only if it already enumerates user-facing Administration capabilities; if so, add one concise sentence about changing an unrouted cargo’s arrival deadline.\n+\n+## Completion gates\n+\n+- On JDK 17, `./mvnw clean package -Popenliberty liberty:run` succeeds; home returns HTTP 200.\n+- The complete `DEF789` browser flow above passes, including refresh/reload/reopen/cancel.\n+- Destination editing and routing selection remain functional.\n+- Logs contain no metadata parent error, `TagException`, `VerifyError`, `FacesException`, `CWWKZ0002E`, `CWWKZ0003E`, recurring batch authorization failure, or feature-attributable new FFDC. Transient JMS activation-order warnings are acceptable only if all endpoints subsequently activate.\n+- Final `./mvnw clean package -Popenliberty` succeeds and all old/new test sources compile.\n+- No Java EE migration or prepared Liberty, Derby, Jackson, JSF metadata, batch, REST, messaging, or startup compatibility work is reverted.\n+- Record the exact run command, `DEF789`, before/after deadline values, and the in-memory reset caveat in PR acceptance evidence. Stop Liberty cleanly.\n+\n+## Out of scope\n+\n+Do not expose editing in other cargo tables or details pages, alter tracking or destination behavior, change application/facade/dialog contracts, add lifecycle/authorization/date rules, redesign the dashboard, migrate frameworks/namespaces, modernize Arquillian, replace Derby/Liberty, or inspect/cherry-pick feature-bearing commits.\n+\n+## Campaign lessons (REQUIRED)\n+\n+Campaign ID: `5426f64c-a653-4ff1-ba39-00209a83cdb4`.\n+\n+Before implementation, read `3-arrival-deadline-treatment-remove-before-merge/campaign-lessons.md` from `experiment/shepherd-treatment`.\n+Treat only entries under `Validated lessons` as advisory context; the issue specification and repository instructions remain authoritative.\n+\n+Before declaring the task complete, update that same file in this PR by adding a\n+`Candidate lessons for issue #<this issue's actual number>` section. Record only concise,\n+reusable repository discoveries, failed approaches worth avoiding, commands\n+that actually passed, and non-obvious constraints. Include applicability and\n+evidence. Do not include raw reasoning, secrets, complete trajectories, or\n+speculation. Preserve all existing validated lessons.\n*** End Patch\n"
````

</details>

```
Added 5 file(s): C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\01-4-1-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\02-4-2-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\03-4-3-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\04-4-4-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\05-4-5-body.md
```


---

<sub>2m 22s</sub>

### `powershell`

**Validate drafts and initialize ledgers**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; $bodyDir=Join-Path $logDir 'issue-bodies'; $validator='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1'; $validated=@(& $validator -BodyDirectory $bodyDir -ExpectedCount 5 -LessonPropagation campaign); if($validated.Count -ne 5){ throw 'Validator did not return five files' }; foreach($f in $validated){ $text=[IO.File]::ReadAllText($f.FullName); if([string]::IsNullOrWhiteSpace($text)){ throw \"Empty validated body: $($f.FullName)\" } }; function Write-Atomic([string]$Path,[string]$Content){ $tmp=\"$Path.tmp-$PID\"; [IO.File]::WriteAllText($tmp,$Content,(New-Object Text.UTF8Encoding($false))); Move-Item -LiteralPath $tmp -Destination $Path -Force }; Write-Atomic (Join-Path $logDir 'creation-ledger.json') ((@() | ConvertTo-Json) + \"`n\"); $result=[ordered]@{schemaVersion=1;status='in_progress';ledgerFile='creation-ledger.json';operationError=$null}; Write-Atomic (Join-Path $logDir 'stage-20-result.json') (($result | ConvertTo-Json) + \"`n\"); $validated | ForEach-Object { $_.FullName }",
  "description": "Validate drafts and initialize ledgers",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>6 lines</summary>

```
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\01-4-1-body.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\02-4-2-body.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\03-4-3-body.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\04-4-4-body.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\issue-bodies\05-4-5-body.md
<shellId: 3 completed with exit code 0>
```

</details>


---

<sub>2m 24s</sub>

### Copilot

The persisted drafts passed the required validator. The repository owner is a user account, so organization issue types are unavailable; all five children will be created **without an issue type**, one at a time in plan order.

---

<sub>2m 35s</sub>

### `powershell`

**Create, verify, and link issue 4.1**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3058828-01-cargotracker'; $parent=3; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; $body=Join-Path $logDir 'issue-bodies\\01-4-1-body.md'; $ledgerPath=Join-Path $logDir 'creation-ledger.json'; $verifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'; function Save-Ledger($items){$tmp=\"$ledgerPath.tmp-$PID\"; [IO.File]::WriteAllText($tmp,(ConvertTo-Json @($items) -Depth 10)+\"`n\",(New-Object Text.UTF8Encoding($false))); Move-Item $tmp $ledgerPath -Force}; $created=gh api \"repos/$repo/issues\" -X POST -f title='4.1 — Add the application-layer deadline change operation' -F \"body=@$body\" --jq '{id,number,node_id,html_url,title}' | ConvertFrom-Json; $ledger=@(Get-Content -Raw $ledgerPath | ConvertFrom-Json); $entry=[ordered]@{implementationSubsection='4.1 — Issue 1: Add the application-layer deadline change operation';bodyFile='issue-bodies/01-4-1-body.md';id=[long]$created.id;number=[int]$created.number;title=$created.title;url=$created.html_url;body_verified=$false;linked=$false}; $ledger+=@([pscustomobject]$entry); Save-Ledger $ledger; $verified=& $verifier -Repository $repo -IssueNumber $created.number -ExpectedBodyPath $body -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($created.number)-body-verification-failure.json\"); $ledger=@(Get-Content -Raw $ledgerPath | ConvertFrom-Json); $ledger[-1].body_verified=$true; Save-Ledger $ledger; $payload=@{sub_issue_id=[long]$created.id}|ConvertTo-Json -Compress; $linked=$false; for($attempt=1;$attempt -le 3 -and -not $linked;$attempt++){ try{$payload | gh api \"repos/$repo/issues/$parent/sub_issues\" -X POST --input - | Out-Null; if($LASTEXITCODE -ne 0){throw \"gh exited $LASTEXITCODE\"}; $linked=$true}catch{if($attempt -eq 3){throw}; Start-Sleep -Seconds 2}}; $ledger=@(Get-Content -Raw $ledgerPath | ConvertFrom-Json); $ledger[-1].linked=$true; Save-Ledger $ledger; $created | ConvertTo-Json -Compress",
  "description": "Create, verify, and link issue 4.1",
  "initial_wait": 120,
  "mode": "sync"
}
```

</details>

```
{"html_url":"https://github.com/edburns/dd-3058828-01-cargotracker/issues/5","id":5330885492,"node_id":"I_kwDOUMkaAs8AAAABPb7bdA","number":5,"title":"4.1 — Add the application-layer deadline change operation"}
<shellId: 4 completed with exit code 0>
```


---

<sub>2m 59s</sub>

### `powershell`

**Create, verify, and link issues 4.2–4.5**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3058828-01-cargotracker'; $parent=3; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; $ledgerPath=Join-Path $logDir 'creation-ledger.json'; $resultPath=Join-Path $logDir 'stage-20-result.json'; $verifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'; $tasks=@(@{sub='4.2 — Issue 2: Expose deadline changes through the booking facade';file='02-4-2-body.md';title='4.2 — Expose deadline changes through the booking facade'},@{sub='4.3 — Issue 3: Implement the deadline editor backing model';file='03-4-3-body.md';title='4.3 — Implement the deadline editor backing model'},@{sub='4.4 — Issue 4: Implement the PrimeFaces deadline dialog';file='04-4-4-body.md';title='4.4 — Implement the PrimeFaces deadline dialog'},@{sub='4.5 — Issue 5: Integrate deadline editing into the Administration dashboard';file='05-4-5-body.md';title='4.5 — Integrate deadline editing into the Administration dashboard'}); function Save-Json($Path,$Value){$tmp=\"$Path.tmp-$PID\"; [IO.File]::WriteAllText($tmp,(ConvertTo-Json $Value -Depth 10)+\"`n\",(New-Object Text.UTF8Encoding($false))); Move-Item $tmp $Path -Force}; try { foreach($task in $tasks){ $body=Join-Path $logDir ('issue-bodies\\'+$task.file); $created=gh api \"repos/$repo/issues\" -X POST -f \"title=$($task.title)\" -F \"body=@$body\" --jq '{id,number,node_id,html_url,title}' | ConvertFrom-Json; if($LASTEXITCODE -ne 0){throw \"create failed for $($task.sub)\"}; $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); $ledger+=@([pscustomobject][ordered]@{implementationSubsection=$task.sub;bodyFile=('issue-bodies/'+$task.file);id=[long]$created.id;number=[int]$created.number;title=$created.title;url=$created.html_url;body_verified=$false;linked=$false}); Save-Json $ledgerPath @($ledger); & $verifier -Repository $repo -IssueNumber $created.number -ExpectedBodyPath $body -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($created.number)-body-verification-failure.json\") | Out-Null; $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); $ledger[-1].body_verified=$true; Save-Json $ledgerPath @($ledger); $payload=@{sub_issue_id=[long]$created.id}|ConvertTo-Json -Compress; $linked=$false; for($attempt=1;$attempt -le 3 -and -not $linked;$attempt++){ try{$payload|gh api \"repos/$repo/issues/$parent/sub_issues\" -X POST --input -|Out-Null;if($LASTEXITCODE -ne 0){throw \"gh exited $LASTEXITCODE\"};$linked=$true}catch{if($attempt -eq 3){throw};Start-Sleep -Seconds 2}}; $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); $ledger[-1].linked=$true; Save-Json $ledgerPath @($ledger); $created|ConvertTo-Json -Compress } } catch { $children=@(gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate --jq '.[].id' | ForEach-Object {[long]$_}); $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); foreach($e in $ledger){$e.linked=($children -contains [long]$e.id)}; Save-Json $ledgerPath @($ledger); $result=[ordered]@{schemaVersion=1;status='failed';ledgerFile='creation-ledger.json';operationError=$_.Exception.Message}; Save-Json $resultPath $result; throw }",
  "description": "Create, verify, and link issues 4.2–4.5",
  "initial_wait": 180,
  "mode": "sync"
}
```

</details>

```
{"html_url":"https://github.com/edburns/dd-3058828-01-cargotracker/issues/6","id":5330887679,"node_id":"I_kwDOUMkaAs8AAAABPb7j_w","number":6,"title":"4.2 — Expose deadline changes through the booking facade"}
{"html_url":"https://github.com/edburns/dd-3058828-01-cargotracker/issues/7","id":5330887820,"node_id":"I_kwDOUMkaAs8AAAABPb7kjA","number":7,"title":"4.3 — Implement the deadline editor backing model"}
{"html_url":"https://github.com/edburns/dd-3058828-01-cargotracker/issues/8","id":5330888098,"node_id":"I_kwDOUMkaAs8AAAABPb7log","number":8,"title":"4.4 — Implement the PrimeFaces deadline dialog"}
{"html_url":"https://github.com/edburns/dd-3058828-01-cargotracker/issues/9","id":5330888371,"node_id":"I_kwDOUMkaAs8AAAABPb7msw","number":9,"title":"4.5 — Integrate deadline editing into the Administration dashboard"}
<shellId: 5 completed with exit code 0>
```


---

<sub>3m 3s</sub>

### Copilot

All five issues were created, body-verified, and linked serially. I’m performing the mandated final reconciliation against the parent-child order, open/unassigned state, and persisted bodies before marking the stage complete.

---

<sub>3m 15s</sub>

### `powershell`

**Verify final issue postconditions**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3058828-01-cargotracker'; $parent=3; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; $ledgerPath=Join-Path $logDir 'creation-ledger.json'; $resultPath=Join-Path $logDir 'stage-20-result.json'; $verifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'; function Save-Json($Path,$Value){$tmp=\"$Path.tmp-$PID\";[IO.File]::WriteAllText($tmp,(ConvertTo-Json $Value -Depth 10)+\"`n\",(New-Object Text.UTF8Encoding($false)));Move-Item $tmp $Path -Force}; try { $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); if($ledger.Count -ne 5){throw \"Ledger count is $($ledger.Count), expected 5\"}; $children=@(gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate --jq '.[] | {id,number,title}' | ForEach-Object {$_|ConvertFrom-Json}); if($children.Count -ne 5){throw \"Parent child count is $($children.Count), expected baseline 0 + 5\"}; $expectedNumbers=@($ledger|ForEach-Object {[int]$_.number}); $actualNumbers=@($children|ForEach-Object {[int]$_.number}); if(($expectedNumbers -join ',') -cne ($actualNumbers -join ',')){throw \"Child order mismatch: expected $($expectedNumbers -join ','), observed $($actualNumbers -join ',')\"}; if((@($actualNumbers|Group-Object|Where-Object Count -ne 1)).Count -ne 0){throw 'A linked child appears more than once'}; foreach($e in $ledger){ if(-not $e.body_verified -or -not $e.linked){throw \"Ledger flags incomplete for issue #$($e.number)\"}; $body=Join-Path $logDir ($e.bodyFile -replace '/','\\'); & $verifier -Repository $repo -IssueNumber $e.number -ExpectedBodyPath $body -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($e.number)-final-body-verification-failure.json\") | Out-Null; $state=gh api \"repos/$repo/issues/$($e.number)\" --jq '{state,assignees:[.assignees[].login],title,number}'|ConvertFrom-Json; if($state.state -ne 'open'){throw \"Issue #$($e.number) is not open\"}; if(@($state.assignees).Count -ne 0){throw \"Issue #$($e.number) is assigned\"}; if($state.title -cne $e.title){throw \"Issue #$($e.number) title mismatch\"} }; $result=[ordered]@{schemaVersion=1;status='complete';ledgerFile='creation-ledger.json';operationError=$null}; Save-Json $resultPath $result; [ordered]@{status='complete';children=$actualNumbers;ledger=$ledger}|ConvertTo-Json -Depth 6 } catch { $childrenIds=@(gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate --jq '.[].id'|ForEach-Object{[long]$_}); $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); foreach($e in $ledger){$e.linked=($childrenIds -contains [long]$e.id)}; Save-Json $ledgerPath @($ledger); Save-Json $resultPath ([ordered]@{schemaVersion=1;status='failed';ledgerFile='creation-ledger.json';operationError=$_.Exception.Message}); throw }",
  "description": "Verify final issue postconditions",
  "initial_wait": 180,
  "mode": "sync"
}
```

</details>

<details>
<summary>6 lines</summary>

```
InvalidOperation: 
Line |
   2 |  … $e in $ledger){$e.linked=($childrenIds -contains [long]$e.id)}; Save- …
     |                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     | The property 'linked' cannot be found on this object. Verify that the property exists and can be set.
<shellId: 6 completed with exit code 1>
```

</details>


---

<sub>3m 25s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\creation-ledger.json.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\creation-ledger.json

<details>
<summary>53 lines</summary>

```
[
  null,
  {
    "implementationSubsection": "4.1 — Issue 1: Add the application-layer deadline change operation",
    "bodyFile": "issue-bodies/01-4-1-body.md",
    "id": 5330885492,
    "number": 5,
    "title": "4.1 — Add the application-layer deadline change operation",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/5",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.2 — Issue 2: Expose deadline changes through the booking facade",
    "bodyFile": "issue-bodies/02-4-2-body.md",
    "id": 5330887679,
    "number": 6,
    "title": "4.2 — Expose deadline changes through the booking facade",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/6",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.3 — Issue 3: Implement the deadline editor backing model",
    "bodyFile": "issue-bodies/03-4-3-body.md",
    "id": 5330887820,
    "number": 7,
    "title": "4.3 — Implement the deadline editor backing model",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/7",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.4 — Issue 4: Implement the PrimeFaces deadline dialog",
    "bodyFile": "issue-bodies/04-4-4-body.md",
    "id": 5330888098,
    "number": 8,
    "title": "4.4 — Implement the PrimeFaces deadline dialog",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/8",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.5 — Issue 5: Integrate deadline editing into the Administration dashboard",
    "bodyFile": "issue-bodies/05-4-5-body.md",
    "id": 5330888371,
    "number": 9,
    "title": "4.5 — Integrate deadline editing into the Administration dashboard",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/9",
    "body_verified": true,
    "linked": true
  }
]
```

</details>


---

<sub>3m 24s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\stage-20-result.json.**

C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-treatment\3-arrival-deadline-treatment-remove-before-merge\prompts\shepherd-task-20-20260902-1754\stage-20-result.json

<details>
<summary>6 lines</summary>

```
{
  "schemaVersion": 1,
  "status": "in_progress",
  "ledgerFile": "creation-ledger.json",
  "operationError": null
}
```

</details>


---

<sub>3m 25s</sub>

### `powershell`

**Inspect linked child state**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$repo='edburns/dd-3058828-01-cargotracker'; gh api \"repos/$repo/issues/3/sub_issues\" --paginate --jq '.[] | {id,number,title,state,assignees:[.assignees[].login]}'",
  "description": "Inspect linked child state",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>6 lines</summary>

```
{"assignees":[],"id":5330885492,"number":5,"state":"open","title":"4.1 — Add the application-layer deadline change operation"}
{"assignees":[],"id":5330887679,"number":6,"state":"open","title":"4.2 — Expose deadline changes through the booking facade"}
{"assignees":[],"id":5330887820,"number":7,"state":"open","title":"4.3 — Implement the deadline editor backing model"}
{"assignees":[],"id":5330888098,"number":8,"state":"open","title":"4.4 — Implement the PrimeFaces deadline dialog"}
{"assignees":[],"id":5330888371,"number":9,"state":"open","title":"4.5 — Integrate deadline editing into the Administration dashboard"}
<shellId: 7 completed with exit code 0>
```

</details>


---

<sub>3m 27s</sub>

### Copilot

The final reconciliation exposed a local ledger initialization artifact: an extra leading `null` entry. The five GitHub children themselves are open, unassigned, correctly ordered, and linked. I’m repairing only the local ledger record, then rerunning all final read-only postconditions.

---

<sub>3m 31s</sub>

### `powershell`

**Remove null ledger artifact**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; $path=Join-Path $logDir 'creation-ledger.json'; $entries=@(Get-Content -Raw $path|ConvertFrom-Json|Where-Object{$null -ne $_}); if($entries.Count -ne 5){throw \"Expected 5 ledger entries after repair, found $($entries.Count)\"}; $tmp=\"$path.tmp-$PID\"; [IO.File]::WriteAllText($tmp,(ConvertTo-Json @($entries) -Depth 10)+\"`n\",(New-Object Text.UTF8Encoding($false))); Move-Item $tmp $path -Force; Get-Content -Raw $path",
  "description": "Remove null ledger artifact",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>53 lines</summary>

```
[
  {
    "implementationSubsection": "4.1 — Issue 1: Add the application-layer deadline change operation",
    "bodyFile": "issue-bodies/01-4-1-body.md",
    "id": 5330885492,
    "number": 5,
    "title": "4.1 — Add the application-layer deadline change operation",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/5",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.2 — Issue 2: Expose deadline changes through the booking facade",
    "bodyFile": "issue-bodies/02-4-2-body.md",
    "id": 5330887679,
    "number": 6,
    "title": "4.2 — Expose deadline changes through the booking facade",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/6",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.3 — Issue 3: Implement the deadline editor backing model",
    "bodyFile": "issue-bodies/03-4-3-body.md",
    "id": 5330887820,
    "number": 7,
    "title": "4.3 — Implement the deadline editor backing model",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/7",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.4 — Issue 4: Implement the PrimeFaces deadline dialog",
    "bodyFile": "issue-bodies/04-4-4-body.md",
    "id": 5330888098,
    "number": 8,
    "title": "4.4 — Implement the PrimeFaces deadline dialog",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/8",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.5 — Issue 5: Integrate deadline editing into the Administration dashboard",
    "bodyFile": "issue-bodies/05-4-5-body.md",
    "id": 5330888371,
    "number": 9,
    "title": "4.5 — Integrate deadline editing into the Administration dashboard",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/9",
    "body_verified": true,
    "linked": true
  }
]
<shellId: 8 completed with exit code 0>
```

</details>


---

<sub>3m 51s</sub>

### `powershell`

**Complete final issue verification**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3058828-01-cargotracker'; $parent=3; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-treatment\\3-arrival-deadline-treatment-remove-before-merge\\prompts\\shepherd-task-20-20260902-1754'; $ledgerPath=Join-Path $logDir 'creation-ledger.json'; $resultPath=Join-Path $logDir 'stage-20-result.json'; $verifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'; $ledger=@(Get-Content -Raw $ledgerPath|ConvertFrom-Json); if($ledger.Count -ne 5){throw \"Ledger count $($ledger.Count)\"}; $children=@(gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate --jq '.[] | {id,number,title}'|ForEach-Object{$_|ConvertFrom-Json}); if($children.Count -ne 5){throw \"Child count $($children.Count), expected 5\"}; $expected=@($ledger|ForEach-Object{[int]$_.number}); $actual=@($children|ForEach-Object{[int]$_.number}); if(($expected -join ',') -cne ($actual -join ',')){throw \"Order mismatch: $($actual -join ',')\"}; if(@($actual|Group-Object|Where-Object{$_.Count -ne 1}).Count -gt 0){throw 'Duplicate linked child'}; foreach($e in $ledger){if(-not $e.body_verified -or -not $e.linked){throw \"Incomplete ledger flags #$($e.number)\"};$body=Join-Path $logDir ($e.bodyFile-replace '/','\\');& $verifier -Repository $repo -IssueNumber $e.number -ExpectedBodyPath $body -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($e.number)-final-body-verification-failure.json\")|Out-Null;$state=gh api \"repos/$repo/issues/$($e.number)\" --jq '{state,assignees:[.assignees[].login],title}'|ConvertFrom-Json;if($state.state-ne'open'){throw \"Issue #$($e.number) not open\"};if(@($state.assignees).Count-ne 0){throw \"Issue #$($e.number) assigned\"};if($state.title-cne$e.title){throw \"Issue #$($e.number) title mismatch\"}}; $result=[ordered]@{schemaVersion=1;status='complete';ledgerFile='creation-ledger.json';operationError=$null};$tmp=\"$resultPath.tmp-$PID\";[IO.File]::WriteAllText($tmp,(ConvertTo-Json $result)+\"`n\",(New-Object Text.UTF8Encoding($false)));Move-Item $tmp $resultPath -Force; [ordered]@{status='complete';orderedChildren=$actual;issueType=$null}|ConvertTo-Json -Compress",
  "description": "Complete final issue verification",
  "initial_wait": 180,
  "mode": "sync"
}
```

</details>

```
{"status":"complete","orderedChildren":[5,6,7,8,9],"issueType":null}
<shellId: 9 completed with exit code 0>
```


---

<sub>3m 56s</sub>

### Copilot

Created and linked five ordered, unassigned child issues under #3:

| Subsection | Issue | Title |
|---|---:|---|
| 4.1 | [#5](https://github.com/edburns/dd-3058828-01-cargotracker/issues/5) | Add the application-layer deadline change operation |
| 4.2 | [#6](https://github.com/edburns/dd-3058828-01-cargotracker/issues/6) | Expose deadline changes through the booking facade |
| 4.3 | [#7](https://github.com/edburns/dd-3058828-01-cargotracker/issues/7) | Implement the deadline editor backing model |
| 4.4 | [#8](https://github.com/edburns/dd-3058828-01-cargotracker/issues/8) | Implement the PrimeFaces deadline dialog |
| 4.5 | [#9](https://github.com/edburns/dd-3058828-01-cargotracker/issues/9) | Integrate deadline editing into the Administration dashboard |

**Ordered child numbers:** `5,6,7,8,9`

**Suggested stage 25 invocation:** Invoke `shepherd-task-25-given-list` with `LESSON_PROPAGATION=campaign`, ordered issues `5,6,7,8,9`, and `PLAN_DIRECTORY=3-arrival-deadline-treatment-remove-before-merge`.

The repository owner is a user account, so the issues were created **without an issue type**.

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>
