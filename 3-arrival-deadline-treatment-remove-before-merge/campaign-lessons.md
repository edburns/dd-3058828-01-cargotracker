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

## Validated lessons from issue #9 (PR #19)

- **Applies to:** PrimeFaces table actions that expose an existing dynamic dialog
  - **Lesson:** Mirror an adjacent command-link integration: pass the row identifier to the dialog, handle `dialogReturn`, and update only the containing table so unrelated page state is preserved.
  - **Evidence:** `src/main/webapp/admin/tables/listNotRouted.xhtml` and the finding-free Copilot review of `e873bb9`.
  - **Source:** both
  - **Confidence:** high

## Validated lessons from issue #7 (PR #17)

- **Applies to:** JSF deadline editor backing models
  - **Lesson:** Fetch a facade DTO's derived date string once, wrap failures from the DTO accessor, and parse with a fresh, non-lenient formatter so malformed or unavailable values surface consistently as application failures.
  - **Evidence:** `ChangeArrivalDeadlineDate.load()`, `loadWrapsMalformedDtoDate()`, corrective commit `26862c7`, and the finding-free follow-up Copilot review.
  - **Source:** both
  - **Confidence:** high
- **Applies to:** Container-free web bean tests
  - **Lesson:** Inject a hand-written facade fake reflectively when testing a CDI bean outside a container, make unexpected facade operations fail fast, and parse fixture dates non-leniently so invalid test data cannot be silently normalized.
  - **Evidence:** `ChangeArrivalDeadlineDateTest`, corrective commit `26862c7`, and the finding-free follow-up Copilot review.
  - **Source:** both
  - **Confidence:** high

## Validated lessons from issue #8 (PR #18)

- **Applies to:** PrimeFaces dynamic dialogs running on the prepared MyFaces/Open Liberty baseline
  - **Lesson:** Place `<f:metadata>` directly beneath the root `<html>` element, ahead of `<h:head>` and `<h:body>`, so `f:viewParam` and `f:viewAction` execute without component-parent errors.
  - **Evidence:** Direct HTTP request to `changeArrivalDeadlineDate.xhtml?trackingId=DEF789` returned 200 and rendered the loaded cargo context and deadline.
  - **Source:** CCA observation
  - **Confidence:** high
- **Applies to:** Cancel actions in JSF forms containing required inputs
  - **Lesson:** Restrict a PrimeFaces Cancel command to `process="@this"` so required-field validation cannot prevent the close action from running.
  - **Evidence:** Copilot review finding on the required deadline picker, corrective commit `4d70a02`, and the follow-up review confirming the finding was resolved.
  - **Source:** stage-40 observation
  - **Confidence:** high
