package com.ReviewSite.ReviewSite.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ReviewSite.ReviewSite.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByEmail(String email);
}