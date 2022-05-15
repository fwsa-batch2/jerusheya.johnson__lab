package com.StringExercises;


public class string {

    public static void main(String[] args) {

        /*literally created strings:
         a and b points the same value only
         strings are stored in string pool which is in heap memory    
        */
        String a="jeru";
        String b="jeru";
        if(a==b){
            System.out.println("they are literally created variables");
        }
        else{
            System.out.println("not literally created variables");
        }

        /*object via created strings: 
         a and b points two different objects 
         theses strings are stored in heap memory as objects
        */
        String c=new String("John");
        String d=new String("John");
        if(c==d){
            System.out.println("they are literally created variables");
        }
        else{
            System.out.println("they are object strings");
        }

        String name="Jeru";
        String name1="jeru";
        char ch;

        //equalsIgnoreCase()
        if(name.equalsIgnoreCase(name1)){
            System.out.println("Jeru=jeru");
        }

        //length()
        System.out.println(name.length());

        //charAt()
        for(int i=0;i<name.length();i++){
            ch=name.charAt(i);
            System.out.print(ch);
        }

        //toUpperCase and toLowerCase
        System.out.println(name.toLowerCase());
        System.out.println(name1.toUpperCase());

        //replace
        System.out.println(name.replace("Jeru"," Johnson Jeyakumar "));

        String name2=" Johnson Jeyakumar ";
        //trim
        System.out.println(name2.trim());

        //contains
        if(name.contains("John")){
            System.out.println("this is in the string");
        }
        else{
            System.out.println("this is not in the string");
        }
        

        //toCharArray
        char[] charname=name.toCharArray();
        for(int i=0;i<charname.length;i++){
        System.out.println(charname[i]);
        }

        //isEmpty
        String emptyString="";
        if(emptyString.isEmpty()){
            System.out.println("this string is empty");
        }

        //endsWith
        String sentence="Jesus loves you";
        if(sentence.endsWith("you")){
            System.out.println("yes");
        }

        //concat
        System.out.println(name.concat(sentence));

        //split
        String[] stringarray=sentence.split(" ");
        for(int i=0;i<stringarray.length;i++){
            System.out.println(stringarray[i]);
        }

        //substring
        String school="Andrews Matric.Hr.Sec.School";
        String schoolName=school.substring(0,7);
        System.out.println(schoolName);

    }
 
    
}
