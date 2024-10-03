package org.TwoPointerTechnique;

public class WaterContainerProblem {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Example input

        int start = 0;
        int end = heights.length - 1;
        int maxArea = 0, area;

        while (start < end) {
            int height = Math.min(heights[start], heights[end]);
            int width = end - start;
            area = height * width;

            maxArea = Math.max(area, maxArea);

            if (heights[start] < heights[end]) {
                start++;
            } else end--;
        }
        System.out.println(maxArea);
    }
}
