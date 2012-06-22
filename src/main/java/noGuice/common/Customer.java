package noGuice.common;

public class Customer {
    private Notifier notifier;

    public Customer() {
        this.notifier = new SendMail();
    }

    public void changeSomething() {
        notifier.sendNotification("the Customer");
    }
}
