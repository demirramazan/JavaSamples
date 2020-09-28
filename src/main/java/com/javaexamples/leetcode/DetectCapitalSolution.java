package com.javaexamples.leetcode;

public class DetectCapitalSolution {
//    Given a word, you need to judge whether the usage of capitals in it is right or not.
//
//    We define the usage of capitals in a word to be right when one of the following cases holds:
//
//    All letters in this word are capitals, like "USA".
//    All letters in this word are not capitals, like "leetcode".
//    Only the first letter in this word is capital, like "Google".
//    Otherwise, we define that this word doesn't use capitals in a right way.
//    https://leetcode.com/problems/detect-capital/
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("Turkey"));
        System.out.println(detectCapitalUse("england"));
        System.out.println(detectCapitalUse("FRance"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.isEmpty()) return false;

        boolean isFirstCharCapital = false;
        int isWordSize = 0;
        for (int i = 0; i < word.length(); i++) {
            char temp = Character.toUpperCase(word.charAt(i));
            if (i == 0 && temp == word.charAt(i)) {
                isFirstCharCapital = true;
                isWordSize++;
            } else if (temp == word.charAt(i)) {
                isWordSize++;
            }

        }
        boolean isWordLengthEqual = isWordSize == word.length();

        return isWordLengthEqual || isWordSize == 0 || (isFirstCharCapital && isWordSize == 1);
    }
}
