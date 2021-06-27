package com.dealbab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealbab.model.Category;
import com.dealbab.repository.CategoryRepository;

@Service
public class CategoryService {
@Autowired
public CategoryRepository categoryRepository;
	public Category createCategory(Category category) {
		
		return categoryRepository.save(category);
	}
public Optional<Category> checkCategoryById(Integer id) {
	
	return categoryRepository.findById(id);
}
public List<Category> getAllCategory() {
	
	return categoryRepository.findAll();
}
public void deleteCategory(Integer id) {
	
	categoryRepository.deleteById(id);
	
	
}

}
