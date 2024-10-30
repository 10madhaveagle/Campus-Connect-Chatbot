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
public class Question_Answer_Table_Creator 
{
     public boolean create_Que_Ans_Table(Statement st)
    {
        boolean flag=false;
        try
        {
            int x=0;
            int count=0;
            
            String query="create table que_ans_info"+"(sr_no VARCHAR(45),"
                    + " question VARCHAR(1000), "
                    + " answer VARCHAR(1000), "
                    + " type VARCHAR(45), "
                    + " PRIMARY KEY (sr_no)) ";
            
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
