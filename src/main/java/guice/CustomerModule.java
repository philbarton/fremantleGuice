package guice;

import com.google.inject.AbstractModule;
import guice.common.Notifier;
import guice.common.SendSMS;

public class CustomerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Notifier.class).to(SendSMS.class);
    }
}
