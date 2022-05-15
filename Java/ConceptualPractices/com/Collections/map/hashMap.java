package com.Collections.map;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {

        //creating an empty Hashmap
        HashMap <String,Integer> map=new HashMap<>();

        //inserting entries
        map.put("Jeru",1);
        map.put("John",2);
        map.put("Jess",1);
        map.put("Joe",2);
        map.put("Jesus",3);

        System.out.println(map);//prints the map

        for(Map.Entry<String,Integer> i:map.entrySet()){
        System.out.println(i.getKey() +" " +i.getValue());
        //getting each values and keys
        }

        //to get size
        System.out.println(map.size());

        //checking if a key is present or not
        if(map.containsKey("Joe")){

            //gets the value in the respective key
            Integer valueNum=map.get("Joe");
            System.out.println(valueNum);
        }

        //using generic type
        HashMap<Integer, String> hm1 = new HashMap<>(10);
 
        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);
 
        // HashMap 1
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
 
        // HashMap 2
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
 
        // Printing elements of HashMap 1
        System.out.println(hm1);
 
        // Printing elements of HashMap 2
        System.out.println(hm2);

        //update the value
        map.put("Jesus",5);
        System.out.println(map);//gives as a set

        //remove a value
        map.remove("Jeru");

        /*default initial capacity=2^4=16  (no.of buckets a map can hold)
          default load factor =75%,whenever our hash map is filled by 60%, the entries are moved to a new hash table of double 
          the size of the original hash table.
        */
        System.out.println(map.entrySet());//gives as an array
        System.out.println(map.keySet());//gives only the keys in an array

    }
}
