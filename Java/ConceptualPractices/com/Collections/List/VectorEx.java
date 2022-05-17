package com.Collections.List;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        
    
    // Size of the Vector
    int n = 5;
 
    // Declaring the Vector with
    // initial size n
    Vector<Integer> v = new Vector<Integer>(n);

    // Appending new elements at
    // the end of the vector
    for (int i = 1; i <= n; i++){
        v.add(i);
    }

    // Printing elements
    System.out.println(v);

    // Remove element at index 3
    v.remove(3);

    // Displaying the vector
    // after deletion
    System.out.println(v);

    // iterating over vector elements
    // using for loop
    for (int j = 0; j < v.size(); j++){

        // Printing elements one by one
        System.out.print(v.get(j) + " ");
    }
    System.out.println();
 


    try{
    int n1=-3;
    Vector<Integer> v1 = new Vector<Integer>(n1);
    System.out.println(v1);
    }
    catch(Exception e){
        System.out.println("exception is" +e);
    }

    try{
        
        Vector<Integer> v2 = new Vector<Integer>(null);
        System.out.println(v2);

    }
    catch(Exception w){
        System.out.println("exception is" +w);
    }
    


}
}

