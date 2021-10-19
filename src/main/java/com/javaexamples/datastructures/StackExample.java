package com.javaexamples.datastructures;

import java.util.Stack;

public class StackExample {
    /*
     *Stack : LIFO (Last In Fist Out) structure. Stores objects into a sort of "vertical tower"
     * push() to add to top
     * pop() to remove from the top
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push("Minecraft");
        stack.push("DOOM");
        stack.push("PSV4");
        stack.push("FFVII");

//        System.out.println(stack);
//
//        stack.pop();
        System.out.println(stack);

//        stack.pop();

//        String myFavGame = stack.pop();
//        System.out.println(stack);
//        System.out.println("myFavGame = " + myFavGame);

        System.out.println(stack.peek());
        System.out.println(stack.search("PSV4"));//2
        System.out.println(stack.search("DOOM"));//3
        System.out.println(stack.search("Minecraft"));//4. index
        System.out.println(stack.search("Borderlands"));//-1

//        System.out.println(stack.isEmpty());
    }
}
