package com.cms.studentproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)

    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String course;

    public Student(String name, String course){
        this.name = name;
        this.course = course;
    }

    public Student() {

    }


    public long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
