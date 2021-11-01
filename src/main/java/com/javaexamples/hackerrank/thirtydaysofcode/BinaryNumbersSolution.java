package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class BinaryNumbersSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0; // count consecutive ones
        int maxCount = 0; // running maximum of consecutive ones
        for (int i = 0; i < binary.length; i++) {
            // reset to 0 if we hit a '0' char
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;

            // set max
            if (tmpCount > maxCount) {
                maxCount = tmpCount;
            }
        }
        System.out.println(maxCount);
    }
}
