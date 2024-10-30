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
public class AdminRegistration 
{
    public boolean isAdminRegister(String adminname,String mobile,String email,String username,String password)
    {
        boolean flag=false;
        try
        {
            Statement st=new DBConnection().createDBConnection();
          String query="insert into admin_registration_info values ('"+adminname+"','"+mobile+"','"+email+"','"+username+"','"+password+"')";
            
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
