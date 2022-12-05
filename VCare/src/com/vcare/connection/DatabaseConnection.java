
package com.vcare.connection;

import java.sql.Connection;
import java.sql.SQLException;


public class DatabaseConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
        String server = "vcare.database.windows.net";
        String port = "1433";
        String database = "vcare";
        String userName = "user@vcare";
        String password = "Password!";
        con = java.sql.DriverManager.getConnection("jdbc:sqlserver://" + server + ":" + port + ";database=" +database+ ";user=" +userName+ ";password=" +password+ ";encrypt=true");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}

