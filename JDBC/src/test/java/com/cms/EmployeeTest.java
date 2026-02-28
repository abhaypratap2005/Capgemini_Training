package com.cms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class EmployeeTest {

    @Test
    void testGetEmployee() {

        EmployeeDao dao = new EmployeeDao();

        try {
            Employee emp = dao.getEmployee(100);
            assertNotNull(emp);
        } catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
    }
}

