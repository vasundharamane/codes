package org.practiceString;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aaabbcddddd";
        char[] strChar = str.toCharArray();
        int[] seen = new int[256];

        for (char c : strChar) {
            seen[c]++;
        }

        for (char c : strChar) {
            if (seen[c] == 1) {
                System.out.println(" character " + c + " repeated only once");
            }
        }
    }
}
