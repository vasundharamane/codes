package org.practiceArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberWithSet {
    public static void main(String[] args) {
        int[] n = {1, 2, 4, 6, 3};
        int endNum = 6;

        Set<Integer> set = new HashSet<>();
        for (int num : n) {
            set.add(num);
        }

        for (int i = 0; i <= endNum; i++) {
            if (!set.contains(i)) {
                System.out.println("missing number is " + i);
            }
        }
    }
}
