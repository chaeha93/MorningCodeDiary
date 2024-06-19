package stack;

import java.util.*;

public class stack {

    public static void main (String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty() + "//" + stack.size());

        stack.push("최지우");
        stack.push("고소영");
        stack.push("전지현");

        System.out.println(stack.isEmpty() + "//" + stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty() + "//" + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty() + "//" + stack.size());
//        System.out.println(stack.pop());

    }

}
