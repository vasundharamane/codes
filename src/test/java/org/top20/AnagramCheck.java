package org.top20;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "sileni";
        String s2 = "listen";
        System.out.println("Validate if strings are anagram " + anagramCheck(s1, s2));
    }

    static boolean anagramCheck(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] intCount = new int[256];
        char[] s1char = s1.toCharArray();
        char[] s2char = s2.toCharArray();

        for (int i = 0; i < s1char.length; i++) {
            intCount[s1char[i]]++;
            intCount[s2char[i]]--;
        }
        boolean noAnagramflag = false;

        for (int i = 0; i < s1char.length; i++) {
            if (intCount[s1char[i]] != 0) {
                noAnagramflag = true;
            }
        }

        return !noAnagramflag;
    }
}
