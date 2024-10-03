package org.TwoPointerTechnique;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArr {
    public static void main(String[] args) {


        int[] nums = {0, 0, 1, 1, 2, 2, 3, 4, 4, 5};

        int uniqueNumber = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueNumber] = nums[i];
                uniqueNumber++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for(int i = 0 ;i<uniqueNumber;i++){
            System.out.println(nums[i]);
        }
    }
}
