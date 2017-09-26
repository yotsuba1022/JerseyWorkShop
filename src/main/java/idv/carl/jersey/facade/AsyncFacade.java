package idv.carl.jersey.facade;

import org.glassfish.jersey.server.ManagedAsync;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 * @author Carl Lu
 */
@Path("/async")
public class AsyncFacade {

    @GET
    @Path("/get")
    @ManagedAsync
    public void asyncGet(@Suspended final AsyncResponse asyncResponse) {
        try {
            // To simulate I/O task.
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        String result = "Async get result.";
        asyncResponse.resume(result);
    }

}
