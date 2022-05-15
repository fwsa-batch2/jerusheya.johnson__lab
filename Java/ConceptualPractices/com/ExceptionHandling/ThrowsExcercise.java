package com.ExceptionHandling;

public class ThrowsExcercise {
    //will print the error too.
   static void avg() throws ArithmeticException{
   
            System.out.println("Exception caught");
            throw new ArithmeticException("Demo");
    
}
public static void main(String[] args){
       try{
         avg();
       }
       finally{
           System.out.println("caught exception");
       }
         
}
}
