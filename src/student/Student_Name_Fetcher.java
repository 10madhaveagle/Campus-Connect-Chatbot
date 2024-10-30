/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Student_Name_Fetcher
{
     public String getStudent_name(String erp)
    {
       String student_name="";
        try
        {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot","root","root");
           Statement st=con.createStatement();
           
           String query="select * from attendance_info where erp_no='"+erp+"'";
           
           ResultSet rs=st.executeQuery(query);
           if(rs.next())
           {
               student_name=rs.getString(3);
           }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return student_name;
    }
}
