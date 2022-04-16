import java.util.Scanner;

public class factorial {


    public static void  main( String [] args){
      System.out.println("enter a number:");
      Scanner read=new Scanner(System.in);
      int firstnum=read.nextInt();
      int lastnum=1;
      for(int i=firstnum; i>=1; i--){
            lastnum *= i;
          }
          read.close();
      System.out.println(lastnum);

    }

}
