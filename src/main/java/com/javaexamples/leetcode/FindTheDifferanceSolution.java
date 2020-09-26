package com.javaexamples.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheDifferanceSolution {
    //https://leetcode.com/problems/find-the-difference/

    //    Given two strings s and t which consist of only lowercase letters.
//
//    String t is generated by random shuffling string s and then add one more letter at a random position.
//
//    Find the letter that was added in t.
    public static void main(String[] args) {
        System.out.println("Find Differance Char: " + findTheDifference("abcd", "dbcae"));
    }

    public static char findTheDifference(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        char findChar = 0;
        int toplam = 0;
        for (int i = 0; i < secondString.length; i++) {
            toplam += secondString[i];
        }
        for (int i = 0; i < firstString.length; i++) {
            toplam -= firstString[i];
        }
        toplam += IntStream.range(0, secondString.length).map(i -> secondString[i]).sum();
        toplam -= IntStream.range(0, firstString.length).map(i -> firstString[i]).sum();
        findChar = (char) toplam;

        return findChar;
    }
//second solutiion
//    private static  char findTheDifference(String s, String t) {
//char[] firstString = s.toCharArray();
//    char[] secondString = t.toCharArray();
//    char findChar = 0;
//    int toplam = 0;
//   for (int i = 0; i < firstString.length; i++) {
//        toplam+=secondString[i];
//        toplam-=firstString[i];
//    }
//        return (char)(toplam+secondString[secondString.length-1]);
//    }
}