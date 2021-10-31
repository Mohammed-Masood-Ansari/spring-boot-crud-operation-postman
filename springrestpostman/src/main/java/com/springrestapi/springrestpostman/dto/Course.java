package com.springrestapi.springrestpostman.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Course implements Serializable{

	private int courseId;
	private String courseName;
	private String courseType;
	
	
	  public Course(int courseId, String courseName, String courseType) { super();
	  this.courseId = courseId; this.courseName = courseName; this.courseType =
	  courseType;
	  
	  }
	 
}
