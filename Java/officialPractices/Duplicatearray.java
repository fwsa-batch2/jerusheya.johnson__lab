import java.util.ArrayList;
import java.util.List;

public class Duplicatearray {
    public static void main(String[] args){
        List<Integer> givenlist=new ArrayList<>();
        givenlist.add(20);
        givenlist.add(20);
        givenlist.add(30);
        givenlist.add(40);
        givenlist.add(50);
        givenlist.add(50); 
        givenlist.add(50);
       
        for(int i=0;i<givenlist.size();i++){
            for(int j=i+1;j<givenlist.size();j++){
               
            if(givenlist.get(i)==givenlist.get(j)){
                givenlist.remove(givenlist.get(i));
            } 
           }
        }
    
        System.out.println(givenlist);
    }
}
