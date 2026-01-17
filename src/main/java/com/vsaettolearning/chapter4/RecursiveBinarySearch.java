package com.vsaettolearning.chapter4;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int low = 0;
        int high = arr.length - 1;

        System.out.println(recursiveBinarySearch(5, arr, low, high));
        System.out.println(recursiveBinarySearch(8, arr, low, high));

    }

    private static int recursiveBinarySearch(int element, int[] array, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (array[mid] == element) {
            return mid;
        }

        if (array[mid] > element) {
            return recursiveBinarySearch(element, array, low, mid - 1);
        } else {
            return recursiveBinarySearch(element, array, mid + 1, high);
        }
    }
}
