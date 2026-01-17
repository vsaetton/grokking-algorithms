package com.vsaettolearning.chapter4;

import java.util.Arrays;

public class RecursiveCountArray {
    public static void main(String[] args) {
        System.out.println(count(new int[] {2, 4, 6}));
    }

    private static int count(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return 1 + count(Arrays.copyOfRange(array, 1, array.length));
    }
}
