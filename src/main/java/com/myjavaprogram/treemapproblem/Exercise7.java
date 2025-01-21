
package com.myjavaprogram.treemapproblem;

import java.util.Comparator;
import java.util.TreeMap;


public class Exercise7 {
    public static void main(String[] args){
  TreeMap<String,String> treeMap = new TreeMap<String,String>(new sort_key());
  treeMap.put("1", "id");
  treeMap.put("2", "roll");
  treeMap.put("3", "name");
  System.out.println(treeMap);
        
    }
    
}
class sort_key implements Comparator<String>{
     @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
