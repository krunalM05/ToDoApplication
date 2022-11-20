package com.prj.todo.services;

import java.util.List;

import com.prj.todo.entities.User;

public interface UserService {
	
	User saveUser(User user);
	
	User getUserById(int userId);
	
	User getUserByUsername(String username, String password);
	
	List<User> getAllUser();
	
	
}
