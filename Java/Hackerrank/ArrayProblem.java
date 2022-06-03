import java.util.*;

//input format:

//The first line contains an integer, N (the initial number of elements in ).
//The second line contains  space-separated integers describing .
//The third line contains an integer, N (the number of queries).
//The  subsequent lines describe the queries, and each query is described over two lines:

//If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
//If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .

public class ArrayProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner sc = new Scanner(System.in);
        int numElements = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0;i < numElements;i++){
            numList.add(sc.nextInt());
        }
        int numQueries = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < numQueries;i++){
            String queryType = sc.nextLine();
            if(queryType.equals("Insert")){
                String[] queryArray = sc.nextLine().split(" ");
                numList.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
            }else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                numList.remove(removeIndex);
            }  
        }
        for(Integer num : numList){
            System.out.print(num+" ");
        }
        sc.close();
    }
}

