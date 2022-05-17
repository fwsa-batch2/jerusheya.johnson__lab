import java.util.Scanner;


public class StringDigits{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String input=scan.next();
        String output="[0-9]+";
         if(input.matches(output)){
              System.out.println("this contains only digits");
         }
        else{
            System.out.println("this is not true");
        }
        scan.close();
    }
}