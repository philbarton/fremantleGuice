package noGuice;

import noGuice.common.Customer;

public class MainNoDI {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.changeSomething();
    }
}