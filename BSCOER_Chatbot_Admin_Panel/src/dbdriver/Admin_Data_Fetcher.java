/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class Admin_Data_Fetcher 
{
     public ArrayList getAdminData(String username)
    {
       ArrayList a1=new ArrayList();
        try
        {
            Statement st=new DBConnection().createDBConnection();
          String query="select * from admin_registration_info where user_name='"+username+"' ";
            
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                a1.add(rs.getString(1));
                a1.add(rs.getString(2));
                a1.add(rs.getString(3));
                a1.add(rs.getString(4));
                a1.add(rs.getString(5));
            }
          //  st.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return a1;
    }
}
