package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayeshDB", "root", "hanishka@2003");
        con.createStatement().execute("create table jdbltable (name varchar(40), id int)");
        con.close();

    }
}
