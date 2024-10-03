package org.practiceString;

import java.util.HashSet;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        String str = "aaaaaabbccccc";
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        System.out.println(hs);
    }
}
