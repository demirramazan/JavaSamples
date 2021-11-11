package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class NestedLogicSolution {
    /*
    * Day 26 Nested Logic Solution
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actualDay = scanner.nextInt();
        int actualMounth = scanner.nextInt();
        int actualYear = scanner.nextInt();
        BookDate actualBookDate = new BookDate(actualYear, actualMounth, actualDay);

        int expectedDay = scanner.nextInt();
        int expectedMounth = scanner.nextInt();
        int expectedYear = scanner.nextInt();
        BookDate expectedBookDate = new BookDate(expectedYear, expectedMounth, expectedDay);


        int fine = calculateFineBook(expectedBookDate, actualBookDate);
        System.out.println(fine);

    }

    private static int calculateFineBook(BookDate expectedBookDate, BookDate actualBookDate) {
        int fineBook = 0;
        if (actualBookDate.year > expectedBookDate.year) {
            fineBook = 10000;
        } else if (actualBookDate.year == expectedBookDate.year) {
            if (actualBookDate.mounth > expectedBookDate.mounth) {
                fineBook = 500 * (actualBookDate.mounth - expectedBookDate.mounth);
            } else if (actualBookDate.mounth == expectedBookDate.mounth) {
                if (actualBookDate.day > expectedBookDate.day) {
                    fineBook = 15 * (actualBookDate.day - expectedBookDate.day);
                }
            }
        }
        return fineBook;
    }

    static class BookDate {
        int year;
        int mounth;
        int day;

        public BookDate(int year, int mounth, int day) {
            this.year = year;
            this.mounth = mounth;
            this.day = day;
        }
    }
}

