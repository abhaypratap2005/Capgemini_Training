package com.cms.studentproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)

    private long id;

    private String name;
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
