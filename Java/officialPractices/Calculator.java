import java.util.Scanner;

public class Calculator {
   
    public static  void main(String[] args) {
        System.out.println("enter 1st number:");
        Scanner read1 = new Scanner(System.in);
        int firstnum = read1.nextInt();
        System.out.println("enter 2nd number:");
        int secondnum = read1.nextInt();
        read1.close();
        
        System.out.println("results");
        System.out.println("add=" + add(firstnum, secondnum));
        System.out.println("sub=" + sub(firstnum, secondnum));
        System.out.println("mul=" + multiply(firstnum, secondnum));
        System.out.println("div=" + division(firstnum, secondnum));
        System.out.println("exp=" + exponential(firstnum, secondnum));
        System.out.println("greatest=" +greatest(firstnum,secondnum));
       
    } 
    

    public static int add(int firstnum, int secondnum) {

       int result = 0;
       result = firstnum + secondnum;
        return result;
        // System.out.println("Addition = " + result);
    }

    public static int sub(int firstnum, int secondnum) {
        int result = 0;
        result = firstnum - secondnum;
        return result;
    }

    public static int multiply(int firstnum, int secondnum) {
        int result = 0;
        result = firstnum * secondnum;
        return result;
    }

    public static float division(float firstnum, float secondnum) {
        float result = 0;
        result = firstnum / secondnum;
        float result1=result;
        return result1;
    }
    public static int exponential (int firstnum,int secondnum){
        int result=1;
        for(int i=1;i<=secondnum;i++){
               result=result*firstnum;
            }
            return result;
    }

    public static int greatest(int firstnum,int secondnum){
            int result=0;
        
        if(firstnum>secondnum){
                result=firstnum;
            }
        else{
            result=secondnum;
        }
        
        return result;
    }
  
}



