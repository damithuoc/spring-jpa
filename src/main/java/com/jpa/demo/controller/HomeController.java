package com.jpa.demo.controller;

import com.jpa.demo.model.Student;
import com.jpa.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sanandasena on 2/15/2016.
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String loadHome() {
        LOGGER.info("Entered loadHome()");
        return "index";
    }

    @RequestMapping(value = "/student/save", method = RequestMethod.PUT)
    public ResponseEntity<Void> saveStudent(@RequestBody Student student) {
        LOGGER.info("Entered saveStudent(" + student + ")");
        try {
            studentService.saveStudent(student);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
