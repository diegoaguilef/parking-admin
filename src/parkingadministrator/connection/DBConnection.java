/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingadministrator.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego Aguilef
 */
public class DBConnection {
    private java.sql.Connection conn;
    private String driver;
    private String user;
    private String password;
    private String host;
    private String puerto;
    private String nombre_bd;
    private String url;
    
    /**
     *
     */
    public DBConnection()
    {
        user = "root";
        password = "admin123";
        host = "aguilef.com"; /* localhost */
        puerto = "9906";
        nombre_bd = "parking_admin";
        
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://"+host+":"+puerto+"/"+nombre_bd;
        
        try{
            Class.forName(driver);
        }catch(ClassNotFoundException e)
        {
            System.out.println("Error no existe ClassForName...");
        }
        
        try{
           conn = DriverManager.getConnection(url,user,password);
           if(conn != null)
           {
               System.out.println("Connection Successful");
           }
        }catch(SQLException e)
        {
            System.out.println(e.getLocalizedMessage());
        }            
    }// fin constructor sin parámetros
    
    /**
     *
     * @return
     */
    public java.sql.Connection getConnection()
    {
      return conn;
    }
}
