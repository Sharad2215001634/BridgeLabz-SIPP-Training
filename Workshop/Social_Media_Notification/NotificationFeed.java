package Workshop.Social_Media_Notification;
import java.util.*;
class NotificationFeed {
    private LinkedList<Notification> feed = new LinkedList<>();

    public void addNotification(Notification notification) {
        feed.addFirst(notification); 

    }
    public void displayFeed() {
        for (Notification n : feed) {
            n.display();
        }
    }
}