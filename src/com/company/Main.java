package com.company;

import java.sql.*;

public class Main {

    private static Connection connection;

    public static void main(String[] args) throws SQLException {
    String url = "jdbc:sqlserver://192.168.05.52:1433;database=ws";
    String user = "user104";
    String password = "hesus";
    String sql = "";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

    }

    public void Import()
    {

    }
}
