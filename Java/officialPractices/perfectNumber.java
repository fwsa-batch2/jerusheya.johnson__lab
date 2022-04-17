import java.util.Scanner;

public class perfectNumber {
    
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner scan=new Scanner(System.in);
        int firstnum=scan.nextInt();
        int addedAnswer=0;
        for(int i=1;i<firstnum;i++){
            int divisor=firstnum%i;
            if(divisor==0){
                System.out.println(i);
                addedAnswer+=i;
            }
        }
        System.out.println(addedAnswer);
        if(addedAnswer==firstnum){
            System.out.println("This is a perfect number");
        }
        else{
            System.out.println("This is not a perfect number");
        }
        scan.close();
    }
}