package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class StringToIntegerExceptionSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Integer result;
        try {
            result = Integer.parseInt(s);
            System.out.print(result);
        } catch (NumberFormatException nfe) {
            System.out.println("Bad String");
        }

    }
}
