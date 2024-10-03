package org.practiceString;

public class VowelNConsonantsCount {
    public static void main(String[] args) {
        String str = "This is a string";
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();

        int vowelCount = 0, consonantCount = 0;
        for (char c : strChar) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel count " + vowelCount);
        System.out.println("Consonant count " + consonantCount);
    }
}
