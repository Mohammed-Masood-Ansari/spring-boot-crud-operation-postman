package com.ty.springbootcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.springbootcrudoperation.dto.Student;


public interface StudentRepository extends JpaRepository<Student,Integer>{

}
