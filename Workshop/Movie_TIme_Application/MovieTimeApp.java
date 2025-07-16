package Workshop.Movie_TIme_Application;

public class MovieTimeApp {

    public static void main(String[] args) {
        MovieTime m = new MovieTime();
        m.addShow(new Show("Iron Man", "08:00"));
        m.addShow(new Show("Super Man", "05:00"));
        m.addShow(new Show("Spider Man", "14:00"));
        m.addShow(new Show("Bat Man", "12:00"));

        m.display();

    }
    
}
