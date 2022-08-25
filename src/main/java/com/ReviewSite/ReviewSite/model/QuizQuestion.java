package com.ReviewSite.ReviewSite.model;

import java.util.Arrays;
import java.util.Collection;

public class QuizQuestion {
    public String question;
    public Collection<QuestionPair> choices;

    public QuizQuestion(String question, QuestionPair[] choices) {
        this.question = question;
        this.choices = Arrays.asList(choices);
    }
    public static QuizQuestion convertQuestion(MultipleChoice question){
        QuestionPair[] answerChoices = new QuestionPair[4];
        answerChoices[0] = new QuestionPair(question.a, question.correctAnswer.equalsIgnoreCase("a"));
        answerChoices[1] = new QuestionPair(question.b, question.correctAnswer.equalsIgnoreCase("b"));
        answerChoices[2] = new QuestionPair(question.c, question.correctAnswer.equalsIgnoreCase("c"));
        answerChoices[3] = new QuestionPair(question.d, question.correctAnswer.equalsIgnoreCase("d"));
        return new QuizQuestion(question.question, answerChoices);
    }
}
