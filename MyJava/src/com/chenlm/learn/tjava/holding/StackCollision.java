package com.chenlm.learn.tjava.holding;

public class StackCollision {
    public static void main(String[] args) {
        com.chenlm.learn.tjava.util.Stack<String> stack =
                new com.chenlm.learn.tjava.util.Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        java.util.Stack<String> stack2 =
                new java.util.Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack2.push(s);
        }
        while (!stack2.empty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
