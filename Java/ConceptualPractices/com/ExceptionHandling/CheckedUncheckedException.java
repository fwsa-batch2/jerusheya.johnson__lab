package com.ExceptionHandling;

import java.io.FileNotFoundException;

public class CheckedUncheckedException {
    public static void main(String[] args) {

        /*Handling unchecked exception(runtime) is not mandatory
        Eg: NullPointerException,ArithmeticException*/
       try{
        method(); //if left without trycatch will show exception details in output
       }
       catch(Exception i){
           System.out.println("this throws an exception" +i);
       }

        /*Checked exceptions(compiletime) must be handled
        Eg: FileNotException*/

        try{
            method1(); //if left without trycatch shows error
        }
        catch(Exception e){
            System.out.println("this throws an exception" +e);
        }

    }

    public static void method(){
        throw new NullPointerException();
    }

    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}
