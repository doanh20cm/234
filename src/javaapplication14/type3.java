package javaapplication14;
import java.sql.*;
import java.util.Scanner;

public class type3 {
    public static void main(String[] args) {
        try {
            //kêt nối với database
            String dbURL = "jdbc:sqlserver://DESKTOP-0AUMMF4\\SQLEXPRESS:1433;databaseName=lmao;Username=sa;Password = 12345";
            Connection conn = DriverManager.getConnection(dbURL);

            //callable statement
            CallableStatement stmt;
            String sql = "SELECT * FROM asd where col1 = ? and col2 = ?";
            stmt = conn.prepareCall(sql);
            System.out.println("Nhập col1: ");
            Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            System.out.println("Nhập col2: ");
            int b = sc.nextInt();
            stmt.setFloat(1, a);
            stmt.setInt(2, b);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getFloat(1) + " " + rs.getInt(2) + " " + rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}