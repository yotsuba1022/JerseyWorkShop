package idv.carl.jersey;

import idv.carl.jersey.binder.ApplicationComponentBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author Carl Lu
 */
@ApplicationPath("jersey-workshop")
public class Application extends ResourceConfig {

    public Application() {
        register(new ApplicationComponentBinder());
        packages(this.getClass().getPackage().getName());
    }

}
