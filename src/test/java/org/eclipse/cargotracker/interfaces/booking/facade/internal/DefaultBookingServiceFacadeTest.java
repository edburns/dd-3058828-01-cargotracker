package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import org.eclipse.cargotracker.application.BookingService;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

public class DefaultBookingServiceFacadeTest {

    @Test
    public void changeDeadlineDelegatesConvertedIdAndSameDateOnce() throws Exception {
        RecordingBookingService bookingService = new RecordingBookingService();
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        Field bookingServiceField = DefaultBookingServiceFacade.class
                .getDeclaredField("bookingService");
        bookingServiceField.setAccessible(true);
        bookingServiceField.set(facade, bookingService);

        Date deadline = new Date();
        facade.changeDeadline("ABC123", deadline);

        Assert.assertEquals(new TrackingId("ABC123"), bookingService.trackingId);
        Assert.assertSame(deadline, bookingService.deadline);
        Assert.assertEquals(1, bookingService.invocationCount);
    }

    private static class RecordingBookingService implements BookingService {

        private TrackingId trackingId;
        private Date deadline;
        private int invocationCount;

        @Override
        public TrackingId bookNewCargo(UnLocode origin, UnLocode destination,
                                        Date arrivalDeadline) {
            return null;
        }

        @Override
        public List<Itinerary> requestPossibleRoutesForCargo(
                TrackingId trackingId) {
            return null;
        }

        @Override
        public void assignCargoToRoute(Itinerary itinerary,
                                       TrackingId trackingId) {
        }

        @Override
        public void changeDestination(TrackingId trackingId,
                                      UnLocode unLocode) {
        }

        @Override
        public void changeDeadline(TrackingId trackingId, Date deadline) {
            this.trackingId = trackingId;
            this.deadline = deadline;
            invocationCount++;
        }
    }
}
