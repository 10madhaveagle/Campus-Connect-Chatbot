/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

//import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Upload_Question_Answer 
{
    public boolean isUpload_Que_Ans(String srno,String que,String ans,String type,Statement st) 
    {
        boolean flag=false;
         
        try
        {
          
          String query="insert into que_ans_info values ('"+srno+"','"+que+"','"+ans+"','"+type+"')";
            
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
