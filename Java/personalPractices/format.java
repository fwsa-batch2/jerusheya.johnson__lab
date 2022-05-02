
import java.util.Scanner;

public class format {

    public static void main(String[] args) {
            
            System.out.println("================================");
                 
            Scanner sc=new Scanner(System.in);
             for (int i = 0; i<3; i++) {
                String input = sc.next();
                int input1 = sc.nextInt();
                System.out.format("%-15s%03d%n", input, input1);
            }
            
            System.out.println("================================");
            sc.close();
    }
}

