package org.practicetest;

public class SecondlargestNSmalled {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 1, 0, 10, 9, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int n : a) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n < largest && n > secondLargest) {
                secondLargest = n;
            }

            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (n < secondSmallest && n > smallest) {
                secondSmallest = n;
            }

        }
        System.out.println("secondLargest " + secondLargest);
        System.out.println("secondSmallest " + secondSmallest);

    }
}

