package idv.carl.jersey.facade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author Carl Lu
 */
@Path("/greeting")
public class RenderFacade {

    @GET
    public String greeting() {
        return "A simple greeting.";
    }

    @GET
    @Path("/{name}")
    public String greetingToGuest(@PathParam("name") String name) {
        return "Hello, " + name;
    }

    @GET
    @Path("/reg/{name: [a-zA-Z][a-zA-Z_0-9]*}")
    public String randomGreeting(@PathParam("name") String name) {
        return "Greeting via regular expression endpoint.";
    }

}
