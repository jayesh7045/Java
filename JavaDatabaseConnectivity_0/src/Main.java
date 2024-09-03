import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbl_64", "root", "Hanishka@2003");
        con.createStatement().execute("create table java(id int)");


    }
}