import java.util.Scanner;

public class Solution {


        public static void main(String[] args) {
                 Scanner scan = new Scanner(System.in);
                 int input=scan.nextInt();
                 
                  if(input%2!=0){
                      System.out.println("Weird");
                  }
                  else{
                      if(2<=input && input<=5){
                          System.out.println("Not Weird");
                      }
                      if(6<=input && input<=20){
                          System.out.println("Weird");
                      }
                      if(20<input){
                          System.out.println("Not Weird");
                      }
                  }
    
            scan.close();
        }
    }

