package org.TwoPointerTechnique;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 7, 11, 12};
        int target = 9;

        int start = 0, end = num.length - 1;
        int actualTarget = 0;

        while (start < end) {
            actualTarget = num[start] + num[end];
            if (actualTarget == target) {
                System.out.println("start " + start + " and end " + end);
                break;
            }

            if (target > actualTarget) {
                start++;
            } else {
                end--;
            }
        }
    }
}
