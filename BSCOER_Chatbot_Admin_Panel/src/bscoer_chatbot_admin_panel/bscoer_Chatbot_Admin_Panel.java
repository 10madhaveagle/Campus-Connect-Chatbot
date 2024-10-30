/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bscoer_chatbot_admin_panel;

import dbdriver.Admin_Registration_Table_Creator;
import dbdriver.Attendance_Table_Creator;
import dbdriver.DBConnection;
import dbdriver.Question_Answer_Table_Creator;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class bscoer_Chatbot_Admin_Panel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        Statement st=new DBConnection().createDBConnection();
//        boolean flag1=new Admin_Registration_Table_Creator().createAdminTable(st);
//         boolean flag2=new  Question_Answer_Table_Creator().create_Que_Ans_Table(st);
//        boolean flag3=new Attendance_Table_Creator().create_Attendance_Table(st);
        
       Login_Frame lf=new Login_Frame();
        lf.setVisible(true);
        lf.setSize(680, 870);
        lf.setLocation(350,0);
    }
    
}
