package org.practiceArray;

import java.util.*;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int a[] = {1, 5, 8, 4, 5, 8, 3, 2,3};
        Set<Integer> seen = new LinkedHashSet<>();
        List<Integer> ls = new ArrayList<>();
        for (int i : a) {
            if (!seen.add(i)) {
                ls.add(i);
            }
        }

        System.out.println(ls);
    }
}

