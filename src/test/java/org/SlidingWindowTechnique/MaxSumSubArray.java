package org.SlidingWindowTechnique;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500, 200, 0};
        int window = 3;
        int start = 0, end = 0;
        int sum = 0, maxSum = 0;

        while (end < arr.length) {
            sum = sum + arr[end];
            if (end - start + 1 < window) {
                end++;
            } else if (end - start + 1 == window) {
                maxSum = Math.max(sum, maxSum);
                sum = sum - arr[start];
                end++;
                start++;
            }

        }
        System.out.println(maxSum);
    }
}
