package com.example.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
