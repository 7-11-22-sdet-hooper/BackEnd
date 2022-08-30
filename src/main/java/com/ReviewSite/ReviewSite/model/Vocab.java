package com.ReviewSite.ReviewSite.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
//This is the data structure of a vocabulary word. It holds the word, definition, 
//category, and id of a vocabulary word.
public class Vocab {

public String word;
public String definition;

@ManyToOne
public Category category;

@Id
@GeneratedValue
public long id;
public Vocab(Category category, String word, String definition) {
	this.category = category;
	this.word = word;
	this.definition = definition;
}
public Vocab() {
}


}
