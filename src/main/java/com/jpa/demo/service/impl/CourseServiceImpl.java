package com.jpa.demo.service.impl;

import com.jpa.demo.model.Course;
import com.jpa.demo.repository.CourseRepository;
import com.jpa.demo.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sanandasena on 2/17/2016.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseServiceImpl.class);

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Boolean saveCourse(Course course) throws Exception {
        LOGGER.info("Entered saveCourse(" + course + ")");
        try {
            courseRepository.save(course);
            return Boolean.TRUE;

        } catch (DataAccessException dae) {
            String errorMessage = "Database error while saving course!";
            throw new Exception(errorMessage, dae);
        }
    }

    @Override
    public List<Course> getAllCourses() throws Exception {
        LOGGER.info("Entered getAllCourses()");
        return courseRepository.findAll();
    }
}
