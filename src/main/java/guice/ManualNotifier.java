package guice;

import guice.common.Notifier;

public class ManualNotifier implements Notifier {
    @Override
    public void sendNotification(String to) {
        System.out.println("Walk over and tell " + to);
    }
}
