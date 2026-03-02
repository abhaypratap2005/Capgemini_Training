package com.galgotia.dao;

import com.galgotia.EMP;
import com.galgotia.EntityManagerFactoryConnectionMain;

import jakarta.persistence.EntityManager;

public class EMPDao {

    public EMP getEmployee(int empid) {

        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();

        EMP emp = em.find(EMP.class, empid);

        return emp;
    }
}