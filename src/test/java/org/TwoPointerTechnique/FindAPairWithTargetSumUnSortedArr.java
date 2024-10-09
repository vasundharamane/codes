package org.TwoPointerTechnique;

import java.util.Arrays;
import java.util.HashSet;

public class FindAPairWithTargetSumUnSortedArr {
    public static void main(String[] args) {
        int[] testArray = {1, 3, 5, 7, 9, 2, 4, 2, 3, 4};
        int target = 6;
        System.out.println("Two pairs resulting in target " + target + " " + Arrays.toString(findNumbers(testArray, target)));
    }

    static int[] findNumbers(int[] testArr, int target) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < testArr.length; i++) {
            int complement = target - testArr[i];
            if (numbers.contains(complement)) {
                return new int[]{testArr[i], complement};
            } else numbers.add(testArr[i]);
        }
        return null;
    }
}
