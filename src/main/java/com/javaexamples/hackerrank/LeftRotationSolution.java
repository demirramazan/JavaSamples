package com.javaexamples.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationSolution {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> integerList = new ArrayList<>(a);
        if (d == 0)
            return integerList;

        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                integerList.set(i, a.get(0));
            } else {
                integerList.set(i, a.get(i + 1));
            }
        }

        return rotLeft(integerList, d - 1);
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        List<Integer> integers = rotLeft(ints, 4);
        integers.forEach(System.out::println);
    }
}
