package org.practicetest;

import java.util.Arrays;

public class SortMerge {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0};
        int[] b = {4, 5, 1};

        int[] c = new int[a.length + b.length];

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }

        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        System.out.println(Arrays.toString(c));
    }
}
