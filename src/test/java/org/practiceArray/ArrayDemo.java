package org.practiceArray;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = {1, 5, 8};

        System.out.println(arr1[0]);
        arr1[1] = 7;
        System.out.println(Arrays.toString(arr1));

    }
}
