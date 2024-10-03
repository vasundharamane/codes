package org.SlidingWindowTechnique;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int start = 0, end = 0;
        List<Integer> negativeIndices = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (end < arr.length) {
            if (arr[end] < 0) {
                negativeIndices.add(end);
            }
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                if (negativeIndices.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(arr[negativeIndices.get(0)]);
                }

                if (!negativeIndices.isEmpty() && negativeIndices.get(0) == start) {
                    negativeIndices.remove(0);
                }
                end++;
                start++;
            }
        }
        System.out.println(result);
    }
}
