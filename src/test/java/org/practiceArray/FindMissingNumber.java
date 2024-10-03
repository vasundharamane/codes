package org.practiceArray;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 6};
//        n(n+1)/2
        int n = num[num.length - 1];
        int sum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int n1 : num) {
            actualSum = actualSum + n1;
        }

        System.out.println(sum - actualSum);

    }
}
