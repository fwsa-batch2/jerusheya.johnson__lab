package com.ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {

        //nested try:

        /*when different blocks like outer and inner may ifferent errors.
         To handle them, we need nested try blocks.*/

        try{
            try{
                int num=Integer.parseInt("Jeru");
                System.out.println(num);
            }
            catch(NumberFormatException e){
                   System.out.println("Number Format Exception");
            }
            try{  
                int[] a=new int[5];
                a[7]=9;
            }
            catch(ArrayIndexOutOfBoundsException i){
                System.out.println("Array Index Out Of Bound Exception");
            }
            System.out.println("end try");
        }
        catch(Exception e){
            System.out.println("Exception is handled");
        }
    }
    
}
