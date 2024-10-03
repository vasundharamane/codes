package org.practicetest;

public class FindMissingNumberWithFormula {
    public static void main(String[] args) {
        int[] n = {1, 2, 4, 6, 3};
        int size = n.length + 1;
        int sum = size * (size + 1) / 2;
        int actualsum = 0;
        for (int num : n) {
            actualsum = actualsum + num;
        }

        System.out.println(sum - actualsum);
    }
}
