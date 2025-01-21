package com.myjavaprogram.treemapproblem;

import java.util.TreeMap;

public class Exercise2 {

    public static void main(String[] args) {
        TreeMap<Integer, String> dataList = new TreeMap<Integer, String>();        
        dataList.put(1, "name");
        dataList.put(2, "roll");
        dataList.put(3, "id");
        TreeMap<Integer, String> dataList1 = new TreeMap<Integer, String>();        
        dataList1.put(4, "red");
        dataList1.put(5, "black");
        dataList1.put(6, "blue");
        dataList.putAll(dataList1);
        System.out.println(dataList.size());
        
    }    
    
}
