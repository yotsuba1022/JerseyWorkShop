package idv.carl.jersey;

import idv.carl.jersey.binder.ApplicationBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author Carl Lu
 */
@ApplicationPath("jersey-workshop")
public class Application extends ResourceConfig {

    public Application() {
        register(new ApplicationBinder());
        packages("idv.carl.jersey");
    }

}
