# Campaign lessons

This file contains validated, reusable lessons for subsequent issues in this campaign.
The issue specification and repository instructions remain authoritative.

## Validated lessons from issue #5 (PR #15)

- **Applies to:** Application-layer changes to a cargo's route specification
  - **Lesson:** Replace the whole `RouteSpecification`, call `cargo.specifyNewRoute(...)`, and persist through `cargoRepository.store(...)` so the aggregate recalculates delivery state.
  - **Evidence:** `DefaultBookingService.changeDeadline(...)` and the preserved-state assertions in `BookingServiceTest.testChangeDeadline()`.
  - **Source:** both
  - **Confidence:** high
- **Applies to:** Logging mutable values accepted by application services
  - **Lesson:** Log the defensively copied value held by the new domain value object rather than retaining a caller-owned mutable argument for deferred formatting.
  - **Evidence:** Copilot review finding on `Date` mutability, corrective commit `751172c`, and the finding-free follow-up review.
  - **Source:** stage-40 observation
  - **Confidence:** high

## Validated lessons from issue #6 (PR #16)

- **Applies to:** Facade boundary methods that adapt a web-facing command to the application service
  - **Lesson:** Keep the facade thin: convert only the tracking ID and pass the original `Date` to `BookingService.changeDeadline(...)`; do not load cargo, store through a repository, or parse a formatted date in the facade.
  - **Evidence:** `DefaultBookingServiceFacade.changeDeadline(...)`, the focused facade test, and the finding-free Copilot review of `f8456db`.
  - **Source:** CCA observation
  - **Confidence:** high

- **Applies to:** Hand-written application-service test doubles used to verify narrow facade delegation
  - **Lesson:** Make every operation outside the expected delegation fail fast so the test detects accidental extra service calls rather than silently accepting them.
  - **Evidence:** Copilot review finding on permissive no-op methods, corrective commit `f8456db`, and the finding-free follow-up review.
  - **Source:** stage-40 observation
  - **Confidence:** high
- **Applies to:** Historical JDK 17 / Open Liberty validation for compiled Java EE tests
  - **Lesson:** Use `./mvnw clean package -Popenliberty` as the executable compile gate, and rely on the direct HTTP/browser acceptance flow because the historical Arquillian integration suite remains container-bound and the project still defaults `skipTests=true`.
  - **Evidence:** POM `skipTests=true`, successful Open Liberty package builds, and the issue's acceptance flow after the application-layer test is in place.
  - **Source:** CCA observation
  - **Confidence:** high

## Candidate lessons for issue #7

- **Applies to:** JSF deadline editor backing models
  - **Lesson:** Parse the facade DTO's date-only value with a fresh, non-lenient `SimpleDateFormat`; surface malformed values as an application failure.
  - **Evidence:** `ChangeArrivalDeadlineDate.load()` and its container-free focused test.
  - **Source:** implementation
  - **Confidence:** high
- **Applies to:** Container-free web bean tests
  - **Lesson:** Inject a hand-written facade fake reflectively when testing a CDI bean outside a container; make unexpected facade operations fail fast.
  - **Evidence:** `ChangeArrivalDeadlineDateTest`.
  - **Source:** implementation
  - **Confidence:** high
