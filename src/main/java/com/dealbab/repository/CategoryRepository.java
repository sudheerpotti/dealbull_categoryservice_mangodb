package com.dealbab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealbab.model.Category;

public interface CategoryRepository extends MongoRepository<Category, Integer> {

}
