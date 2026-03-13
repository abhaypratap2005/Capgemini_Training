package com.cms.bootcompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cms.bootcompany.model.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Component
public class DepartmentDaoImpl implements DepartmentDao {
    @Autowired
    EntityManagerFactory emf;


    @Override
    public Department find(int departmentId) {
        EntityManager em = emf.createEntityManager();
        Department department = em.find(Department.class, departmentId);
        return department;
    }
}