package com.jpa.demo.service.impl;

import com.jpa.demo.model.Student;
import com.jpa.demo.repository.StudentRepository;
import com.jpa.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sanandasena on 2/15/2016.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public Boolean saveStudent(Student student) {
        LOGGER.info("Entered saveStudent(" + student + ")");
        return studentRepository.saveStudent(student);
    }
}
