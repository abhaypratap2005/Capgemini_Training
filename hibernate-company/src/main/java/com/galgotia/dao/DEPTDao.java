package com.galgotia.dao;

import com.galgotia.DEPT;
import com.galgotia.EntityManagerFactoryConnectionMain;
import jakarta.persistence.EntityManager;

public class DEPTDao {

    public DEPT getDepartment(int deptId) {
        EntityManager em = EntityManagerFactoryConnectionMain.getEntityManger();
        return em.find(DEPT.class, deptId);
    }
}
