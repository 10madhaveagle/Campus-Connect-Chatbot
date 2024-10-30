/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import admin.View_Attendance_Frame;
import admin.View_Question_Answer_Frame;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class View_Que_Ans 
{
    public void show_Que_Ans()
    {
        try
        {
            Statement st1=new DBConnection().createDBConnection();
            Statement st2=new DBConnection().createDBConnection();
            
            String query="select * from que_ans_info";
            ResultSet rs1=st1.executeQuery(query);
             ResultSet rs2=st2.executeQuery(query);
            int row=0;
            while(rs1.next())
            {
                row++;
            }
            String data[][]=new String[row][4];
            int i=0;
            
            while(rs2.next())
            {
                String sr_no=rs2.getString(1);
                data[i][0]=sr_no;
                 String que=rs2.getString(2);
                data[i][1]=que;
                String ans=rs2.getString(3);
                data[i][2]=ans;
                String type=rs2.getString(4);
                data[i][3]=type;
                
                i++;
            }
            View_Question_Answer_Frame.data1=data;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
    }
}
