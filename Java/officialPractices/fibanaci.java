import java.util.Scanner;

public class fibanaci {
    
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner scan=new Scanner(System.in);
        int firstnum=scan.nextInt();
        int num1=1,num2=2,num3;
         
         System.out.println(num1);
         System.out.println(num2);
        for(int i=num1;i<=firstnum;i++){
        num3 = num1+num2;

        System.out.println(num3);
        num1=num2;
        num2=num3;
    }
        scan.close();
    }

}
