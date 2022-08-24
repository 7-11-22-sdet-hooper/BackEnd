package com.ReviewSite.ReviewSite.controllers;

import java.util.Optional;

import com.ReviewSite.ReviewSite.model.Category;
import com.ReviewSite.ReviewSite.model.Vocab;
import com.ReviewSite.ReviewSite.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReviewSite.ReviewSite.model.MultipleChoice;
import com.ReviewSite.ReviewSite.repositories.VocabRepository;
@RequestMapping("api/vocab")
@RestController
public class VocabController {
	VocabRepository vocabRepo;
	CategoryRepository categoryRepo;

	public VocabController(VocabRepository vocabRepo, CategoryRepository categoryRepo) {
		this.vocabRepo = vocabRepo;
		this.categoryRepo = categoryRepo;
	}

	@GetMapping("")
	public Iterable<Vocab> getVocab() {
		
		//Vocab inheritance = new Vocab("OOP", "inheritance", "One of the four pillars of OOP, this solves the problem of redundant code by allowing more specific versions of a class to use an existing implementation of fields or methods");
		//return inheritance;
		
		return vocabRepo.findAll();
	}
	@GetMapping("category/{category}")
	public Iterable<Vocab> getVocabByCategory(@PathVariable String category){
		Category cat = categoryRepo.findByName(category).get();
		return vocabRepo.findByCategory(cat);
	}
	@GetMapping("/{id}")
	public Vocab getVocabByID(@PathVariable long id){
		Optional<Vocab> wordOpt=vocabRepo.findById(id);
		if(wordOpt.isPresent()){
			return wordOpt.get();
		}
		else{
			return null;
		}
	}
}
	

