import java.util.Scanner;

public class factorial {


    public static void  main( String [] args){
      System.out.println("enter a number:");
      Scanner read=new Scanner(System.in);
      long firstnum=read.nextInt();
      long lastnum=1;
      for(long i=firstnum; i>=1; i--){
        // System.out.println(i);
            lastnum *= i;
          }
          read.close();
      System.out.println(lastnum);

    }

}
