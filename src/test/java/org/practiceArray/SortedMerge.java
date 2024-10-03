package org.practiceArray;

import java.util.Arrays;

public class SortedMerge {
    public static void main(String[] args) {
        int a[] = {1, 6, 9, 3};
        int b[] = {2, 1, 6, 5};

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0, k = 0;
        int c[] = new int[a.length + b.length];

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
