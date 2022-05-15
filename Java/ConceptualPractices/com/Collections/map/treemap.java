package com.Collections.map;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap <Integer,String> map=new TreeMap<>();

        //inserting entries
        map.put(1,"Jeru");
        map.put(2,"John");
        map.put(1,"Jess");
        map.put(2,"Joe");
        map.put(3,"Jesus");

        //if enters value in same key it will be replaced.

        System.out.println(map);//prints the map
    }
}
