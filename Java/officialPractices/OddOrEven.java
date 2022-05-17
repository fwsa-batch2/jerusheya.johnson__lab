import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] arrays){
       Scanner scan=  new Scanner(System.in);
       int givenNum=scan.nextInt();
       if(givenNum==0){
             System.out.println("This is neither even nor odd");
       }
       else if(givenNum%2==0){
              System.out.println("This is an even number");
       }
       else{
           System.out.println("This is an odd number");
       }

       scan.close();
    }
}
