import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] array=new int[]{10,8,45,12,80,90};
        Arrays.toString(array);
        int num=0;
        
        for(int i=0;i<array.length;i++){           
             for (int j=i+1;j<array.length;j++){
               
                 if(array[i]>array[j]){
                    num=array[i];
                    array[i]=array[j];
                    array[j]=num;
                 }
                
                }
                
                System.out.println(array[i]);    
                
            }
            
            String[] array2=new String[]{"jeru","abi","saran","haiden"};
            System.out.println(Arrays.toString(array2));
            Arrays.sort(array2);
            System.out.println(Arrays.toString(array2));
        }

    }


