package demibenari.common.guice.providers;

import com.google.inject.throwingproviders.CheckedProvider;
import demibenari.common.authentication.AuthSecurityException;

/**
 *
 * Created by Demi Ben-Ari on 12/13/2014.
 */
public interface SecurityServiceProvider<T> extends CheckedProvider<T> {
    T get() throws AuthSecurityException;
}
