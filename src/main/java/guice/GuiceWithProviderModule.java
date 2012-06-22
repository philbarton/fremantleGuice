package guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.common.Customer;

public class GuiceWithProviderModule {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CustomerProviderModule());
        Customer customer = injector.getInstance(Customer.class);
        customer.changeSomething();
    }
}
