package com.alp.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Alper
 */
public class DbHelper {

    Connection con = null;

    public Connection connectDb() throws SQLException {
        String driverName = "oracle.jdbc.driver.OracleDriver";
        String serverName = "10.10.1.30";
        String portName   = "1521";
        String sid        = "*****";
        try {
            Class.forName(driverName);

           
            String url      = "jdbc:oracle:thin:@" + serverName + ":" + portName + ":" + sid;
            String userName = "****";
            String password = "****";
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected");
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
