
    import java.util.*;
    
    public class Substring {
    
        public static void main(String[] args) {
            

            /*For the first line, sum the lengths of A and B.
              For the second line, write Yes if A is lexicographically greater than B
               otherwise print No instead.
              For the third line, capitalize the first letter in both A
               and B and print them on a single line, separated by a space.
            */
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
           
            /* Enter your code here. Print output to STDOUT. */
            int a=A.length();
            int b=B.length();
            System.out.println(a+b);
            int ans=A.compareTo(B);
            if(ans>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
           System.out.println(A.substring(0,1).toUpperCase() +A.substring(1,A.length()) +" " +B.substring(0,1).toUpperCase() +B.substring(1,B.length()));
        sc.close();
        }
    }
     

