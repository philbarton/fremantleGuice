package guice;

import com.google.inject.Provider;
import guice.common.Notifier;

public class NotifierProvider implements Provider<Notifier> {
    @Override
    public Notifier get() {
        return new ManualNotifier();  // Get object from a special place
    }
}
