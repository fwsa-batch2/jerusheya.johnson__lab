package com.Collections.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class linkedlist {
    public static void main(String[] args) {
        String s="welcometojava";
        int k=3;
        String s1="";
        int n=s.length();
        ArrayList <String> arrays=new ArrayList<>();
        for (int i = 0; i < n; i++){
             for (int j = i+1; j <= n; j++){
             s1=s.substring(i, j);
             if(s1.length()==k){
                arrays.add(s1);
             }

             }
            }
            System.out.println(arrays);
            System.out.println(Collections.min(arrays));
          System.out.println(Collections.max(arrays));
         

    }
}

    
