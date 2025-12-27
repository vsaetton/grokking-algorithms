package com.vsaettolearning.chapter2;

import java.util.Arrays;

public class TwoArraySelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] result = sort(arr);

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(result));
    }

    private static int[] sort(int[] arr) {
        int length = arr.length;

        int[] sorted = new int[length];
        int[] tempArray = Arrays.copyOf(arr, length);

        for (int i = 0; i < length; i++) {
            int minIndex = 0;

            for (int j = 1; j < length; j++) {
                if (tempArray[j] < tempArray[minIndex]) {
                    minIndex = j;
                }
            }

            sorted[i] = tempArray[minIndex];
            tempArray[minIndex] = Integer.MAX_VALUE;
        }


        return sorted;
    }

    public static int[] selectionSort(int[] original) {
        int n = original.length;
        int[] sorted = new int[n];

        int[] tempArr = Arrays.copyOf(original, n);

        for (int i = 0; i < n; i++) {
            int minIdx = 0;

            for (int j = 1; j < n; j++) {
                if (tempArr[j] < tempArr[minIdx]) {
                    minIdx = j;
                }
            }

            sorted[i] = tempArr[minIdx];

            tempArr[minIdx] = Integer.MAX_VALUE;
        }
        return sorted;
    }
}
