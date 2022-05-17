package com.ExceptionHandling;
public class ExceptionHandling {
    
    public static void main(String[] args) {
      //Built-in Exceptions: 

        //1. ArithmeticException:
        try{
            int c=40 , d=0;
            System.out.println(c/d);

        }
        catch(ArithmeticException a){
              System.out.println("can't divide a number by zero because it is : " +a);
        }
        

        //2. NumberFormatException
        try{
            //parseint---converts string to int
            int num=Integer.parseInt("Jeru");
            System.out.println(num);
        }
        catch(NumberFormatException b){
           System.out.println("we are trying to use parseint to change a string into int which throws an :" +b);
        }

        //3.ArrayIndexBoundException
        try{
            int[] num=new int[5];
            num[7]=9;
            System.out.println(num[7]);
        }
        catch(ArrayIndexOutOfBoundsException c){
            System.out.println("adding a value to 7th index of an array of capacity with 5 : " +c);
        }

        //4.
    }
}
