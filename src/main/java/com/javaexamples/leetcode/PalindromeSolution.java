package com.javaexamples.leetcode;

public class PalindromeSolution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);
        int lenString = intToString.length();
        char[] reversed = new char[lenString];
        char[] chars = intToString.toCharArray();
        int c = lenString-1;
        for (int i = 0; i < lenString; i++) {
            reversed[i] = chars[c];
            c--;
        }
        String reverseString=String.copyValueOf(reversed);
        return reverseString.equals(intToString);
    }
}
