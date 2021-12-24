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

class Results {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     * There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

Example



There are  instances of ',  of '' and  of ''. For each query, add an element to the return array, .
* 4
aba
baba
aba
xzxb
3
aba
xzxb
ab
* Sample Output 1

2
1
0
* Sample Input 2
3
def
de
fgh
3
de
lmn
fgh
Sample Output 2

1
0
1
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> resultsMap = new LinkedHashMap<>();
        for (String s1 : queries) {
            resultsMap.put(s1, 0);
            for (String s2 : strings) {
                if (s1.equals(s2)) {
                    resultsMap.put(s1, resultsMap.get(s1) + 1);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (String q : queries) {
            if (resultsMap.containsKey(q)) {
                result.add(resultsMap.get(q));
            }
        }

        return result;
    }

}

public class SparseArrays {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings;
        strings = Arrays.asList("abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "na",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj"
                , "asdjf");
//        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries;
        queries = Arrays.asList("abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn");
        List<Integer> res = Results.matchingStrings(strings, queries);

//        bufferedWriter.write(
//                res.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
