package Workshop.Movie_TIme_Application;

public class Show {
    String title;
    String time;

    Show(String title , String time){
        this.title = title;
        this.time = time;
    }

    int getTime(){
        int hour = (time.charAt(0) - '0')*10 + (time.charAt(1) - '0');
        int minute = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
	    return hour * 60 + minute;

    }

    void display(){
        System.out.println(time + " - " + title); 
    }
    
}
