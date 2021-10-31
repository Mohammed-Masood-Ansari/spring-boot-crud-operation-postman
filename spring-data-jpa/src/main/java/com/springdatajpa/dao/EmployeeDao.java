package com.springdatajpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.dto.EmployeeDto;


public interface EmployeeDao extends CrudRepository<EmployeeDto, Integer> {

	
	
	public EmployeeDto findByempid(int id);
	
	
}
