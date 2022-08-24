package com.ReviewSite.ReviewSite.controllers;

import com.ReviewSite.ReviewSite.model.MultipleChoice;
import com.ReviewSite.ReviewSite.repositories.CategoryRepository;
import com.ReviewSite.ReviewSite.repositories.MultipleChoiceRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
    public Iterable<MultipleChoice> getQuiz() {
        return quizRepo.findAll();
    }
    @RequestMapping("/{id}")
    public MultipleChoice getQuizByID(@PathVariable long id){
        Optional<MultipleChoice> quizOpt=quizRepo.findById(id);
        if(quizOpt.isPresent()){
            return quizOpt.get();
        }
        else{
            return null;
        }
    }
}
