package com.ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {

        //only catches the 1st error.
        //others will not be executed.
        try{
            int c=40 , d=0;
            System.out.println(c/d);
            int num=Integer.parseInt("Jeru");
            System.out.println(num);
            int[] num1=new int[5];
            num1[7]=9;
            System.out.println(num1[7]);
        }
        catch(ArithmeticException a){
            System.out.println("can't divide a number by zero because it is : " +a);
        }
        catch(NumberFormatException b){
        System.out.println("we are trying to use parseint to change a string into int which throws an :" +b);
        }
        catch(ArrayIndexOutOfBoundsException c){
        System.out.println("adding a value to 7th index of an array of capacity with 5 : " +c);
        }
        //will be executed either try works or catch works
        finally{
            System.out.println("ended code");
        }
    }

}
