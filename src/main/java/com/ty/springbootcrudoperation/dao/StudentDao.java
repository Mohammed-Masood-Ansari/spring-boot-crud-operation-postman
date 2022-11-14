package com.ty.springbootcrudoperation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springbootcrudoperation.dto.Student;
import com.ty.springbootcrudoperation.repository.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository repository;

	public Student saveStudent(Student student) {

		return repository.save(student);

	}

	public List<Student> getAllStudent() {

		return repository.findAll();

	}

	public Student getStudentById(int id) {

		Optional<Student> optional = repository.findById(id);

		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public Student deleteStudentById(int id) {

		Optional<Student> optional = repository.findById(id);

		if (!optional.isEmpty()) {

			repository.delete(optional.get());
			
			return optional.get();
		} 
		
		return null;
	}

	public Student updateStudentById(Student student, int id) {

		Optional<Student> optional = repository.findById(id);

		if (!optional.isEmpty()) {

			return repository.save(student);
			
		} 
		
		return null;
	}
}
