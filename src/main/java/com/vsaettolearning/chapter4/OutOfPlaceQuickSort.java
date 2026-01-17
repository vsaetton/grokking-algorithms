package com.vsaettolearning.chapter4;

import java.util.ArrayList;
import java.util.List;

public class OutOfPlaceQuickSort {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(3, 5, 2, 1, 4));
        System.out.println(quickSort(input));
    }

    private static List<Integer> quickSort(List<Integer> input) {
        if (input.size() < 2) {
            return input;
        }

        int pivot = input.get(0);

        List<Integer> less = input.stream().skip(1).filter(i -> i <= pivot).toList();
        List<Integer> greater = input.stream().skip(1).filter(i -> i > pivot).toList();

        List<Integer> sorted = new ArrayList<>(input.size());
        sorted.addAll(quickSort(less));
        sorted.add(pivot);
        sorted.addAll(quickSort(greater));

        return sorted;
    }
}
