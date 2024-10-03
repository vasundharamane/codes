package org.practicetest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUniqueValuesfromArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 3};

        Map<Integer, Integer> hm = new HashMap<>();

        for (int n : num) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        for (int n : hm.keySet()) {
            if (hm.get(n) == 1) {
                System.out.println(n + " is unique");
            }
        }
    }
}
