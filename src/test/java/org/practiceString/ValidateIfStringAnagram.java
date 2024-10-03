package org.practiceString;

public class ValidateIfStringAnagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listan";

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrame");
        } else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char[] str1Chars = str1.toCharArray();
            char[] str2Chars = str2.toCharArray();
            int[] present = new int[256];

            for (int i = 0; i < str1Chars.length; i++) {
                present[str1Chars[i]]++;
                present[str2Chars[i]]--;
            }

            boolean flag = true;
            for (int i = 0; i < str1Chars.length; i++) {
                if (present[str1Chars[i]] != 0) {
                    flag =false;
                }
            }
            System.out.println("Anagram : " + flag);
        }
    }
}
