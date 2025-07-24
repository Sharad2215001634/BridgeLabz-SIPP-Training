package Generics.Online_Exam_System;
import java.util.*;


public class Student {
    private String name;
    private String rollNo;
    
    private Map<Subject<?>, Map<Question<?>, Object>> submittedAnswers = new HashMap<>();

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

        public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }


    public void submitAnswer(Subject<?> subject, Question<?> question, Object answer) {
        submittedAnswers
            .computeIfAbsent(subject, k -> new HashMap<>())
            .put(question, answer);
    }

    public Map<Subject<?>, Map<Question<?>, Object>> getSubmittedAnswers() {
        return submittedAnswers;
    }
}
