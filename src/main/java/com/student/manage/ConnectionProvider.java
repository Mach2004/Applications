package com.student.manage;
import java.sql.*;


public class ConnectionProvider {
    static Connection con;

    public static Connection createC() {
        try {
            // Check if the connection is already established
            if (con == null || con.isClosed()) {
                String user = "root";
                String password = "Rio@2021";
                String url = "jdbc:mysql://localhost:3306/student_manage?useSSL=false&allowPublicKeyRetrieval=true";
                con = DriverManager.getConnection(url, user, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
