package guice.common;

import com.google.inject.Inject;

public class Customer {
    private Notifier notifier;

    @Inject
    public Customer(Notifier notifier) {
        this.notifier = notifier;
    }

    public void changeSomething() {
        notifier.sendNotification("the Customer");
    }
}
