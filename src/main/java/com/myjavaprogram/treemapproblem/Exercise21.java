
package com.myjavaprogram.treemapproblem;

import java.util.SortedMap;
import java.util.TreeMap;


public class Exercise21 {
     public static void main(String[] args){
        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
  SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();


  tree_map.put(10, "Red");
  tree_map.put(20, "Green");
  tree_map.put(30, "Black");
  tree_map.put(40, "White");
  tree_map.put(50, "Pink");
  System.out.println("Orginal TreeMap content: " + tree_map);
  sub_tree_map = tree_map.subMap(20, 40);
       System.out.println( sub_tree_map);
    
     } 
}
