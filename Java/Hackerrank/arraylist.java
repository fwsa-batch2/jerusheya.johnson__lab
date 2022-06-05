
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    

   public static void main(String[] args){
       try{
            
    ArrayList<Integer> list=new ArrayList<Integer> ();
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    // int d=sc.nextInt();
    for(int i=0;i<num;i++){
        int num2=sc.nextInt();
        list.add(num2);
     
    }
    System.out.print(list);
//     for(int j=0;j<d;j++){
//              for(int k=0;k<list.size()+1;k++){
//                   int index1=list.get(0);
//                   list.remove(0);
//                   list.add(index1);
//              }
//      }
//     for(int h=0;h<list.size();h++){
//         System.out.print(list.get(h) +" ");
//     }
//   sc.close();
       }
       catch(Exception e){
           System.out.println("no output");
       }

      
   }

}

