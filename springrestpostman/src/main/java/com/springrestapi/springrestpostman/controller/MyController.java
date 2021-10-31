package com.springrestapi.springrestpostman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestpostman.dto.Course;
import com.springrestapi.springrestpostman.service.CourseService;

@RestController
public class MyController {
	//this is for creating the object thats why wrote here @Autowired
	@Autowired
	private CourseService service;
	
	@GetMapping("/home")
	public String getData() {
		return "Welcome to Spring-RestApi-World";
	}

	@GetMapping("/home1")
	public String getData1() {
		return "Welcome to Spring-RestApi-Duniya";
	}
	
	
	//this is for mapping the course_service method here getting all the data
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return this.service.getCourse();
	}
	
	//this is for getting single data
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		
		return this.service.getCourses(Long.parseLong(courseId));
	}
	
	//this is for adding the data
	@PostMapping(path="/courses",consumes="application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourse(course);
	}
	
	//Updating the code
	@PutMapping(path="/courses",consumes="application/json")
	public Course updateCourse(@RequestBody Course course) {
		return this.service.updateCourse(course);
	}
}
