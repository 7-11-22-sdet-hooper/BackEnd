package com.ReviewSite.ReviewSite.controllers;

import com.ReviewSite.ReviewSite.model.MultipleChoice;
import com.ReviewSite.ReviewSite.model.QuestionPair;
import com.ReviewSite.ReviewSite.model.QuizQuestion;
import com.ReviewSite.ReviewSite.repositories.CategoryRepository;
import com.ReviewSite.ReviewSite.repositories.MultipleChoiceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RequestMapping("api/quiz")
@RestController
public class QuizController {

    public MultipleChoiceRepository quizRepo;
    public CategoryRepository categoryRepo;

    public QuizController(MultipleChoiceRepository quizRepo, CategoryRepository categoryRepo) {
        this.quizRepo = quizRepo;
        this.categoryRepo = categoryRepo;
    }

    @RequestMapping("")
    public Iterable<QuizQuestion> getQuiz() {
        ArrayList<QuizQuestion> questions = new ArrayList<>();
        for(MultipleChoice question: quizRepo.findAll()){
            questions.add(QuizQuestion.convertQuestion(question));
        }
        return questions;
    }

    public MultipleChoice getQuizByID(@PathVariable long id) {
        Optional<MultipleChoice> quizOpt = quizRepo.findById(id);
        if (quizOpt.isPresent()) {
            return quizOpt.get();
        } else {
            return null;
        }
    }

    @RequestMapping("/{id}")
    public QuizQuestion question(@PathVariable long id) {

        Optional<MultipleChoice> quizOpt = quizRepo.findById(id);
        MultipleChoice question = quizOpt.get();

        return QuizQuestion.convertQuestion(question);


    }
}


