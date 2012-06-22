package noGuice.common;

public class SendMail implements Notifier {
    public void sendNotification(String to) {
        System.out.println("Notifying (E-Mail) " + to);
    }
}


