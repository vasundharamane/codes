package org.practiceArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindNonDuplicateNumbers {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 4, 1, 2};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n : a) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        System.out.println(hm);
        for (int n : hm.keySet()) {
            if (hm.get(n) == 1) {
                System.out.println(n);
            }
        }
    }
}
