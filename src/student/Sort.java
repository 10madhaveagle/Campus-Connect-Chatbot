/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Sort 
{
    public ArrayList getSortedList(ArrayList new_que_ans_score_list)
    {
        for (int i = 0; i < new_que_ans_score_list.size()-1; i++)
        {
           
            for (int j = i+1; j < new_que_ans_score_list.size(); j++) 
            {
                 ArrayList row1=(ArrayList)new_que_ans_score_list.get(i);
           
            double num1=(double)row1.get(2);
          
                ArrayList row2=(ArrayList)new_que_ans_score_list.get(j);
                double num2=(double)row2.get(2);
                if(num1 < num2)
                {
                    new_que_ans_score_list.set(i, row2);
                    new_que_ans_score_list.set(j, row1);
                }  
            }
        }
        
//        System.out.println("ArrayList After Sorting");
//        for (int i = 0; i < wordcount.size(); i++) 
//        {
//            ArrayList row=(ArrayList)wordcount.get(i);
//            System.out.println(row);
//        }
        
        return new_que_ans_score_list;
    }
}
