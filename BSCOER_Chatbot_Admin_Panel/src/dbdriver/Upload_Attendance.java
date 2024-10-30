/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

//import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Upload_Attendance 
{
    public boolean isUpload_attendance(Statement st,String erpno,  String rollno,String stud_name,String theory_att,String pract_att,String avg_att,String enroll_prn,String current_fee, String scholership,String total_paid_fee,String bal_fee,String last_sem_res,String guardian_teacher_name) 
    {
        boolean flag=false;
          
        try
        {
          
          String query="insert into attendance_info values ('"+erpno+"','"+rollno+"','"+stud_name+"','"+theory_att+"','"+pract_att+"','"+avg_att+"','"+enroll_prn+"','"+current_fee+"','"+scholership+"','"+total_paid_fee+"','"+bal_fee+"','"+last_sem_res+"','"+guardian_teacher_name+"')";
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;  
           //st.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
       
        return flag;
    }
}
