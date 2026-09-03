package org.eclipse.cargotracker.application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.pathfinder.api.GraphTraversalService;

/** JAX-RS configuration. */
@ApplicationPath("rest")
public class BookingServiceTestRestConfiguration extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<>();
    classes.add(GraphTraversalService.class);
    classes.add(JacksonJsonProvider.class);
    return classes;
  }
}
