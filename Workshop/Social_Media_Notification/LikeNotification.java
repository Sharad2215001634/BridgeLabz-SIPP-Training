package Workshop.Social_Media_Notification;

class LikeNotification extends Notification {
    LikeNotification(String message){
        super(message);
    }
    void display(){
        System.out.println(" [Like] " + message + " at "+ timestamp);
    }
}
