package noGuice.common;

public class Customer {
    private Notifier notifier;

    public Customer() {
        notifier = new SendMail();
    }

    public void changeSomething() {
        notifier.sendNotification("the Customer");
    }
}
