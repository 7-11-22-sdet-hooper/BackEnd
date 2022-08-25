package com.ReviewSite.ReviewSite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MultipleChoice {
@Id
@GeneratedValue
public long id;

@ManyToOne
public Category category;

public String question;

public String a;
public String b;
public String c;
public String d;
public String correctAnswer;


public MultipleChoice(Category category, String question, String a, String b, String c, String d,
					  String correctAnswer) {
	this.category = category;
	this.question = question;
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
	this.correctAnswer = correctAnswer;
}


public MultipleChoice() {
}


}
