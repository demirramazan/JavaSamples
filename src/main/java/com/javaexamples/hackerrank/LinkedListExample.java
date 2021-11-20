package com.javaexamples.hackerrank;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LinkedListExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> ints = new LinkedList<>();
        IntStream.range(0, N).forEach(i -> {
            int x = scan.nextInt();
            ints.add(x);
        });
        int step = scan.nextInt();
        IntStream.range(0, step).forEach(i -> {
            String s = scan.next();
            if (s.equals("Insert")) {
                int index = scan.nextInt();
                int insertValue = scan.nextInt();
                ints.add(index, insertValue);
            } else if (s.equals("Delete")) {
                int delIndex = scan.nextInt();
                ints.remove(delIndex);
            }
        });
        ints.forEach(i -> System.out.print(i + " "));
    }
}
