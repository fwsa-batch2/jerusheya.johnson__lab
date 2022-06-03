public class Singleton {


    private static Singleton obj;
    private Singleton(){}

    static synchronized  Singleton getInstance(){

        if(obj==null){
            obj=new Singleton();
        }
        return obj;
    }
    public static void main(String[] args) {
        Singleton.getInstance();
        
    }
    
    
}
