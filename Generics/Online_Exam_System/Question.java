package Generics.Online_Exam_System;

import java.util.*;

public class Question<T> {
    private String questionText;
    private Difficulty difficulty;
    private Map<Character, T> options;
    private Character correctOption;

    public Question(String questionText, Difficulty difficulty,
                    Map<Character, T> options, Character correctOption) {
        this.questionText = questionText;
        this.difficulty = difficulty;
        this.options = options;
        this.correctOption = correctOption;
    }
    public String getQuestionText() { return questionText; }
    public Difficulty getDifficulty() { return difficulty; }
    public Map<Character, T> getOptions() { return options; }
    public Character getCorrectOption() { return correctOption; }
}

