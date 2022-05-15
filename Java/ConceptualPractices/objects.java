import java.util.ArrayList;

public class objects {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
         
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        System.out.println("object = " +obj.getClass() +"   stringObject = " +obj.toString().getClass());
        
    }

}
