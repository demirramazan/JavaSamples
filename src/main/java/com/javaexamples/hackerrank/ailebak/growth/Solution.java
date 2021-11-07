package com.javaexamples.hackerrank.ailebak.growth;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


class Result {

    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */

    public static long countMax(List<String> upRight) {
//        int xl = 1;
//        int yl = 1;
//
//        xl = Integer.parseInt(upRight.get(1).split(" ")[0]);
//        yl = Integer.parseInt(upRight.get(1).split(" ")[1]);
//
//        for (int i=0; i<upRight.size(); i++){
//            if (xl > Integer.parseInt(upRight.get((int) i).split(" ")[0]) )
//                xl = Integer.parseInt(upRight.get((int) i).split(" ")[0]);
//            if (yl > Integer.parseInt(upRight.get((int) i).split(" ")[1]))
//                yl = Integer.parseInt(upRight.get((int) i).split(" ")[1]);
//        }
//
//        return (yl * xl);
        int[] a = new int[upRight.size()];
        int[] b = new int[upRight.size()];

        IntStream.range(0, upRight.size())
                .forEach(i -> {
                    String[] splitted = upRight.get(i).split(" ");
                    a[i] = Integer.parseInt(splitted[0]);
                    b[i] = Integer.parseInt(splitted[1]);
                });

        long a1 = Arrays.stream(a).min().getAsInt();
        long b1 = Arrays.stream(b).min().getAsInt();

        return a1 * b1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int upRightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> upRight = Arrays.asList("1 4", "2 3", "4 1");

        long result = Result.countMax(upRight);
        System.out.println("result = " + result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

