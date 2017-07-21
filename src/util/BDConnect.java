/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class BDConnect {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String SERVER = "localhost";
    static final String USERNAME = "root";
    static final String SENHA = "";
    static final String DB = "agenda";
    static final String URL = "jdbc:mysql://" + SERVER + "/" + DB;
    static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, SENHA);
            } catch (SQLException ex) {
                Logger.getLogger(BDConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
