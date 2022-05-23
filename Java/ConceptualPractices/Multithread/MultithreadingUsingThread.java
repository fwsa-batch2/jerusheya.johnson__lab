package Multithread;
import java.lang.Thread;

public class MultithreadingUsingThread extends Thread{

    //creating thread using extend thread class

    public void threading (){
 
        System.out.println("this is using extend thread");
    }
    public static void main(String[] args) {
          
        MultithreadingUsingRunnable obj=new MultithreadingUsingRunnable();
        obj.start();
    }
}
