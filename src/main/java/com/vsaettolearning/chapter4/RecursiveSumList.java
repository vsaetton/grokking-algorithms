package com.vsaettolearning.chapter4;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSumList {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(2, 4, 6));

        System.out.println(sum(input));
    }

    private static int sum(List<Integer> input) {
        if (input.isEmpty()) {
            return 0;
        }

        if (input.size() == 1) {
            return input.get(0);
        }

        return input.remove(0) + sum(input.subList(0, input.size()));
    }
}
