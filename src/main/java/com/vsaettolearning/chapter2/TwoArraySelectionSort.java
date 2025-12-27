package com.vsaettolearning.chapter2;

import java.util.Arrays;

public class TwoArraySelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] result = selectionSort(arr);

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(result));
    }

    public static int[] selectionSort(int[] original) {
        int length = original.length;
        int[] sorted = new int[length];

        int[] tempArr = Arrays.copyOf(original, length);

        for (int i = 0; i < length; i++) {
            int minIdx = findMinIndex(tempArr);
            sorted[i] = tempArr[minIdx];
            tempArr[minIdx] = Integer.MAX_VALUE;
        }

        return sorted;
    }

    private static int findMinIndex(int[] arr) {
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}
