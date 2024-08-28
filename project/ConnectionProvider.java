/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author madus
 */
public class ConnectionProvider {
    
    
        public static Connection getConnection()
        {
            try
                
            {
               Class.forName("com.MySQL.JDBC.Driver");
               Connection con=DriverManager.getConnection("JDBC:MySQL://localhost:3306/hostel","root","12345");
               return con;
            }
            
            catch(Exception e)   
                   
            {
                return null;
            }
        }
}
                    
             
        
