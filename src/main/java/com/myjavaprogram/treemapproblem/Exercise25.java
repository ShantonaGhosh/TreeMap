
package com.myjavaprogram.treemapproblem;

import java.util.TreeMap;


public class Exercise25 {
     public static void main(String[] args){
        TreeMap<Integer,String> dataList =new  TreeMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        dataList.put(4,"id");
        dataList.put(5,"id");
        

        System.out.println(dataList.ceilingEntry(2));
        System.out.println(dataList.ceilingEntry(3));
        System.out.println(dataList.ceilingEntry(4));
       
    
     } 
}
