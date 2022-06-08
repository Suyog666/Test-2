package com.api.test.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.crud.entities.Category;
import com.api.test.crud.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
    private CategoryService service;

    @PostMapping("/addcategory")
    public Category addProduct(@RequestBody Category category) {
        return service.saveProduct(category);
    }

    @PostMapping("/addcategorys")
    public List<Category> addProducts(@RequestBody List<Category> categories) {
        return service.saveProducts(categories);
    }

    @GetMapping("/category")
    public List<Category> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/categoryById/{id}")
    public Category findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/category/{name}")
    public Category findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Category updateProduct(@RequestBody Category category) {
        return service.updateProduct(category);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
	
	
}
