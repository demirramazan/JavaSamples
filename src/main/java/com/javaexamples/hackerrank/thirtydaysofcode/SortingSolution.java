package com.javaexamples.hackerrank.thirtydaysofcode;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SortingSolution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int n = scanner.nextInt();

//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        List<Integer> a = Arrays.asList(3, 2, 1);
        List<Integer> result = swapList(a, n);
        System.out.println("Array is sorted in " + numberswaps + " swaps.");
        System.out.println("First Element: " + result.get(0));
        System.out.println("Last Element: " + result.get(result.size() - 1));
        // Write your code here
//        Array is sorted in 5 swaps.
//                First Element: 1
//        Last Element: 4
//        bufferedReader.close();
    }

    static int numberswaps = 0;

    public static List<Integer> swapList(List<Integer> a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    numberOfSwaps++;
                }
            }
            sum += numberOfSwaps;

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        numberswaps = sum;
        return a;
    }
}
