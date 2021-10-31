package com.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.dao.EmployeeDao;
import com.springdatajpa.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public EmployeeDto addData(EmployeeDto dto) {
		
		return dao.save(dto);
	}

	@Override
	public void delete(int id) {
		
		EmployeeDto dto=dao.findByempid(id);
		
		dao.delete(dto);
	}

	@Override
	public EmployeeDto updateData(EmployeeDto id) {
		
		return dao.save(id);

	}

	@Override
	public EmployeeDto getData(int id) {
		
		return dao.findByempid(id);
	}

	@Override
	public List<EmployeeDto> getAllData() {
		return (List<EmployeeDto>) dao.findAll();
	}

}
