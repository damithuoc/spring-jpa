package com.jpa.demo.repository.impl;

import com.jpa.demo.model.Student;
import com.jpa.demo.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sanandasena on 2/15/2016.
 */
@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Boolean saveStudent(Student student) {
        LOGGER.info("Entered saveStudent(" + student + ")");
        entityManager.persist(student);
        return Boolean.TRUE;
    }
}
