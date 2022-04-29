import java.util.Arrays;
import java.util.Scanner;

public class checkElement {

    public static void main(String[] args){
       
        Scanner scan=new Scanner(System.in);
        int checkElement=scan.nextInt();
        int[] array=new int[]{2,6,3,7,8,1,9};
       
            System.out.print(checkElement +" is in this array " + Arrays.toString(array));
           
            
        
        
        scan.close();
       
    }

     public static boolean checking(int checkElement,int[] array){
    
    for(int i=0;i<array.length;i++){
        if(checkElement==array[i]){
            return true;
        }
       
    }
    return false;
}
}
