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
public class Admin_Registration_Table_Creator 
{
     public boolean createAdminTable(Statement st)
    {
        boolean flag=false;
        try
        {
            int x=0;
            int count=0;
            
            String query="create table admin_registration_info"+"(admin_name VARCHAR(45),"
                    + " mobile_number VARCHAR(45), "
                    + " email_id VARCHAR(45), "
                    + " user_name VARCHAR(45), "
                    + " password VARCHAR(45) , "
                    + " PRIMARY KEY (user_name)) ";
            
            x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
             
                   // st.close();
                 
        }
          catch(Exception e)
        {
            System.out.println("Exception in AWSTableCreator Class is: "+e);
            flag=false;
        }
        
        return flag;
    }
}
