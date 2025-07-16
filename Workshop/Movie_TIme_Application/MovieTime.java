package Workshop.Movie_TIme_Application;

import java.util.*;

public class MovieTime {
    ArrayList<Show> shows;
    MovieTime(){
        shows = new ArrayList<>();
    }
    void addShow(Show newShow){
        int i = shows.size()-1;
        while(i >= 0 && shows.get(i).getTime() > newShow.getTime()){
            i--;
        }
        shows.add(i+1 , newShow);
    }
        void display(){
            System.out.println("Upcoming Shows");
            for(Show show:shows){
                show.display();
            }
        }
}
