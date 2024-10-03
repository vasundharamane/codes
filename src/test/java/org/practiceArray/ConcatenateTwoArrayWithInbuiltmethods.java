package org.practiceArray;

import java.util.Arrays;

public class ConcatenateTwoArrayWithInbuiltmethods {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int totalLen = a.length + b.length;
        int[] c = new int[totalLen];

        System.arraycopy(a, 0, c, 0, b.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
    }
}
