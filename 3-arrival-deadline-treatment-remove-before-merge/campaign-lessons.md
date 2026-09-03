# Campaign lessons

This file contains validated, reusable lessons for subsequent issues in this campaign.
The issue specification and repository instructions remain authoritative.

## Validated lessons

No validated lessons have been recorded yet.

## Candidate lessons for issue #5

- Application mutation pattern: replace the whole `RouteSpecification` with the cargo's current origin and destination, call `cargo.specifyNewRoute(...)`, and persist through `cargoRepository.store(...)`. Applicability: future deadline or route-change work should keep the aggregate responsible for recalculating delivery state instead of mutating persistence or setting domain fields directly. Evidence: `DefaultBookingService.changeDeadline(...)` and the existing `changeDestination(...)` pattern.
- Preserve the current itinerary and routing status: when a deadline changes on a misrouted cargo, the assigned itinerary remains unchanged while the aggregate recalculates delivery state and keeps `RoutingStatus.MISROUTED`. Applicability: avoid clearing or rerouting an itinerary during a deadline correction. Evidence: `BookingServiceTest.testChangeDeadline()`.
- Historical build gate: `./mvnw -q -DskipTests -Popenliberty test-compile` and `./mvnw clean package -Popenliberty` both passed in the prepared JDK 17/Open Liberty baseline while the Arquillian suite remains a remote Payara integration concern. Applicability: do not broaden the runtime modernization scope for this issue; keep the feature-absent compile/package gate and reserve Arquillian execution for the documented Payara environment. Evidence: the Maven commands run in this repository for issue #5.
