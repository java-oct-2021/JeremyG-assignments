package com.jeremy.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.productsandcategories.models.Product;
import com.jeremy.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findProduct(Long id) {
		Optional<Product> prod = productRepository.findById(id);
		if(prod.isPresent()) {
			return prod.get();
		} else {
			return null;
		}
	}
	
	public Product create(Product product) {
		return productRepository.save(product);
	}
}
