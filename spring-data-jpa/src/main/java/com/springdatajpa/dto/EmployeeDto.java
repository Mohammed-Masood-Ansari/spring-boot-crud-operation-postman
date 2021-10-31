package com.springdatajpa.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeDto implements Serializable {

	@Id
	private int empid;
	@Column
	private String empName;
	@Column
	private String empEmail;
	
}
