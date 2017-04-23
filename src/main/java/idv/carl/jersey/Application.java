package idv.carl.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Carl Lu
 */
@ApplicationPath("jersey-workshop")
public class Application extends ResourceConfig {

    public Application() {
        packages("idv.carl.jersey");
    }

}
