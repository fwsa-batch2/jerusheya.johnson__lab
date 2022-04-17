import java.util.Scanner;


public class Prime {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number==1){
            System.out.print("This is neither a prime number nor a composite number");
        }
        else{
            if(number == 2){
                System.out.println("This is a Prime Numer");
            }
            else{
                for(int i=2;i<number;i++){
                    int result=number%i;
                    if(result==0){
                        System.out.print("This is a composite number");
                        break;
                     }
                     else{
                         System.out.print("This is a prime number");
                     }
                }
            }
        }
        scan.close();

    }
}