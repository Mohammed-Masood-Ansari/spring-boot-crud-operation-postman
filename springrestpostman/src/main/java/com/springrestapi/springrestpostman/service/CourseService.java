package com.springrestapi.springrestpostman.service;

import java.util.List;

import com.springrestapi.springrestpostman.dto.Course;

public interface CourseService {

	public List<Course> getCourse();
	public Course getCourses(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
}
