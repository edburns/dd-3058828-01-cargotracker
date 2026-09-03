# Campaign lessons

This file contains validated, reusable lessons for subsequent issues in this campaign.
The issue specification and repository instructions remain authoritative.

## Validated lessons

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
