package Multithread;
import java.lang.Runnable;

public class MultithreadingUsingRunnable implements Runnable {

    //creating thread using runnable interface implementation

    // can be done in two ways
    //1. by extending thread class
    //2. by implementing runnable interface.


    //run() is a method in thread class we are going to overwrite it in a childclass
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("Child Thread" +i);
        }
    }

    public static void main(String[] args) {
        Runnable obj=new MultithreadingUsingRunnable();//if you use this will throw error because runnable interface has only run method,can't start a method
        ((MultithreadingUsingRunnable)obj).start();
        //or
        MultithreadingUsingRunnable obj1=new MultithreadingUsingRunnable();
        Thread obj2=new Thread(obj1);
        //or
        //Thread obj2=new Thread(new MultithreadingUsingRunnable());
    
        obj2.run();//calling the method  over written run
        // obj.start();//starting the execution by creating a new thread
        
    }

    public void start() {
    }

}
