package com.vsaettolearning.chapter5;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BookDictionary {
    public static void main(String[] args) {
        Map<String, BigDecimal> books = new HashMap<>();

        books.put("apple", new BigDecimal("0.67"));
        books.put("milk", new BigDecimal("1.49"));
        books.put("avocado", new BigDecimal("1.49"));

        System.out.println(books);

        System.out.println(books.get("avocado"));
    }
}
