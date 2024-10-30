/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import admin.View_Attendance_Frame;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class ViewAttaendance 
{
    public void showAttandance()
    {
        try
        {
            Statement st1=new DBConnection().createDBConnection();
            Statement st2=new DBConnection().createDBConnection();
            
            String query="select * from attendance_info";
            ResultSet rs1=st1.executeQuery(query);
             ResultSet rs2=st2.executeQuery(query);
            int row=0;
            while(rs1.next())
            {
                row++;
            }
            String data[][]=new String[row][6];
            int i=0;
            
            while(rs2.next())
            {
                String erpno=rs2.getString(1);
                data[i][0]=erpno;
                 String studname=rs2.getString(3);
                data[i][1]=studname;
                String theory_att=rs2.getString(4);
                data[i][2]=theory_att;
                String practical_att=rs2.getString(5);
                data[i][3]=practical_att;
                String avg_att=rs2.getString(6);
                data[i][4]=avg_att;
                String teachername=rs2.getString(13);
                data[i][5]=teachername;
                i++;
            }
            View_Attendance_Frame.data1=data;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex);
        }
    }
}
