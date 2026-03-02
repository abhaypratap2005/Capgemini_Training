package com.galgotia;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
@Table(name = "employee")
public class EMP {

    @Id
    @Column(name = "employee_id")
    private int empno;

    @Column(name = "first_name")
    private String ename;

    @Column(name = "job_title")
    private String job;

    @Column(name = "salary")
    private double sal;

    // Getters

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "EMP [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
    }
}
