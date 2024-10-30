/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author welcome
 */
public class Check_Question_Equality 
{
    public ArrayList check_Question_Equality(String preprocess_que,ArrayList preprocess_que_list)
    {
        
        ArrayList new_que_ans_score_list=new ArrayList();
        String pre_que[]=preprocess_que.split(" ");
        double score=0;
        
       
        
        for (int i = 0; i < preprocess_que_list.size(); i++) 
        {
            int count=0;
            
            ArrayList row=(ArrayList)preprocess_que_list.get(i);
            
            String pre_que1=(String)row.get(0);
            String str[]=pre_que1.split(" ");
            
            ArrayList templist=new ArrayList();
            for (int j = 0; j < str.length; j++) 
            {
                String word=str[j];
                word=word.trim();
                templist.add(word);
            }
             ArrayList newpreprocess_que_list=getUnique(templist);
          
            for (int j = 0; j < pre_que.length; j++) 
            {
                for (int k = 0; k < newpreprocess_que_list.size(); k++) 
                {
                    String word1=(String)newpreprocess_que_list.get(k);
                    word1=word1.trim();
                    word1=word1.toLowerCase();
                    
                    String word2=pre_que[j];
                    word2=word2.trim();
                    word2=word2.toLowerCase();
                    
//                    if(word1.contains(word2) || word2.contains(word1) || word1.equals(word2))
                           if( word1.equals(word2))
                    { 
                        count++;
                    }
                }
            }
           
            score=(double)count/pre_que.length;
            ArrayList temp=new ArrayList();
            temp.add(pre_que1);
            temp.add(row.get(1));
            temp.add(score);
            new_que_ans_score_list.add(temp);
              
        }
        
       
        
        return new_que_ans_score_list;
    }
    
    public ArrayList getUnique(ArrayList templist )
    {
     
          HashSet hs=new HashSet();
             hs.addAll(templist);
             templist.clear();
             templist.addAll(hs);
             
            
        return templist;
    }
}
