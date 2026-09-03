package org.eclipse.cargotracker.interfaces.booking.web;

import org.eclipse.cargotracker.interfaces.booking.facade.BookingServiceFacade;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.primefaces.PrimeFaces;

import javax.faces.FacesException;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public CargoRoute getCargo() {
        return cargo;
    }

    public Date getArrivalDeadlineDate() {
        return arrivalDeadlineDate;
    }

    public void setArrivalDeadlineDate(Date arrivalDeadlineDate) {
        this.arrivalDeadlineDate = arrivalDeadlineDate;
    }

    public void load() {
        cargo = null;
        arrivalDeadlineDate = null;
        try {
            cargo = bookingServiceFacade.loadCargoForRouting(trackingId);
            String deadlineDate = cargo == null ? null : cargo.getArrivalDeadlineDate();
            if (deadlineDate == null) {
                throw new IllegalStateException("Cargo has no arrival deadline date");
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            dateFormat.setLenient(false);
            arrivalDeadlineDate = dateFormat.parse(deadlineDate);
            if (!deadlineDate.equals(dateFormat.format(arrivalDeadlineDate))) {
                throw new ParseException("Invalid arrival deadline date: " + deadlineDate, 0);
            }
        } catch (ParseException | RuntimeException e) {
            throw new FacesException(
                    "Unable to load arrival deadline for cargo " + trackingId, e);
        }
    }

    public void changeArrivalDeadline() {
        if (arrivalDeadlineDate == null) {
            throw new FacesException("An arrival deadline date is required");
        }

        try {
            bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate);
        } catch (RuntimeException e) {
            throw new FacesException(
                    "Unable to change arrival deadline for cargo " + trackingId, e);
        }
        PrimeFaces.current().dialog().closeDynamic("DONE");
    }
}
