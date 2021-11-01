package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoDArraysSolution {
    public static void main(String[] args) {
       /* 1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0*/
        String[][] strings = new String[][]{
                {"1", "1", "1", "0", "0", "0"},
                {"0", "1", "0", "0", "0", "0"},
                {"1", "1", "1", "0", "0", "0"},
                {"0", "0", "2", "4", "4", "0"},
                {"0", "0", "0", "2", "0", "0"},
                {"0", "0", "1", "2", "4", "0"}
        };
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> maxList=new ArrayList<>();
        int maxSum = 0;
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                int sum = 0;
                sum += Integer.valueOf(strings[k][l]) +
                        Integer.valueOf(strings[k][l + 1]) +
                        Integer.valueOf(strings[k][l + 2]) +
                        Integer.valueOf(strings[k + 1][l + 1]) +
                        Integer.valueOf(strings[k + 2][l]) +
                        Integer.valueOf(strings[k + 2][l + 1]) +
                        Integer.valueOf(strings[k + 2][l + 2]);
                maxList.add(sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("maxSum = " + maxList.stream().max(Comparator.comparingInt(o -> o)).orElse(0));
    }
}
