package org.practiceString;

public class FindDuplicateCharOfString {
    public static void main(String[] args) {

        String str = "abcccd";
        char[] strChar = str.toCharArray();
        boolean[] seen = new boolean[256];

        for (char c : strChar) {
            if (!seen[c]) {
                seen[c] = true;
            } else {
                System.out.println("char " + c + " is duplicate");
            }
        }

    }
}
