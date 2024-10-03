package org.practicetest;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 3};
        Set<Integer> hs = new HashSet<>();
        for (int n : num) {
            if (!hs.add(n)) {
                System.out.println(n + " is duplicate ");
            }
        }
    }
}
