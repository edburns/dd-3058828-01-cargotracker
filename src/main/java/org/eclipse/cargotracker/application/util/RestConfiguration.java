package org.eclipse.cargotracker.application.util;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.cargotracker.interfaces.booking.rest.CargoMonitoringService;
import org.eclipse.cargotracker.interfaces.handling.rest.HandlingReportService;
import org.eclipse.pathfinder.api.GraphTraversalService;

/** JAX-RS configuration. */
@ApplicationPath("rest")
public class RestConfiguration extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<>();
    classes.add(HandlingReportService.class);
    classes.add(GraphTraversalService.class);
    classes.add(CargoMonitoringService.class);
    classes.add(JacksonJsonProvider.class);
    return classes;
  }
}
