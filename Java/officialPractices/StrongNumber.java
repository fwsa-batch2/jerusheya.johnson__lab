import java.util.Scanner;


public class StrongNumber {
    public static void main (String args[]){
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String numToString=Integer.toString(num);
        long result=0;
        for(int i=0; i<numToString.length();i++){
            Character digit=numToString.charAt(i);
            int value = Integer.parseInt(String.valueOf(digit));
            // System.out.println("Value" +value);
            long factorial = 1;
           
            for(long j = 1; j <= value; j++)
            {
                // System.out.println(j);
                factorial = factorial * j;
          
            }
            System.out.println(factorial);

            result += factorial;
        
        }
            System.out.println("result" +result);
            scan.close();
            if(result==num){
                System.out.println("The Given Number is a Strong Number");
            }
            else{
                System.out.println("The Given Number is not a Strong Number");
            }
    }
    }