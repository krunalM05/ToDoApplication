package com.prj.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prj.todo.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

	Course findByName(String name);
	
	List<Course> findAllByUsername(String username);
}
