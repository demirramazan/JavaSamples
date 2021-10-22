package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class SixthDaySolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        scanner.nextLine();
        for (int i = 0; i < inputs; i++) {
            stringBuilder.append(scanner.nextLine());
            if (!(inputs - 1 == i)) {
                stringBuilder.append("\n");
            }
        }
        String[] strings = stringBuilder.toString().split("\n");
        StringBuilder tekCift = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            String tek = "";
            String cift = "";
            for (int j = 0; j < strings[i].length(); j++) {
                char c = strings[i].charAt(j);
                if (j == 0 || j % 2 == 0) {
                    cift += c;
                } else {
                    tek += c;

                }
            }
            tekCift.append(cift).append(" ").append(tek).append("\n");
        }
        System.out.println(tekCift);
    }
}
