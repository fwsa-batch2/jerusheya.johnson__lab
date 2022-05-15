package com.Collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class ArrayBlockingQueueEx{
    public static void main(String[] args) {
        
        /* BlockingQueue -----interface
        ArrayBlockingQueue ---class
        capacity should be fixed--blocked
        */
        
        
        BlockingQueue <String> names=new ArrayBlockingQueue<>(3);
             names.add("jeru");
             names.add("sess");
             names.add("ruby");
            try{
             names.add("john");
            }
            catch(Exception e){
             System.out.println("4th element can not be added");
            }
            finally{
                System.out.println(names);
            }
    }
}