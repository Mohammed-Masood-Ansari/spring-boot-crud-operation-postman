package com.springdatajpa.service;

import java.util.List;

import com.springdatajpa.dto.EmployeeDto;


public interface EmployeeServiceInterface {

	public EmployeeDto addData(EmployeeDto dto);
	public void delete(int id);
	public EmployeeDto updateData(EmployeeDto dto);
	public EmployeeDto getData(int id);
	public List<EmployeeDto> getAllData();
	
}