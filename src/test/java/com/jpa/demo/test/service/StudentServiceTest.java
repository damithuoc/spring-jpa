package com.jpa.demo.test.service;

import com.jpa.demo.model.Student;
import com.jpa.demo.service.StudentService;
import com.jpa.demo.test.base.BaseTestClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sanandasena on 2/15/2016.
 */
public class StudentServiceTest extends BaseTestClass {

    @Autowired
    private StudentService studentService;

    @Test
    public void testSaveStudent() throws Exception {
        Student student = new Student();
        student.setId(3344343L);
        student.setName("test");

        Boolean savedStatus = studentService.saveStudent(student);

    }
}
