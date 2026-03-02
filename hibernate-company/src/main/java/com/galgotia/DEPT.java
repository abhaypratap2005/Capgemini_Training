package com.galgotia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class DEPT {

    @Id
    @Column(name = "department_id")
    private int deptno;

    @Column(name = "department_name")
    private String dname;

    @Column(name = "manager_id")
    private Integer managerId;

    public int getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public Integer getManagerId() {
        return managerId;
    }

    @Override
    public String toString() {
        return "DEPT [deptno=" + deptno + ", dname=" + dname + ", managerId=" + managerId + "]";
    }
}
