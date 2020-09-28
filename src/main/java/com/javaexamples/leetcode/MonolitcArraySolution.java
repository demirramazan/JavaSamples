package com.javaexamples.leetcode;

public class MonolitcArraySolution {
    //    https://leetcode.com/problems/monotonic-array/
//An array is monotonic if it is either monotone increasing or monotone decreasing.
//
//    An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
//
//    Return true if and only if the given array A is monotonic.
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3}));
        System.out.println(isMonotonic(new int[]{6, 5, 4, 4}));
        System.out.println(isMonotonic(new int[]{1, 3, 2}));
    }

    public static boolean isMonotonic(int[] A) {
        boolean isIncrementArray = true;
        boolean isDecrementArray = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) isIncrementArray = false;
            if (A[i] < A[i + 1]) isDecrementArray = false;
        }
        return isDecrementArray || isIncrementArray;
    }
}
