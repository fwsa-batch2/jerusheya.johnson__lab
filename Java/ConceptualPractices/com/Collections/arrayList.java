package com.Collections;

import java.util.*;
import java.util.Iterator;


public class arrayList {
    
    public static void main(String[] args){


        //list only stores String object.
        List <String> list1=new ArrayList<String>();
        //ArrayList <String> list1=new ArrayList <String>()

        //list only stores any type of object.
        ArrayList list2=new ArrayList();

        //1. Add Data in list
        list1.add("Sess");
        list1.add("Jesus");
        list1.add("Jeru");
        list1.add("Jeru");
        list1.add("John");
        list1.add("Jeyam");
        //(only stores String)

        list2.add("Jeru");
        list2.add(12);
        list2.add(true);
        list2.add('A');
        list2.add("Jeru");
        list2.add(34.4f);
        list2.add(790);
        //
       System.out.println("list1" +list1);
       System.out.println("list2" +list2);

       //2.Get the element  from List

       String name=list1.get(2);
       System.out.println("name=" +name);

       Object obj=list2.get(2);
       System.out.println(obj);

       //3.Update the element in list

       list1.set(2,"Jerusheya");
       String name1=list1.get(2);
       System.out.println("name1=" +name1);

       //4.remove the element in list

       list1.remove(2);
       System.out.println("removed list=" +list1);

       //remove all
       list2.clear();

       //5.checking prescence of the element in list

       if(list1.contains("Jerusheya")){
           System.out.println("Jerusheya is in the list");
       }
       else{
           System.out.println("Jerusheya is not in the list");
       }
       
       //6.iterate---accessing each element of array one by one.

       
       //*1.iterating using enhanced for loop
       System.out.println("====Iterating with Enhanced For Loop====");
       for(String iteratedString: list1){
           System.out.println(iteratedString);
       }
       System.out.println("========================================");
    
    
       //*2.iterating using for loop
       System.out.println("========Iterating with For Loop=========");
       for(int i=0;i<list1.size();i++){
           System.out.println(list1.get(i));
       }
       System.out.println("========================================");
          
       //*3.iterating with iterator
       Iterator <String> itr=list1.iterator();
    
       //    System.out.println(itr.next());//only gives one value at a time
       //    System.out.println(itr.next());

       while(itr.hasNext()){
           String stringItr=itr.next();
           System.out.println(stringItr);

           //removing element through iterator

           if(stringItr.equals("John")){
               itr.remove();
           }
       }
       System.out.println("========================================");
   
   
   
   
    }
}
