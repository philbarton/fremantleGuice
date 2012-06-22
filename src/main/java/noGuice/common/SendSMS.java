package noGuice.common;

public class SendSMS implements Notifier {
    public void sendNotification(String to) {
        System.out.println("Notifying (SMS) " + to);
    }
}
