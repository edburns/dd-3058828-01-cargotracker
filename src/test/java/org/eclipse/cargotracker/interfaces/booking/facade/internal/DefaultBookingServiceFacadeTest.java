package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DefaultBookingServiceFacadeTest {

    @Test
    public void changeDeadlineDelegatesOnceWithConvertedTrackingIdAndSameDate()
            throws Exception {
        final String trackingId = "ABC123";
        final Date arrivalDeadline = new Date(123456789L);
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        BookingServiceFake bookingService = new BookingServiceFake();

        facade.setBookingService(bookingService);

        facade.changeDeadline(trackingId, arrivalDeadline);

        assertEquals(1, bookingService.invocations);
        assertEquals(new TrackingId(trackingId), bookingService.trackingId);
        assertSame(arrivalDeadline, bookingService.arrivalDeadline);
    }

    private static final class BookingServiceFake implements BookingService {
        private int invocations;
        private TrackingId trackingId;
        private Date arrivalDeadline;

        @Override
        public TrackingId bookNewCargo(UnLocode origin, UnLocode destination,
                                      Date arrivalDeadline) {
            return null;
        }

        @Override
        public List<Itinerary> requestPossibleRoutesForCargo(TrackingId trackingId) {
            return null;
        }

        @Override
        public void assignCargoToRoute(Itinerary itinerary, TrackingId trackingId) {
        }

        @Override
        public void changeDestination(TrackingId trackingId, UnLocode unLocode) {
        }

        @Override
        public void changeDeadline(TrackingId trackingId, Date deadline) {
            invocations++;
            this.trackingId = trackingId;
            this.arrivalDeadline = deadline;
        }
    }
}
