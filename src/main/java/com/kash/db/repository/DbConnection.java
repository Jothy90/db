package com.kash.db.repository;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 6/7/15
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class DbConnection {
    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver); // load JDBC-ODBC driver
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String args[]){
        System.out.println(DataLayer.getAll());
    }
}
