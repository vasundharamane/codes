package org.TwoPointerTechnique;

public class RemoveDuplicatesFromSortedArr {
    public static void main(String[] args) {
        int[] testArr = {1, 4, 6, 6, 8, 9, 9, 10, 11, 12, 12, 12};
        int uniqueIndex = getUniqueIndex(testArr);
        System.out.println("after removing duplicate index");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.print(testArr[i] + " ");
        }
    }

    static int getUniqueIndex(int[] testArr) {
        int uniqueIndex = 1;

        for (int i = 1; i < testArr.length; i++) {
            if (testArr[i] != testArr[i - 1]) {
                testArr[uniqueIndex] = testArr[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}