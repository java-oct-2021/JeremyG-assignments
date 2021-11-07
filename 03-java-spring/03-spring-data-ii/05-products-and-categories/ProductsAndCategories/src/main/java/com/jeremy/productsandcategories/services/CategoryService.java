package com.jeremy.productsandcategories.services;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findCategory(Long id) {
		Optional<Category> cat = categoryRepository.findById(id);
		if(cat.isPresent()) {
			return cat.get();
		} else {
			return null;
		}
	}
	
	public Category create(Category category) {
		return categoryRepository.save(category);
	}
}