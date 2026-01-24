package com.vsaettolearning.chapter5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Integer> phonebook = new HashMap<>();

        phonebook.put("jenny", 8675309);
        phonebook.put("emergency", 911);

        System.out.println(phonebook.get("jenny"));
    }
}
