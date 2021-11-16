package com.javaexamples.hackerrank.thirtydaysofcode;

import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;


public class RegexPatternSolution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<Account> accounts = new ArrayList<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                String firstName = scanner.next();
                String emailID = scanner.next();

//                String firstName = firstMultipleInput[0];
//
//                String  = firstMultipleInput[1];
                Pattern pattern = Pattern.compile("@gmail.com");
                Predicate<String> stringPredicate = pattern.asPredicate();
                boolean test = stringPredicate.test(emailID);
                if (test) {
                    Account account = new Account(firstName, emailID);
                    accounts.add(account);
                }

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        printAccounts(accounts);
//        bufferedReader.close();
    }

    public static void printAccounts(List<Account> accounts) {
        accounts.sort(Comparator.comparing(o -> o.name));
        for (Account acc : accounts) {
            System.out.println(acc.name);
        }

    }

    static class Account {
        String name;
        String email;

        Account(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }
}
