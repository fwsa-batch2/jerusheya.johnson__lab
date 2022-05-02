public class Overlapping {
    public static void main(String[] args){

       //compiler polymorphism

        //many objects created for a same method-----methodoverlapping
        tech t=new tech();
        t.language1();
        tech t1=new tech();
        t1.language2();
        tech t2=new tech();
    System.out.println(t2.noOfLanguages());
    }
}

class tech{
    public void language1(){
         System.out.println("java");
    }
    public void language2(){
        System.out.println("css");
    }
     int noOfLanguages(){
        return 2;
    }
}
