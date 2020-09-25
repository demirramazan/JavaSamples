package com.javaexamples.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumberSolution {
    public static void main(String[] args) {
        int inputArray[] = {1};
//        int inputArray[] = {3, 0, 1};
//        int inputArray[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(inputArray));
    }

    public static int missingNumber(int[] nums) {
        if (Arrays.stream(nums).allMatch(i -> i != 0)) {
            return 0;
        }
//        int max = Arrays.stream(nums).max().getAsInt();
//        int min = Arrays.stream(nums).min().getAsInt();
        int length = nums.length;
        int toplamNormal = (length * (length + 1)) / 2;
        int toplam = Arrays.stream(nums).sum();
        int result = toplamNormal - toplam;

        return result;
    }
}
