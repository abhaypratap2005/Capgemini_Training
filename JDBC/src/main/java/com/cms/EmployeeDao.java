package com.cms;

import java.sql.*;

public class EmployeeDao {

    public void printAllEmployees() throws SQLException {

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employee")) {

            while (resultSet.next()) {
                int empid = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println(empid + " " + firstName + " " + lastName);
            }

        } finally {
            System.out.println("Done");
        }
    }

    public Employee addEmployee(Employee emp) throws SQLException {

        String sql = "INSERT INTO employee (employee_id, first_name, last_name, department_id) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, emp.getEmployee_id());
            stmt.setString(2, emp.getFirst_name());
            stmt.setString(3, emp.getLast_name());

            if (emp.getDepartment_id() != null) {
                stmt.setInt(4, emp.getDepartment_id());
            } else {
                stmt.setNull(4, Types.INTEGER);
            }

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated != 1) {
                throw new RuntimeException("SQL error occurred");
            }

            return emp;
        }
    }
    public Employee getEmployee(int emp_id) throws SQLException {

        String sql = "SELECT * FROM employee WHERE employee_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, emp_id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Employee emp = new Employee();

                emp.setEmployee_id(rs.getInt("employee_id"));
                emp.setFirst_name(rs.getString("first_name"));
                emp.setHire_date(rs.getDate("hire_date"));

                return emp;
            }
        }

        return null;
    }
}