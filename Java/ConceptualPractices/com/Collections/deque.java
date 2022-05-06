package com.Collections;
import java.util.*;
  
public class deque {
    public static void main(String[] args)
    {
        Deque<String> deque
            = new LinkedList<String>();

        //or Deque<String> deque=new ArrayDeque<String>();
  
        // We can add elements to the queue
        // in various ways
  
        // Add at the last
        deque.add("Element 1 (Tail)");
  
        // Add at the first
        deque.addFirst("Element 2 (Head)");
  
        // Add at the last
        deque.addLast("Element 3 (Tail)");
  
        // Add at the first
        deque.push("Element 4 (Head)");
  
        // Add at the last
        deque.offer("Element 5 (Tail)");
  
        // Add at the first
        deque.offerFirst("Element 6 (Head)");
  
        System.out.println(deque + "\n");
        
        //removes 1st
        System.out.println(deque.poll());  
        
        //removes 1st
        System.out.println(deque.pollFirst()); 
        
        //removes last
        System.out.println(deque.pollLast());    
  
        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "
                           + "first and last: "
                           + deque);

        // removes 1st                  
        System.out.println(deque.pop());                   
                       
    }
}
