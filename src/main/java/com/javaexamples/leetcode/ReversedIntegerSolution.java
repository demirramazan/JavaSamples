package com.javaexamples.leetcode;

public class ReversedIntegerSolution {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(-1230));
        System.out.println(reverse(230));
        System.out.println(reverse(955555230));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int inp) {
        long reversed = 0;
        while (inp != 0) {
            reversed = reversed * 10 + inp % 10;
            inp /= 10;
            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) return 0;
        }
        return (int) reversed;
    }
}
