package com.ReviewSite.ReviewSite.repositories;

import com.ReviewSite.ReviewSite.model.Category;
import com.ReviewSite.ReviewSite.model.Vocab;
import org.springframework.data.repository.CrudRepository;

import com.ReviewSite.ReviewSite.model.MultipleChoice;

import java.util.Collection;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface VocabRepository extends CrudRepository<Vocab, Long> {

        Collection<Vocab> findByCategory(Category category);
}