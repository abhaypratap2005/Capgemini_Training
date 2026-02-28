package com.cms;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DBConnectionTest {

    @Test
    void testGetConnection() throws SQLException {
        Connection connection = null;
        try {
             connection = DBConnection.getConnection();
            System.out.println(connection + "  -> Connection Established");
            assertNotNull(connection);
        }finally {
            if(connection!=null)
                try{
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }

        }

    }
}
