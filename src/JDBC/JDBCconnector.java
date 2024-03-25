/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCconnector {
    
    public Connection getConnection() {
    
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
                 
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem"
                , "root", "P@ssword123456789");
        
     
     }catch (ClassNotFoundException |SQLException e){
    Logger.getLogger(JDBCconnector.class.getName()).log(Level.SEVERE, null, e);
    }
        return null;
}
}