package com.prj.todo.entities.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prj.todo.entities.User;
import com.prj.todo.services.UserService;

@RestController
@RequestMapping("/todoapp/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		System.out.println(user1.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping("/id")
	public ResponseEntity<User> getUser(@Param(value="userId") int userId){
		User user1 = userService.getUserById(userId);
		return ResponseEntity.status(HttpStatus.OK).body(user1);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> userList = userService.getAllUser();
		System.out.println(userList.toString());
		return ResponseEntity.status(HttpStatus.OK).body(userList);
	}
}
