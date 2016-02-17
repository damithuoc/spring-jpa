package com.jpa.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by sanandasena on 2/16/2016.
 */
@Entity
@Table(name = "COURSE")
public class Course implements Serializable {
    private static final long serialVersionUID = -4277092597410362807L;

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @Column(name = "COURSE_ID")
    @NotNull
    private String courseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
