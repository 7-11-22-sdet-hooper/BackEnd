package com.ReviewSite.ReviewSite.repositories;

import com.ReviewSite.ReviewSite.model.MultipleChoice;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MultipleChoiceRepository extends CrudRepository<MultipleChoice, Long> {

}