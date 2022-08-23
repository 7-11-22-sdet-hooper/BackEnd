package com.ReviewSite.ReviewSite.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReviewSite.ReviewSite.model.Vocab;
import com.ReviewSite.ReviewSite.repositories.VocabRepository;
@RequestMapping("api/vocab")
@RestController
public class VocabController {
	VocabRepository vocabRepo;
	
	public VocabController(VocabRepository vocabRepo) {
		this.vocabRepo = vocabRepo;
	}

	@GetMapping("")
	public Iterable<Vocab> getVocab() {
		
		//Vocab inheritance = new Vocab("OOP", "inheritance", "One of the four pillars of OOP, this solves the problem of redundant code by allowing more specific versions of a class to use an existing implementation of fields or methods");
		//return inheritance;
		
		return vocabRepo.findAll();
	}
	@GetMapping("category/{category}")
	public Iterable<Vocab> getVocabByCategory(@PathVariable String category){
		return vocabRepo.findByCategory(category).get();
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
	

