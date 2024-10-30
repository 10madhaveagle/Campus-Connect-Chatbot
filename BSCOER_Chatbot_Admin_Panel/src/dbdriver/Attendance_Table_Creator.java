/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Attendance_Table_Creator 
{
     public boolean create_Attendance_Table(Statement st)
    {
        boolean flag=false;
        try
        {
            int x=0;
            int count=0;
            
            String query="create table attendance_info"+"(erp_no VARCHAR(45),"
                    + " roll_no VARCHAR(45), "
                    + " student_name VARCHAR(45), "
                    + " theory_att VARCHAR(45), "
                     + " practical_att VARCHAR(45), "
                     + " avg_att VARCHAR(45), "
                     + " enroll_prn VARCHAR(45), "
                     + " current_fee VARCHAR(45), "
                     + " scolership VARCHAR(45), "
                     + " total_paid_fee VARCHAR(45), "
                     + " balance_fee VARCHAR(45), "
                     + " last_sem_res VARCHAR(45), "
                     + " guardian_teacher VARCHAR(45), "
                    + " PRIMARY KEY (erp_no)) ";
            
            x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
             
                //  st.close();  
                 
        }
          catch(Exception e)
        {
            System.out.println("Exception in AWSTableCreator Class is: "+e);
            flag=false;
        }
        
        return flag;
    }
}
