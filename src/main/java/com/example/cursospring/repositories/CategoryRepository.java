package com.example.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
