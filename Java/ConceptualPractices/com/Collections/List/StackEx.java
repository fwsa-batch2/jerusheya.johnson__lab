package com.Collections.List;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack <Integer> stack_push=new Stack<>();
        
        //pushing elements to the top of stack
        for(int i=0;i<5;i++){
        stack_push.push(i);
        }
        System.out.println(stack_push);

        //popping element from top---shows and deletes
        System.out.println(stack_push.pop());
        System.out.println(stack_push);

        //peeking element from top of the stack---only shows
        System.out.println(stack_push.peek());
        System.out.println(stack_push);

        //searching for an element
        //prints -1 if the element is not present
        int a=stack_push.search(9);
        if(a==-1){
            System.out.println("the number is not available");
        }


        //advisory to use ArrayDeque instead of stack
        //because more efficient in a single-threaded environment
    }
}
