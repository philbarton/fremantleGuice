package guice.common;

import com.google.inject.ImplementedBy;

@ImplementedBy(SendMail.class)
public interface Notifier {
    public void sendNotification(String to);
}
