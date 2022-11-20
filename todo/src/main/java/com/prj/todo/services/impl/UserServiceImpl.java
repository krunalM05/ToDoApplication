package com.prj.todo.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prj.todo.entities.User;
import com.prj.todo.repositories.UserRepository;
import com.prj.todo.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(int userId) {
		
		return userRepo.findById(userId);
	}

	@Override
	public User getUserByUsername(String username, String password) {
		
		return userRepo.findByUsernameAndPassword(username, password);
	}

	@Override
	public List<User> getAllUser() {
	
		return userRepo.findAll();
	}

}
