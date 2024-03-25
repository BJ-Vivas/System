/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import JDBC.JDBCconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UserDAO;


public class Student {
    
    private Connection connection;
    private JDBCconnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    public Student(){
        
    
        this.jdbccon = new JDBCconnector();
        this.connection = new JDBCconnector().getConnection();
    }
    
    public void addStudent(UserDAO userdao){
       
        try {
            sql = "INSERT into student (Fname, Mname, Lname, age, gender, civilstatus, address) values (?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, userdao.getFname());
            ps.setString(2, userdao.getMname());
            ps.setString(3, userdao.getLname());
            ps.setInt(4, userdao.getage()); 
            ps.setString(5, userdao.getGender());
            ps.setString(6, userdao.getCivilstatus());
            ps.setString(7, userdao.getAddress());
            
            int result = ps.executeUpdate();
            
            if (result > 0){
                JOptionPane.showMessageDialog(null, "Student Sucessfully Added");
                
            } else {
                JOptionPane.showMessageDialog(null, "Failed to Add Student");
            }
            
        } catch (Exception e) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, e);
            
        }
    }

    public void populatetable (DefaultTableModel model){
        
        try {
            
            model.setRowCount(0);
            sql = "SELECT * FROM Student";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rm = rs.getMetaData();
            int columncount = rm.getColumnCount();
            
            while (rs.next()){
                
                Object[] row = new Object[columncount];
                
                for (int i = 1; i < columncount; i++){
                    row [i-1] = rs.getObject(i);
                }
                
                model.addRow(row);
                
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}  

