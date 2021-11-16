package com.javaexamples.hackerrank.thirtydaysofcode;


import java.util.Scanner;
import java.util.stream.IntStream;

public class BitwiseAndSolution {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(System.in);
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
        int t = scanner.nextInt();

        IntStream.range(0, t).forEach(tItr -> {
            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//                int count = Integer.parseInt(firstMultipleInput[0]);
                int count = scanner.nextInt();
                int lim = scanner.nextInt();
//
//                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);
                System.out.println(res);
//                bufferedWriter.write(String.valueOf(res));
//                bufferedWriter.newLine();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        int max = 0;
        for (int i = 1; i < N; i++) {
            for (int j = i+1; j <= N; j++) {
                int a = i & j;
                if (a < K && max < a)
                    max = a;
            }

        }
        return max;
    }

}