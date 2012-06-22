package guice;

import com.google.inject.AbstractModule;
import guice.common.Notifier;

public class CustomerProviderModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Notifier.class).toProvider(NotifierProvider.class);
    }
}
