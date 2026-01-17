package com.vsaettolearning.chapter4;

import java.util.ArrayList;
import java.util.List;

public class RecursiveMaxList {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(2, 6, 4, 8, 9, 1, 2, 12, 0, 0, 9));

        System.out.println(max(input));
    }

    private static int max(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        if (input.size() == 1) {
            return input.get(0);
        }

        int subMax = max(input.subList(1, input.size()));

        return input.get(0) > subMax ? input.get(0) : subMax;
    }
}
