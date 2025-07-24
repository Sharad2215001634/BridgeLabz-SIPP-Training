package Generics.Online_Exam_System;

import java.util.*;

public class ExamSystem {


    public <T> void takeExam(Student student, Subject<T> subject, Scanner scanner) {
        for (Question<T> question : subject.getQuestions()) {
            System.out.println(question.getQuestionText());
            for (Map.Entry<Character, T> entry : question.getOptions().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.print("Your Answer (A/B/C/D): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if(input.length() > 0) {
                Character chosen = input.charAt(0);
                student.submitAnswer(subject, question, chosen);
            }
        }
    }

    public <T> int calculateScore(Student student, Subject<T> subject) {
        int score = 0;
        Map<Question<?>, Object> answers = student.getSubmittedAnswers().getOrDefault(subject, Collections.emptyMap());
        for (Question<T> question : subject.getQuestions()) {
            Object answer = answers.get(question);
            if (answer != null && answer.equals(question.getCorrectOption())) {
                score++;
            }
        }
        return score;
    }
}

