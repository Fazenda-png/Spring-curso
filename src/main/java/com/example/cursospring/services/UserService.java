package com.example.cursospring.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.cursospring.entities.User;
import com.example.cursospring.repositories.UserRepository;
import com.example.cursospring.services.exceptions.DatabaseException;
import com.example.cursospring.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long Id) {
		Optional<User> obj = userRepository.findById(Id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(Id));
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public void delete(Long Id) {
		try {
			userRepository.deleteById(Id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(Id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {
		try {
			User entity = userRepository.getOne(id);
			updateData(entity, obj);
			return userRepository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
