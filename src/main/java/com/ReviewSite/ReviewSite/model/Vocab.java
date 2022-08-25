package com.ReviewSite.ReviewSite.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vocab {

	@Id
	@GeneratedValue
	public long id;

	public String word;
	public String definition;

	@ManyToOne
	public Category category; // should this be a category or perhaps just a string?

	public Vocab(Category category, String word, String definition) {
		this.category = category;
		this.word = word;
		this.definition = definition;
	}

	public Vocab() {
	}

}
