package com.galgotia.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.galgotia.EntityManagerFactoryConnectionMain;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.galgotia.EMP;

class EMPDaoTest {

    private static EMPDao dao;

    @BeforeAll
    static void setup() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory();
        dao = new EMPDao();
        System.out.println("Connection Initialized");
    }

    @Test
    void testGetEmployee() {
        EMP employee = dao.getEmployee(100);

        assertNotNull(employee);
        assertEquals(100, employee.getEmpno());
        assertEquals("Steven", employee.getEname());

        System.out.println(employee);
    }

    @AfterAll
    static void closeConnection() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory().close();
        System.out.println("Connection Closed");
    }
}
