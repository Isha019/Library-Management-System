/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectlib;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class connection {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root" , "root");
		//Statement stm=con.createStatement();
            return con;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
