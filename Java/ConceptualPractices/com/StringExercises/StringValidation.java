package com.StringExercises;
import java.util.Scanner;

public class StringValidation {
    
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    String email=sc.nextLine();

    //for phonenumber only 8 digits means string lenght=8
    if(!(email.isEmpty())){
         if((email.contains("@")&&(email.contains(".")))){
             System.out.println(email +" is your email");
         }
         else{
             System.out.println("enter a valid id");
         }
    }
    else{
        System.out.println("enter a valid id");
    }
   sc.close();
}

}
