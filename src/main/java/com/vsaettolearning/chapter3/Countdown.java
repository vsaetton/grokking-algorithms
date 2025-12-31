package com.vsaettolearning.chapter3;

public class Countdown {
    public static void main(String[] args) {
        countdown(3);
    }

    private static void countdown(int i) {
        System.out.println(i);

        if (i >= 1) {
            countdown(i - 1);
        }
    }

    /*
    // No base case => Stack overflow exception
    private static void countdown(int i) {
        System.out.println(i);

        countdown(i - 1);
    } */
}
