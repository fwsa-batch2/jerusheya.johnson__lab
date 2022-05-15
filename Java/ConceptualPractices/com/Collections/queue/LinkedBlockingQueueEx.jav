package com.Collections.queue;


import java.util.BlockingQueue;

public class LinkedBlockingQueueEx{
    public static void main(String[] args) {

        //can be unbounded
        BlockingQueue <String> names=new LinkedBlockingQueue<>();
        names.add("jeru");
        names.add("ruby");
        System.out.println(names);
    
    
    }
}