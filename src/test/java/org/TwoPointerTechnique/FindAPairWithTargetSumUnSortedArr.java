package org.TwoPointerTechnique;

import java.util.HashSet;

public class FindAPairWithTargetSumUnSortedArr {
    public static void main(String[] args) {
        int[] arr = {5,10, 15, 3, 7};
        int target = 17;

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int n : arr) {
            int complement = target - n;
            if (seenNumbers.contains(complement)) {
                System.out.println("pair found " + complement + " and " + n);
                break;
            }
            seenNumbers.add(n);
        }
    }
}
