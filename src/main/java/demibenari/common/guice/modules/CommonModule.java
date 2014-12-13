package demibenari.common.guice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.throwingproviders.ThrowingProviderBinder;
import demibenari.common.authentication.LDAPSecurityService;
import demibenari.common.authentication.SecutiryService;
import demibenari.common.configuration.ConfigProvider;
import demibenari.common.configuration.ConfigProviderImpl;
import demibenari.common.guice.providers.SecurityServiceProvider;

/**
 *
 * Created by Demi on 12/13/2014.
 */
public class CommonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ConfigProvider.class).to(ConfigProviderImpl.class);
        ThrowingProviderBinder.create(binder())
                .bind(SecurityServiceProvider.class, SecutiryService.class);

        bind(SecutiryService.class).to(LDAPSecurityService.class);
    }
}
