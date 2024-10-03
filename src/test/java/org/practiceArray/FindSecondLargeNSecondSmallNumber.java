package org.practiceArray;

import java.util.HashMap;

public class FindSecondLargeNSecondSmallNumber {

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 8, 3, 2};

        int secondlarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;

        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                secondlarge = large;
                large = a[i];

            } else if (a[i] > secondlarge && a[i] < large) {
                secondlarge = a[i];
            }

            if (a[i] < small) {
                secondsmall = small;
                small = a[i];
            } else if (a[i] < secondsmall && a[i] > small) {
                secondsmall = a[i];
            }
        }
        System.out.println("secondlarge " + secondlarge);
        System.out.println("second small " + secondsmall);
    }
}
