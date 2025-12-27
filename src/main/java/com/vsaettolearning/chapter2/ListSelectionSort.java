package com.vsaettolearning.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelectionSort {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(64, 25, 12, 22, 11));

        System.out.println("Sorted List: " + selectionSort(data));
    }

    private static List<Integer> selectionSort(List<Integer> input) {
        List<Integer> sortedList = new ArrayList<>();

        while (!input.isEmpty()) {
            int minIndex = 0;

            for (int i = 1; i < input.size(); i++) {
                if (input.get(i) < input.get(minIndex)) {
                    minIndex = i;
                }
            }

            sortedList.add(input.remove(minIndex));
        }

        return sortedList;
    }
}
