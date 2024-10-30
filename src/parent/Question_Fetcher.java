/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parent;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class Question_Fetcher 
{
    public ArrayList getQuestion(String type)
    {
        ArrayList data=new ArrayList();
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatbot","root","root");
           Statement st=con.createStatement();
             
            String query="select * from que_ans_info where type='"+type+"'";
            ResultSet rs1=st.executeQuery(query);
           
          
            while(rs1.next())
            {
               ArrayList in=new ArrayList();
               String que=rs1.getString(2);
               in.add(que);
               data.add(in);
             
            }
          
            
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return data;
    }
            
}
