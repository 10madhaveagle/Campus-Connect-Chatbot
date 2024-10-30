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
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class Questions_Answer_Fetcher 
{
      public ArrayList getQuestion(String type)
    {
       ArrayList question_answer=new ArrayList();
        try
        {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot","root","root");
           Statement st=con.createStatement();
           
           String query="select * from que_ans_info where type='"+type+"'";
           
           ResultSet rs=st.executeQuery(query);
           while(rs.next())
           {
               ArrayList row=new ArrayList();
               row.add(rs.getString(2));
               row.add(rs.getString(3));
               question_answer.add(row);
               
           }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return question_answer;
    }
}
