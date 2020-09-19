package com.javaexamples.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        Set<Character> characterSet = new HashSet<>();
        int longestChar = 0;
        int length = s.length();
        while (i < length && j < length) {
            if (!characterSet.contains(s.charAt(j))) {
                characterSet.add(s.charAt(j++));
                longestChar = Math.max(longestChar, j - i);
            } else {
                characterSet.remove(s.charAt(i++));
            }
        }
        return longestChar;
    }
}
