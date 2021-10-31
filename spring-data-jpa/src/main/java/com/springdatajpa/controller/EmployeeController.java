package com.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.dto.EmployeeDto;
import com.springdatajpa.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/add")
	public EmployeeDto add(@RequestBody EmployeeDto dto) {
		return employeeServiceImpl.addData(dto);
	}
	
	@GetMapping("/getdata/{id}")
	public EmployeeDto getData(@PathVariable int id) {
		
		return employeeServiceImpl.getData(id);
	}
	
	@PutMapping
	public EmployeeDto updateData(@RequestBody EmployeeDto dto) {
		
		return employeeServiceImpl.updateData(dto);
		
	}
}