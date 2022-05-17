public class Overloading {
    public static void main(String[] args){
        room r=new room();
        r.room1();
        System.out.println(r.room1("jeru"));//jeru checeeks the method of string and excute the method
        System.out.println(r.room1(2));// 2 checks the int in method and executes it
        }
}

class room{
    void room1(){
        System.out.println("room1");
    }
    int room1(int x){
        return 3;
    }
    String room1(String y){
        return "room2";
    }
}
