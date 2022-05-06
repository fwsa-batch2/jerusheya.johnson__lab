package com.Collections;

import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args){

        PriorityQueue<Integer> queue1=new PriorityQueue<Integer>();

        for(int i=10;i>0;i--){
            System.out.println(i);
            queue1.add(i);
           
        }
      System.out.println(queue1.peek());
       //Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)




    }

  
}
