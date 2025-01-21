
package com.myjavaprogram.treemapproblem;

import java.util.TreeMap;

public class Exercise3 {
     public static void main(String[] args){
        TreeMap<Integer,String> dataList =new  TreeMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        
        if(dataList.containsKey(1)){
             System.out.println("exists");
        }else
        {
              System.out.println("not exists");
        }
       
    
     } 
    
}
