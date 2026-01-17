package com.vsaettolearning.chapter4;

import java.util.Arrays;

public class RecursiveMaxArray {
    public static void main(String[] args) {
        System.out.println(max(new int[] {2, 12, 6, 6, 9}));
    }

    private static int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        if (array.length == 1) {
            return array[0];
        }

        int subMax = max(Arrays.copyOfRange(array, 1, array.length));

        return (array[0] > subMax) ? array[0] : subMax;
    }
}
