package org.practiceString;

public class CountConsonantsAndVowels {
    public static void main(String[] args) {
        String str = "aAbbcdDdde";
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();
        int consonantCount = 0, vowelsCount = 0;
        for (char c : strChar) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Vowels " +  vowelsCount);
        System.out.println("Consonants " + consonantCount);
    }
}
