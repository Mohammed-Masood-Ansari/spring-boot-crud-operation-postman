package com.ty.springbootcrudoperation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springbootcrudoperation.dto.ResponseStructure;
import com.ty.springbootcrudoperation.dto.Student;
import com.ty.springbootcrudoperation.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/savestudent")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student) {
		
		return service.saveStudent(student);
		
	}
	
	@GetMapping("/getallstudent")
	public ResponseStructure<List<Student>> getAllStudent(){
		
		return service.getAllStudent();
	}
	
	@GetMapping("/getstudentbyid/{id}")
	public ResponseStructure<Student> getStudentById(@PathVariable int id) {

		return service.getStudentById(id);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public ResponseStructure<Student> deleteStudentById(@PathVariable int id) {
		 return service.deleteStudentById(id);
	}
	
	@PutMapping("/updatestudent/{id}")
	public ResponseStructure<Student> updateStudentById(@RequestBody Student student,@PathVariable int id) {

		return service.updateStudentById(student,id);
	}
}
