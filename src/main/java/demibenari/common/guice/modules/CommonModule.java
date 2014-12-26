package demibenari.common.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.throwingproviders.CheckedProvides;
import com.google.inject.throwingproviders.ThrowingProviderBinder;
import demibenari.common.authentication.AuthSecurityException;
import demibenari.common.authentication.LDAPSecurityService;
import demibenari.common.authentication.SecurityService;
import demibenari.common.configuration.ConfigProvider;
import demibenari.common.configuration.ConfigProviderImpl;
import demibenari.common.guice.providers.SecurityServiceProvider;

/**
 *
 * Created by Demi Ben-Ari on 12/13/2014.
 */
public class CommonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ConfigProvider.class).to(ConfigProviderImpl.class);
        ThrowingProviderBinder.create(binder())
                .bind(SecurityServiceProvider.class, SecurityService.class);

        // Create & Install a module that uses the @CheckedProvides methods
        install(ThrowingProviderBinder.forModule(this));

        //bind(SecutiryService.class).to(LDAPSecurityService.class);

    }
    @CheckedProvides(SecurityServiceProvider.class) // Define what interface will provide it
    SecurityService provideSecurityService() throws AuthSecurityException {
        return new LDAPSecurityService();
    }
}
