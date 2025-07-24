package Generics.Online_Exam_System;
import java.util.*;

public class Subject<T> {
    private String name;
    private List<Question<T>> questions;

    public Subject(String name){
        this.name = name;
        this.questions = new ArrayList<>();
        
    }

    public void addQuestion(Question<T> question){
        questions.add(question);
    }

    public String getName(){
        return name;
    }
    public List<Question<T>> getQuestions(){
        return questions;
    }
}
