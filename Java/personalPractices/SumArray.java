public class SumArray {
    public static void main(String[] args){
         int[] numbers=new int[]{2,4,5,3,7};
         int noOfNum=numbers.length;
         float result=0;
         float average=1;
         for(int i=0;i<numbers.length;i++){
             result= result+numbers[i];
             average=result/noOfNum;
         }
         System.out.println(result);
         System.out.println(average);

         
    }
}
