package com.javaexamples.leetcode;

public class UglyNumberSolution {
    //    https://leetcode.com/problems/ugly-number/
//    Write a program to check whether a given number is an ugly number.
//
//    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
    public static void main(String[] args) {
        System.out.println("Number is ugly: " + isUgly(6));
        System.out.println("Number is ugly: " + isUgly(8));
        System.out.println("Number is ugly: " + isUgly(14));
    }

    private static boolean isUgly(int num) {
        if (num <= 0) return false;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
        return true;
    }
}
