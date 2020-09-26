package com.javaexamples.hackerrank;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TwoDimentionArraySolution {
    //    https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
//Function Description
//
//    Complete the function hourglassSum in the editor below.
//
//    hourglassSum has the following parameter(s):
//
//    int arr[6][6]: an array of integers
//    Returns
//
//    int: the maximum hourglass sum
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j]= ThreadLocalRandom.current().nextInt(-9, 9);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(hourglassSum(arr));

    }


    private static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int tempSum = 0;
                tempSum += arr[i][j] + arr[i][j + 1]
                        + arr[i][j + 2] + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];

                if (tempSum > sum) {
                    sum = tempSum;
                }
            }

        }

        return sum;
    }
}
