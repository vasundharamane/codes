package org.practiceArray;
//find common elements in two array


import java.util.HashSet;
import java.util.Set;

public class FindCommonInTwo {
    public static void main(String[] args) {
        int[] a = {1, 5, 8};
        int[] b = {6, 9, 8, 1, 0};

        Set<Integer> hs = new HashSet<>();
        for (int n : a) {
            hs.add(n);
        }

        for (int n : b) {
            if (hs.contains(n))
                System.out.println(n + " ");
        }

    }
}
