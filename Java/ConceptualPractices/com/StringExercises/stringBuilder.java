package com.StringExercises;

public class stringBuilder {
    public static void main(String[] args) {
        
        //creating a stringBuilder

        //1.using StringBuilder() constructor
        StringBuilder str=new StringBuilder();
        str.append("Jeru");
        System.out.println(str);//ans in object
        System.out.println(str.toString());

        //2.using StringBuilder(CharSequence)
        StringBuilder str1=new StringBuilder("Jesus");
        System.out.println(str1);
        
        //3.using StringBuilder(capacity)
        StringBuilder str2=new StringBuilder(3);
        System.out.println(str2.capacity());
         str2.append("Jeru");
         str2.append("Jeru");
         
         System.out.println(str2);



    }
    }
