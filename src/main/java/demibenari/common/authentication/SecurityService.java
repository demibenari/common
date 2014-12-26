package demibenari.common.authentication;

/**
 *
 * Created by Demi Ben-Ari on 12/13/2014.
 */
public interface SecurityService {
    public boolean isAuthorized(String entityIdentifier);
}
