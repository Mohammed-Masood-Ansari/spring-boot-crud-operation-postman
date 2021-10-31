package com.springrestapi.springrestpostman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestpostman.dto.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<Course>();
		list.add(new Course(1,"java","technical"));
		list.add(new Course(2,"Management","Non-Technical"));
		list.add(new Course(3,"C-Language","Technical"));
		list.add(new Course(4,"J-UNIT","Testing"));
		
	}
	
	@Override
	public List<Course> getCourse() {
		return list;
	}

	@Override
	public Course getCourses(long courseId) {
		
		Course c = null;
		for (Course course : list) {
			
			if(course.getCourseId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		return course;
		
	}


	@Override
	public Course updateCourse(Course course) {
		
		for (Course course1 : list) {
			
			if(course1.getCourseId()==course.getCourseId()) {
			
				course1.setCourseName(course.getCourseName());
				course1.setCourseType(course.getCourseType());
				list.add(course1);
			}
		}
		
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		
		
	}
	
	

}
