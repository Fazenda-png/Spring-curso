package com.example.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
