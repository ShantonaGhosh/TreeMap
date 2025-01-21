
package com.myjavaprogram.treemapproblem;

import java.util.Map;
import java.util.TreeMap;


public class Exercise1 {
     public static void main(String[] args){
        TreeMap<Integer,String> dataList =new  TreeMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        
        for(Map.Entry<Integer,String> entry: dataList.entrySet()){
            System.out.println(" key : "+entry.getKey()+ " value :" + entry.getValue());
        }

        
       
    
     } 
    
}
