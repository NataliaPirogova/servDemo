package com.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class JDBCConnector {
        private static final String JDBC_URL = "jdbc:mysql://localhost:3306/social";
        private static final String USER = "root";
        private static final String PASSWORD = "25162823NR";
        private Connection connection;

        public Connection getConnection() {
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                    return connection;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return connection;
        }
    }