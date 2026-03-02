package com.galgotia.dao;

import com.galgotia.DEPT;
import com.galgotia.EntityManagerFactoryConnectionMain;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DEPTDaoTest {

    private static DEPTDao dao;

    @BeforeAll
    static void setup() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory();
        dao = new DEPTDao();
        System.out.println("Connection Initialized");
    }

    @Test
    void testGetDepartment() {
        DEPT dept = dao.getDepartment(10);

        assertNotNull(dept);
        assertEquals(10, dept.getDeptno());

        System.out.println(dept);
    }

    @AfterAll
    static void closeConnection() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory().close();
        System.out.println("Connection Closed");
    }
}
