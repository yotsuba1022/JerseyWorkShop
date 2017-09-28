package idv.carl.jersey.service;

/**
 * @author Carl Lu
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public String getUserName(long userId) {
        return String.valueOf(userId);
    }

}
