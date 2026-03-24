package com.cms.employeetransportproblem;

import org.hibernate.annotations.processing.SQL;
import org.hibernate.sql.Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_transport";
    private static final String  USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) throws SQLException {

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)){
            System.out.println("Connected to the database");

            insertOrder(conn, 101, "Ramesh");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static int insertOrder(Connection conn, int id , String ename) throws SQLException {
        String sql = "INSERT INTO employee(id, ename)" + "VALUES (?, ?)";


        try (PreparedStatement prspt = conn.prepareStatement(sql)) {
            prspt.setInt(1, id);
            prspt.setString(2, ename);

            int rows = prspt.executeUpdate();
            System.out.println("Inserted into orders");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return id;

    }
}
