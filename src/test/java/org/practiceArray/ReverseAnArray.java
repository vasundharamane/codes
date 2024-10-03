package org.practiceArray;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        char[] op = new char[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
            op[j] = a[i];
            j++;
        }
        System.out.println(Arrays.toString(op));
    }
}
