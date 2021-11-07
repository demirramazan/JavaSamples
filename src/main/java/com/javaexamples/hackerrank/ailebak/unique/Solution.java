package com.javaexamples.hackerrank.ailebak.unique;

import java.io.IOException;
import java.util.HashMap;


class Result {

    /*
     * Complete the 'getUniqueCharacter' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getUniqueCharacter(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0) + 1);
        }


        for (int i = 0; i < length; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i + 1;
        }
        return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int result = Result.getUniqueCharacter("statistic");

        System.out.println("result = " + result);
    }
}

