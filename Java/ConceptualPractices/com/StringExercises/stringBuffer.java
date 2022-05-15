package com.StringExercises;

public class stringBuffer {
    
    public static void main(String[] args) {


        //newly created string is stored as a new value
        String name="Jeru";
        System.out.println(name.concat(" is doing her work").toString());
        System.out.println(name.length());

        //newly created stringbuffer replaces the old string
        StringBuffer lord=new StringBuffer("Jesus");
        System.out.println(lord.append(" loves you").toString());
        System.out.println(lord.length());
        //append----adds to stringbuffer
        //toString-----makes a stringbuffer to string

    }
}
