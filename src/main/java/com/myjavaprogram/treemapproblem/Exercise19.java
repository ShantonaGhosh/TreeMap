package com.myjavaprogram.treemapproblem;

import java.util.TreeMap;

public class Exercise19 {

    public static void main(String[] args) {
        TreeMap<Integer, String> dataList = new TreeMap<Integer, String>();
        dataList.put(1, "name");
        dataList.put(2, "roll");
        dataList.put(3, "id");
        System.out.println(dataList);
        System.out.println(dataList.pollFirstEntry());
        System.out.println(dataList);

    }
}
