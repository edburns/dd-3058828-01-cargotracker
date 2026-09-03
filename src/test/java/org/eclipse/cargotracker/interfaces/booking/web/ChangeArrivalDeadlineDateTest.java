package org.eclipse.cargotracker.interfaces.booking.web;

import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.Test;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ChangeArrivalDeadlineDateTest {

    @Test
    public void loadUsesTrackingIdAndParsesDateOnly() throws Exception {
        ChangeArrivalDeadlineDate editor = newEditor(new FakeFacade());
        editor.setTrackingId("ABC123");

        editor.load();

        assertEquals("ABC123", ((FakeFacade) facade(editor)).loadedTrackingId);
        assertEquals(date("03/15/2025"), editor.getArrivalDeadlineDate());
    }

    @Test
    public void loadRejectsInvalidDtoDate() throws Exception {
        ChangeArrivalDeadlineDate editor = newEditor(new FakeFacade() {
            @Override
            public CargoRoute loadCargoForRouting(String trackingId) {
                return new CargoRoute("ABC123", "A", "B", date("03/15/2025"), false, false, "A", "N") {
                    @Override
                    public String getArrivalDeadlineDate() {
                        return "02/30/2025";
                    }
                };
            }
        });
        editor.setTrackingId("ABC123");

        try {
            editor.load();
            fail("Expected malformed date failure");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Invalid cargo arrival deadline date"));
        }
    }

    @Test
    public void changeRejectsNullWithoutFacadeMutation() throws Exception {
        FakeFacade facade = new FakeFacade();
        ChangeArrivalDeadlineDate editor = newEditor(facade);
        editor.setTrackingId("ABC123");

        try {
            editor.changeArrivalDeadline();
            fail("Expected null selection failure");
        } catch (IllegalArgumentException e) {
            assertEquals(0, facade.changedInvocations);
        }
    }

    @Test
    public void changeDelegatesExactValues() throws Exception {
        final Date selectedDate = new Date(123456789L);
        FakeFacade facade = new FakeFacade() {
            @Override
            public void changeDeadline(String trackingId, Date arrivalDeadline) {
                super.changeDeadline(trackingId, arrivalDeadline);
                throw new ExpectedFailure();
            }
        };
        ChangeArrivalDeadlineDate editor = newEditor(facade);
        editor.setTrackingId("ABC123");
        editor.setArrivalDeadlineDate(selectedDate);

        try {
            editor.changeArrivalDeadline();
            fail("Expected fake facade failure");
        } catch (ExpectedFailure expected) {
            assertEquals("ABC123", facade.changedTrackingId);
            assertTrue(selectedDate == facade.changedDate);
        }
    }

    private static ChangeArrivalDeadlineDate newEditor(BookingServiceFacade facade) throws Exception {
        ChangeArrivalDeadlineDate editor = new ChangeArrivalDeadlineDate();
        Field field = ChangeArrivalDeadlineDate.class.getDeclaredField("bookingServiceFacade");
        field.setAccessible(true);
        field.set(editor, facade);
        return editor;
    }

    private static Date date(String text) {
        try {
            return new SimpleDateFormat("MM/dd/yyyy").parse(text);
        } catch (ParseException e) {
            throw new AssertionError(e);
        }
    }

    private static BookingServiceFacade facade(ChangeArrivalDeadlineDate editor) throws Exception {
        Field field = ChangeArrivalDeadlineDate.class.getDeclaredField("bookingServiceFacade");
        field.setAccessible(true);
        return (BookingServiceFacade) field.get(editor);
    }

    private static class FakeFacade implements BookingServiceFacade {
        private String loadedTrackingId;
        private int changedInvocations;
        private String changedTrackingId;
        private Date changedDate;

        @Override
        public CargoRoute loadCargoForRouting(String trackingId) {
            loadedTrackingId = trackingId;
            return new CargoRoute("ABC123", "A", "B", date("03/15/2025"), false, false, "A", "N");
        }

        @Override
        public void changeDeadline(String trackingId, Date arrivalDeadline) {
            changedInvocations++;
            changedTrackingId = trackingId;
            changedDate = arrivalDeadline;
        }

        @Override public String bookNewCargo(String o, String d, Date date) { throw new AssertionError(); }
        @Override public void assignCargoToRoute(String id, RouteCandidate route) { throw new AssertionError(); }
        @Override public void changeDestination(String id, String destination) { throw new AssertionError(); }
        @Override public List<RouteCandidate> requestPossibleRoutesForCargo(String id) { throw new AssertionError(); }
        @Override public List<Location> listShippingLocations() { throw new AssertionError(); }
        @Override public List<CargoRoute> listAllCargos() { throw new AssertionError(); }
    }

    private static class ExpectedFailure extends RuntimeException {
    }
}
