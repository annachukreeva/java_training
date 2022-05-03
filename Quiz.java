package com.classes.homework;

public class Quiz {
    public static void main(String[] args) {
        Questions questions = new Questions();
        Answers answers = new Answers();
        CorrectAnswers correctAnswers = new CorrectAnswers();
        for (int i = 0; i < 3; i++) {
            questions.GetQuestions(i);
            answers.GetAnswers(i);
            correctAnswers.receiveAnswer(i);
        }
        correctAnswers.getTotalResult();
    }
}

