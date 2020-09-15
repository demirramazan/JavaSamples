package com.javaexamples.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loop2Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(getLoopNumbers(a, b, n));
        }
        in.close();
    }

    //https://www.hackerrank.com/challenges/java-loops/problem
    //input
//2
//        0 2 10
//        5 3 5
    //output
//    2 6 14 30 62 126 254 510 1022 2046
//            8 14 26 50 98
    private static String getLoopNumbers(int first, int second, int repeat) {
        StringBuilder totalsNumber = new StringBuilder();
        int total = first;
        for (int i = 0; i < repeat; i++) {
            total += second * Math.pow(2, i);
            totalsNumber.append(total);
            if (repeat - 1 != i)
                totalsNumber.append(" ");
        }
        return totalsNumber.toString();
    }
}
