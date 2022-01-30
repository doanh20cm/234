package javaapplication14;

import java.sql.*;

public class JavaApplication14 { // tên class tự sửa cho giống tên file
    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-0AUMMF4\\SQLEXPRESS:1433;databaseName=lmao;Username=sa;Password = 12345";
            Connection conn = DriverManager.getConnection(dbURL);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM a1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("col1: " + rs.getFloat("col1"));
                System.out.println("col2: " + rs.getInt("col2"));
                System.out.println("col3: " + rs.getString("col3"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}