package com.vsaettolearning.chapter4;

import java.util.ArrayList;
import java.util.List;

public class RecursiveCountList {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(2, 4, 6));

        System.out.println(count(input));
    }

    private static int count(List<Integer> input) {
        if (input.isEmpty()) {
            return 0;
        }

        return 1 + count(input.subList(1, input.size()));
    }
}
