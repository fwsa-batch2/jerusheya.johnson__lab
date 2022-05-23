package Multithread;
import java.lang.Thread;

public class RunStart extends Thread{
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
          RunStart obj=new RunStart();
    
        System.out.println("run starts");
        obj.run();//run when called
        //can use many times for an object.
        System.out.println("run ended");

        System.out.println("start starts");
        obj.start();// creates new thread. So executes after completly running the method
        //can use start only once for an object
        System.out.println("start ends");
      
        
    }

}
