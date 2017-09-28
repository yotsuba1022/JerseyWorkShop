package idv.carl.jersey.binder;

import idv.carl.jersey.service.AccountService;
import idv.carl.jersey.service.AccountServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * @author Carl Lu
 */
public class ApplicationComponentBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(AccountServiceImpl.class).to(AccountService.class);
    }

}
