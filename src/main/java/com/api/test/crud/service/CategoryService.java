package com.api.test.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.test.crud.entities.Category;
import com.api.test.crud.reposiory.CategoryRepository;

@Service
public class CategoryService {
	
	 @Autowired
	    private CategoryRepository repository;

	    public Category saveProduct(Category category) {
	        return repository.save(category);
	    }

	    public List<Category> saveProducts(List<Category> categories) {
	        return repository.saveAll(categories);
	    }

	    public List<Category> getProducts() {
	        return repository.findAll();
	    }

	    public Category getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Category getProductByName(String name) {
	        return repository.findByName(name);
	    }

	    public String deleteProduct(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

	    public Category updateProduct(Category category) {
	        Category existingProduct = repository.findById(category.getId()).orElse(null);
	        existingProduct.setName(category.getName());
	        existingProduct.setQuantity(category.getQuantity());
	        existingProduct.setPrice(category.getPrice());
	        return repository.save(existingProduct);
	    }

}
