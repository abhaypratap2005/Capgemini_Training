package com.cms;

import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class EmployeeDaoTest {

    EmployeeDao obj = new EmployeeDao();

    @Test
    void testPrintAllEmployee() {
        try {
            obj.printAllEmployees();
        } catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
    }

    @Test
    void testAddEmployee() {

        try {
            Date hire_date = Date.valueOf("2000-05-12");
            Double salary = 58200.0;
            int employee_id = 208;
            Integer manager_id = 200;
            Integer department_id = null;
            String phone_number = "345678";
            String first_name = "Abhay";
            String last_name = "Singh";

            Employee emp = new Employee(
                    hire_date,
                    salary,
                    employee_id,
                    manager_id,
                    department_id,
                    phone_number,
                    first_name,
                    last_name
            );

            System.out.println(emp);

            Employee employee = obj.addEmployee(emp);

            assertNotNull(employee);

        } catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
    }
}