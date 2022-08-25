package com.ReviewSite.ReviewSite.model;

import javax.persistence.*;
import java.util.Collection;


@Entity
public class Category {

	@Id
    public long id;
    
    public String name;
    @OneToMany(mappedBy="category")
    Collection<Vocab> vocab;
    
    @OneToMany(mappedBy="category")
    Collection<MultipleChoice> quiz;

    



}
