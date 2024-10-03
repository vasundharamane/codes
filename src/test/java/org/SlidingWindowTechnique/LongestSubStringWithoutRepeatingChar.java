package org.SlidingWindowTechnique;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "abcabcaa";

        HashSet<Character> uniqueChars = new HashSet<>();

        int start = 0, end = 0, max = 0;

        while (end < str.length()) {
            if (!uniqueChars.contains(str.charAt(end))) {
                uniqueChars.add(str.charAt(end));
                max = Math.max(max, end-start+1);
                end++;
            } else {
                uniqueChars.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println("max " + max);
    }
}
