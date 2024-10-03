package org.practicetest;

import java.util.Arrays;

public class ConcatenateArra {
    public static void main(String[] args) {
        String[] a = {"a", "b"};
        String[] b = {"c", "d"};

        String[] c = new String[a.length + b.length];
        int i = 0;
        for (String s : a) {
            c[i++] = s;
        }

        for (String s : b) {
            c[i++] = s;
        }

        System.out.println(Arrays.toString(c));
    }
}
