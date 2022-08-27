/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class SQLConnection {
    
    //Attributes
    private static final String URL = "jdbc:mysql://localhost:3306/bd_mike";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    //Para cuando se conecte a la MAC de Mike
    //private static final String URL = "jdbc:mysql://192.168.64.2/bd_mike";
    //private static final String PASSWORD = "pass";
    
    //Methods
    public static java.sql.Connection getSQLConnection() {
        java.sql.Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (java.sql.Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos");
            System.out.println(e);
        }
        return con;
    }
}
