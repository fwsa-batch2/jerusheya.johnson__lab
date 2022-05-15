package com.Collections.queue;

import java.util.*;

public class PriorityQueueEx {
    public static void main(String[] args){


       //Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)

        PriorityQueue<Integer> queue1=new PriorityQueue<Integer>(10);

        //add -----if not added throws an exception
        for(int i=10;i>0;i--){
            System.out.println(i);
            queue1.add(i);
        }

        //peek ----gets the head of queue ----returns null if empty
        System.out.println(queue1.peek());

        //offer -----add if not added returns false
         queue1.offer(11);

         //element----gets the head of queue---throws an exception if empty
         PriorityQueue <Integer> queue2=new PriorityQueue<>();
         queue2.element();

         //poll----gets and removes the head---returns null if empty
         queue1.poll();

         //remove---gets and removes the head---throws an exception if empty
          queue2.remove();



    }

  
}
