package javaapplication14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JavaApplication14 { // tên class tự sửa cho giống tên file
    public static void main(String[] args) {
        try {
            float a = 1.0f;
            int b = 2;
            String c = "3";

            //kêt nối với database
            String dbURL = "jdbc:sqlserver://DESKTOP-0AUMMF4\\SQLEXPRESS:1433;databaseName=lmao;Username=sa;Password = 12345";
            Connection conn = DriverManager.getConnection(dbURL);

            // prepare statement
            PreparedStatement stmt; //new
            String sql = "INSERT INTO asd VALUES (?,?,?)"; // new
            stmt = conn.prepareStatement(sql); // new
            stmt.setFloat(1, a); // new
            stmt.setInt(2, b); // new
            stmt.setString(3, c); // new

            // thực thi
            int rows = stmt.executeUpdate();

            // in ra kết quả
            System.out.println("Rows impacted : " + rows);

            sql = "select * from asd";
            stmt = conn.prepareStatement(sql); // new
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("  " + rs.getFloat(1) + "  " + rs.getInt(2) + "  " + rs.getString(3));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}