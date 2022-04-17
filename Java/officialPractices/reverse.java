import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int reverse=0;
        int remainder;
        while(num != 0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
         }
         System.out.print(reverse);
         scan.close();
    }
}
