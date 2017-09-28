package idv.carl.jersey.facade;

import idv.carl.jersey.service.AccountService;
import org.glassfish.jersey.server.ManagedAsync;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 * @author Carl Lu
 */
@Path("/async")
public class AsyncFacade {

    private AccountService accountService;

    @Inject
    public AsyncFacade(final AccountService accountService) {
        this.accountService = accountService;
    }

    @GET
    @Path("/get")
    @ManagedAsync
    public void asyncGet(@Suspended final AsyncResponse asyncResponse) {
        try {
            // To simulate I/O task.
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        String result = "Async get result with user name: " + accountService.getUserName(1L);
        asyncResponse.resume(result);
    }

}
