/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    static Connection con;

    public static Connection CreateConnection() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
