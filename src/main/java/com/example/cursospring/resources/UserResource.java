package com.example.cursospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursospring.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u1 = new User(1L, "Maria", "maria@maria", "1234456798", "aindabem");
		return ResponseEntity.ok().body(u1);
	}
}
