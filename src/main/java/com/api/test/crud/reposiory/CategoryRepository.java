package com.api.test.crud.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.test.crud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	Category findByName(String name);

}
