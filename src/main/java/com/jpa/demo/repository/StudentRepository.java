package com.jpa.demo.repository;

import com.jpa.demo.model.Student;

/**
 * Created by sanandasena on 2/15/2016.
 */
public interface StudentRepository {

    Boolean saveStudent(Student student);
}
