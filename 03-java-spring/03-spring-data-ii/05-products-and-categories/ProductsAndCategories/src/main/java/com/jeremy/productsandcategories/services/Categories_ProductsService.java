package com.jeremy.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeremy.productsandcategories.models.Categories_Products;
import com.jeremy.productsandcategories.repositories.Categories_ProductsRepository;

@Service
public class Categories_ProductsService {
	private final Categories_ProductsRepository categories_ProductsRepository;
	
	public Categories_ProductsService(Categories_ProductsRepository categories_ProductsRepository) {
		this.categories_ProductsRepository = categories_ProductsRepository;
	}
	
	public List<Categories_Products> findAll() {
		return categories_ProductsRepository.findAll();
	}
	
	public Categories_Products create(Categories_Products categories_Products) {
		return categories_ProductsRepository.save(categories_Products);
	}
}