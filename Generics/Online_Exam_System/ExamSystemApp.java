package Generics.Online_Exam_System;
import java.util.*;

public class ExamSystemApp {
    public static void main(String[] args) {
        Subject<String> javaSubject = new Subject<>("Java");
        Map<Character, String> javaQ1Options = Map.of('A', "JVM", 'B', "JRE", 'C', "JDK", 'D', "JDB");
        javaSubject.addQuestion(new Question<>("What is Java Virtual Machine?", Difficulty.EASY, javaQ1Options, 'A'));
        Student student = new Student("Sharad", "CS1234");
        ExamSystem system = new ExamSystem();
        Scanner scanner = new Scanner(System.in);
        system.takeExam(student, javaSubject, scanner);
        int score = system.calculateScore(student, javaSubject);
        System.out.println("Score: " + score);
    }
}
