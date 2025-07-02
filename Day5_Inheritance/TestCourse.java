package Day5_Inheritance;

class Course {
    String courseName;
    int duration;

    Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int duration, String platform, boolean recorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = recorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;

    PaidOnlineCourse(String name, int duration, String platform, boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName + ", Platform: " + platform + ", Fee: " + fee);
    }
}

public class TestCourse {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 30, "Udemy", true, 2999, 20);
        poc.showCourseDetails();
    }
}
