package com.javaexamples.hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
      //  Set<Integer> un = new HashSet<>();
        int uniqueNumber = 0;
        for (Integer i : a) {
            long count = getCount(a, i);
            if (count == 1) {
                uniqueNumber = i;
                break;
            }

//                if (un.contains(i)) {
//                    un.remove(i);
//                } else {
//                    un.add(i);
//                }
        }
//        return un.stream().findFirst().get();
        return uniqueNumber;

    }

    private static long getCount(List<Integer> a, Integer i) {
        return a.stream().filter(ai -> Objects.equals(ai, i)).count();
    }

}

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
//                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        int result = Result.lonelyinteger(a);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
