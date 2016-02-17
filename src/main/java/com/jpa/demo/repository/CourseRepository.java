package com.jpa.demo.repository;

import com.jpa.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sanandasena on 2/17/2016.
 */
@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {

}
