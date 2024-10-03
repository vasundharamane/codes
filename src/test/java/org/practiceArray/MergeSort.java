package org.practiceArray;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 1, 13, 5, 6, 7};
        divide(arr, 0, arr.length - 1);

        printArray(arr);
    }

    static void divide(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            mergeSort(arr, left, mid, right);
        }
    }

    static void printArray(int[] arr) {
        System.out.println("Output");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void mergeSort(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] tempArr1 = new int[n1];
        int[] tempArr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            tempArr1[i] = arr[i + left];
        }

        for (int i = 0; i < n2; i++) {
            tempArr2[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (tempArr1[i] < tempArr2[j]) {
                arr[k++] = tempArr1[i++];
            } else {
                arr[k++] = tempArr2[j++];
            }
        }

        while (i < n1) {
            arr[k++] = tempArr1[i++];
        }

        while (j < n2) {
            arr[k++] = tempArr2[j++];
        }

    }
}
