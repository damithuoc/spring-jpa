package com.jpa.demo.service;

import com.jpa.demo.model.Course;

import java.util.List;

/**
 * Created by sanandasena on 2/17/2016.
 */
public interface CourseService {

    Boolean saveCourse(Course course) throws Exception;

    List<Course> getAllCourses() throws Exception;
}
