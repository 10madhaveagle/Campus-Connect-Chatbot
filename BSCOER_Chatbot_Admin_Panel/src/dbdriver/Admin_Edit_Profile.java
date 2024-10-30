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
public class Admin_Edit_Profile 
{
    public boolean isAdminProfileUpdated(String adminname,String mobile,String email,String username,String password)
    {
        boolean flag=false;
        try
        {
            Statement st=new DBConnection().createDBConnection();
            String query="update admin_registration_info set admin_name='"+adminname+"' , mobile_number='"+mobile+"' , email_id='"+email+"' , password='"+password+"' where user_name='"+username+"' ";
            
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
