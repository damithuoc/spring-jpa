package com.jpa.demo.controller;

import com.jpa.demo.model.Course;
import com.jpa.demo.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sanandasena on 2/17/2016.
 */
@Controller
@RequestMapping(value = "/course")
public class CourseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    public ResponseEntity<Void> saveCourse(@RequestBody Course course) throws Exception {
        LOGGER.info("Entered saveCousre(" + course + ")");

        try {
            courseService.saveCourse(course);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Course>> getAllCourses() throws Exception {
        LOGGER.info("Entered getAllCourses()");
        try {
            List<Course> courseList = courseService.getAllCourses();
            return new ResponseEntity<>(courseList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
