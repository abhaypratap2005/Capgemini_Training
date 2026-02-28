package com.cms;

import java.sql.*;

public class Employee {

    private Date hire_date;
    private Double salary;
    private int employee_id;
    private Integer manager_id;
    private Integer department_id;
    private String phone_number;
    private String first_name;
    private String last_name;

    public Employee() {
    }

    public Employee(Date hire_date, Double salary, int employee_id,
                    Integer manager_id, Integer department_id,
                    String phone_number, String first_name, String last_name) {

        this.hire_date = hire_date;
        this.salary = salary;
        this.employee_id = employee_id;
        this.manager_id = manager_id;
        this.department_id = department_id;
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
    }



    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public void getEmployee(int emp_id) throws SQLException {
        try (Connection connection = DBConnection.getConnection();) {
//            Connection connection = DBConnection.getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from employee where employee_id=" + emp_id);

            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String fname = resultSet.getString("first_name");
                Date hireDate = resultSet.getDate("hire_date");
//               int phoneno =  resultSet.getInt("phone_number");
                System.out.println(id + " " + fname +" "+ hireDate+" ");
            }

        }finally {
            System.out.println("Done");
        }
    }
}
