package com.vsaettolearning.chapter5;

import java.util.HashMap;
import java.util.Map;

public class VotingBooth {
    private static final Map<String, Boolean> voted = new HashMap<>();

    public static void main(String[] args) {
        checkVoter("tom");
        checkVoter("mike");
        checkVoter("mike");
    }

    private static void checkVoter(String name) {
        if (voted.containsKey(name)) {
            System.out.println("kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("let them vote!");
        }
    }
}

