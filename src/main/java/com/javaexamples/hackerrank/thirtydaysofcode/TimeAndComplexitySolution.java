package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class TimeAndComplexitySolution {

    public static final String NOT_PRIME = "Not prime";
    public static final String PRIME = "Prime";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            String isPrimeResult = isPrime(input);
            System.out.println(isPrimeResult);
        }
    }

    private static String isPrime(int n) {
        String result = PRIME;
        if (n < 2) {
            result = NOT_PRIME;
        } else {
            int sqrN = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrN; i++) {
                if (n % i == 0) {
                    result = NOT_PRIME;
                    break;
                }
            }
        }
        return result;
    }
}
