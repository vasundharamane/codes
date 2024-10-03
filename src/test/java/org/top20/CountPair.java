package org.top20;

import java.util.HashMap;

public class CountPair {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 4, 2, 7, 9, 7};
        System.out.println(countPairs(arr));
    }

    static int countPairs(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : arr) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        int count = 0;
        for (int n : hm.values()) {
            count += n / 2;
        }
        return count;
    }
}
