package com.vsaettolearning.chapter4;

import java.util.Arrays;

public class RecursiveSumArray {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {2, 4, 6}));
    }

    private static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }
}
