package demibenari.common.authentication;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public class LDAPSecurityService implements SecutiryService {

    public static final String NOT_AUTHORIZED_USER = "Stranger";

    public LDAPSecurityService() throws AuthSecurityException {
//        throw new AuthSecurityException();
    }

    @Override
    public boolean isAuthorized(String entityIdentifier) {
        boolean result = true;

        if (entityIdentifier != NOT_AUTHORIZED_USER) {
            return false;
        }

        return result ;
    }
}
