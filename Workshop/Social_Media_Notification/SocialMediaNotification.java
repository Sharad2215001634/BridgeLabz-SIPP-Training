package Workshop.Social_Media_Notification;
import java.util.*;


public class SocialMediaNotification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotificationFeed userFeed = new NotificationFeed();
        userFeed.addNotification(new LikeNotification("Sharad liked your photo"));
        userFeed.addNotification(new CommentNotification("Saurabh commented on your post"));
        userFeed.displayFeed();
        sc.close();
    }
}


