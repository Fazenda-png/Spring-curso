package com.example.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursospring.entities.Order;
import com.example.cursospring.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findById(Long Id) {
		Optional<Order> obj = orderRepository.findById(Id);
		return obj.get();
	}
}
