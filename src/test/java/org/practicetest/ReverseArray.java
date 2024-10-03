package org.practicetest;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] s = {"abc", "pqr", "mno"};
        String[] reveredArr = new String[s.length];
        int j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            reveredArr[j] = s[i];
            j++;
        }
        System.out.println(Arrays.toString(reveredArr));
    }
}
