package com.javaexamples.hackerearth;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class CommonFactors {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        int i2 = s.nextInt();

        List<Integer> i1list = new ArrayList<>();
        List<Integer> i2list = new ArrayList<>();
        for (int j = 1; j <= i1; j++) {
            if (i1 % j == 0) {
                i1list.add(j);
            }
        }
        for (int k = 1; k <= i2; k++) {
            if (i2 % k == 0) {
                i2list.add(k);
            }
        }
        AtomicInteger countCommon = new AtomicInteger();
        i1list.forEach(integer -> {
            i2list.forEach(integer1 -> {
                if (integer.equals(integer1))
                    countCommon.getAndIncrement();
            });
        });
//        for (Integer i11 : i1list) {
//            for (Integer i12 : i2list) {
//                if (Objects.equals(i11, i12)) {
//                    countCommon.getAndIncrement();
//                }
//            }
//        }
        System.out.println(countCommon.get());

    }
}
