package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
        public static final String URL = "jdbc:mysql://localhost:3306/zadacha1";
        public static final String USER = "root";
        public static final String PASSWORD = "root";


        public static Connection getConnection() {
            Connection connection = null;

            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                connection.setAutoCommit(false);
                System.out.println("Connection OK");
                return connection;

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Connection ERROR");
            }
            return connection;
        }
}




