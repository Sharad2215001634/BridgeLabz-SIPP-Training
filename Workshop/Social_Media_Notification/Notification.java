package Workshop.Social_Media_Notification;
import java.util.*;
abstract class Notification {
    String message;
    Date timestamp;

    Notification(String message){
        this.message = message;
        this.timestamp = new Date();
    }
    abstract void display();
    
}
