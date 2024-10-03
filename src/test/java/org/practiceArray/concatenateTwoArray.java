package org.practiceArray;

import java.util.Arrays;

public class concatenateTwoArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int totalLen = a.length + b.length;
        int[] c = new int[totalLen];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int k = 0;
        for (int i = a.length; i < totalLen; i++) {
            c[i] = b[k++];
        }

        System.out.println(Arrays.toString(c));
    }
}