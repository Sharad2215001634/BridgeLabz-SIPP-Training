package Workshop.Social_Media_Notification;

public class CommentNotification extends Notification{
    CommentNotification(String message) {
        super(message);
    }

    void display() {
        System.out.println("[Comment] " + message + " at " + timestamp);
    }
    
}
