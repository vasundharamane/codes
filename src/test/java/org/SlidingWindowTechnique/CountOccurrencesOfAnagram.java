package org.SlidingWindowTechnique;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagram {
    public static void main(String[] args) {
        String str = "forxxorfxdofr";
        String pattern = "for";
        int start = 0, end = 0;

        Map<Character, Integer> patternMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int count = 0;
        while (end < str.length()) {
            char currentChar = str.charAt(end);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (end - start + 1 > pattern.length()) {
                char startChar = str.charAt(start);
                windowMap.put(startChar, windowMap.get(startChar) - 1);
                if (windowMap.get(startChar) == 0) {
                    windowMap.remove(startChar);
                }
                start++;
            }

            if (windowMap.equals(patternMap) && end - start + 1 == pattern.length()) {
                count++;
            }
            end++;
        }

        System.out.println(count);
    }
}
