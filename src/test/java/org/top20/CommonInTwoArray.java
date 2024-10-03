package org.top20;

import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 0};
        int[] arr2 = {2, 4};

        System.out.println(findCommonInArray(arr1, arr2));
    }

    static Set<Integer> findCommonInArray(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> commonElem = new HashSet<>();

        for (int n : arr1) {
            hs.add(n);
        }

        for (int n : arr2) {
            if (hs.contains(n)) ;
            commonElem.add(n);
        }
        return commonElem;
    }
}
