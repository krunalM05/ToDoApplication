package com.prj.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.todo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findById(int Id);
	
	User findByUsernameAndPassword(String username, String password);
	
	User findByUsername(String username);
	
	User findByPassword(String password);
	
}
