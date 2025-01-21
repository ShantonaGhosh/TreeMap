
package com.myjavaprogram.treemapproblem;

import java.util.Set;
import java.util.TreeMap;


public class Exercise5 {
     public static void main(String[] args){
        TreeMap<Integer,String> dataList =new  TreeMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        Set set = dataList.keySet();

        System.out.println(set);
       
    
     } 
    
}
