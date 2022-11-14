package com.ty.springbootcrudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.springbootcrudoperation.dao.StudentDao;
import com.ty.springbootcrudoperation.dto.ResponseStructure;
import com.ty.springbootcrudoperation.dto.Student;
import com.ty.springbootcrudoperation.exception.IdNotFoundException;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public ResponseStructure<Student> saveStudent(Student student) {
		
		Student student2 = dao.saveStudent(student);
		
		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();
		
		if(student2!=null) {
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMsg("successfully created");
			responseStructure.setData(student2);
		}
		return responseStructure;
	}

	public ResponseStructure<List<Student>> getAllStudent() {
		
		ResponseStructure<List<Student>> responseStructure = new ResponseStructure<List<Student>>();
		
		List<Student> list =dao.getAllStudent();
		
		if(list.get(0)!=null) {
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
			responseStructure.setMsg("student is  present");
			responseStructure.setData(list);
		}
		else {
			throw new IdNotFoundException("data is not present in db");
		}
		
		return responseStructure;
	}

	public ResponseStructure<Student> getStudentById(int id) {
		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();

		Student student = dao.getStudentById(id);
		
		if(student!=null) {
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMsg("student is  present");
			responseStructure.setData(student);
		}else {
			throw new IdNotFoundException("id is not found please check it");
		}
		
		return responseStructure;
	}

	public ResponseStructure<Student> deleteStudentById(int id) {
		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();

		Student student =  dao.deleteStudentById(id);
		
		if(student!=null) {
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMsg("student is  deleted");
			responseStructure.setData(student);
		}else {
			throw new IdNotFoundException("id is not found please check it before deletion");
		}
		return responseStructure;
	}
	
	public ResponseStructure<Student> updateStudentById(Student student,int id) {
		
		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();

		Student student2 =  dao.updateStudentById(student,id);
		
		if(student2!=null) {
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMsg("student is  updated");
			responseStructure.setData(student);
		}else {
			throw new IdNotFoundException("id is not found please check it");
		}
		return responseStructure;
	}
}
