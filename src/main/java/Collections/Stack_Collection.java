package Collections;

import java.util.Stack;

public class Stack_Collection {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(50);
        stack.push(30);
        stack.push(10);
        stack.add(56478);

        for(Integer i:stack)
            System.out.println(i);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());


    }
}
