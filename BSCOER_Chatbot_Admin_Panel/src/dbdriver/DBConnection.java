/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class DBConnection 
{
    public Statement createDBConnection()
    {
        Statement st=null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot","root","root");
            st=con.createStatement();
         
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return st;
    }
}
