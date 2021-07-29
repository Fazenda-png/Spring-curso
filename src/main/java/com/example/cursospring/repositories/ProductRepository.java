package com.example.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
