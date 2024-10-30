/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class AdminLogin 
{
    public boolean isAdminLogin(String username,String password)
    {
        boolean flag=false;
        try
        {
            Statement st=new DBConnection().createDBConnection();
          String query="select * from admin_registration_info where user_name='"+username+"' and password='"+password+"'";
            
           ResultSet rs=st.executeQuery(query);
           if(rs.next())
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
