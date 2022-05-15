

import java.math.BigInteger;
import java.util.Scanner;

public class Biginterger {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String num=scan.next();
        String num1=scan.next();

        BigInteger prime=new BigInteger(num);
        BigInteger prime1=new BigInteger(num1);

        //checking whether the num is prime or not 
        Boolean one=prime.isProbablePrime(1);//if certainty is <=0 it will return true only
        if(one==true ){
            // if true prime
            System.out.println("prime");
        }
        else{
            //if false composite
            System.out.println("composite");
        }
        
        //adding two bigints
        System.out.println(prime.add(prime1));

        //to get bigint value of int
        int a=scan.nextInt();
        System.out.println(BigInteger.valueOf(a).getClass().getSimpleName() +" = "+a);

        //to get the absolute value of a negative value
        System.out.println("enter a negative number");
        String b=scan.next();
        BigInteger bstring=new BigInteger(b);
        System.out.println(bstring.abs());

        
        scan.close();
    }
}
