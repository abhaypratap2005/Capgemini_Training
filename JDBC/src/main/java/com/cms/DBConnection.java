package com.cms;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        MysqlDataSource ds  = new MysqlDataSource();
        ds.setUser("root");
        ds.setPassword("1234");
        ds.setURL("jdbc:mysql://localhost:3306/company_db");
        Connection connection = ds.getConnection();
            try {
                connection  = ds.getConnection();
            } catch (SQLException e){
                e.printStackTrace();
            }
        return connection;
    }
}
