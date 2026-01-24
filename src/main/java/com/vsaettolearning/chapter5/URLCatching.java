package com.vsaettolearning.chapter5;

import java.util.HashMap;
import java.util.Map;

public class URLCatching {
    private static final Map<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        String aboutPage = getPage("facebook.com/about");
        String homePage = getPage("facebook.com/");
        String aboutPage2 = getPage("facebook.com/about");

        System.out.println(aboutPage);
        System.out.println(homePage);
        System.out.println(aboutPage2);
    }

    private static String getPage(String url) {
        if (cache.containsKey(url)) {
            return cache.get(url);
        } else {
            String data = getDataFromServer(url);
            cache.put(url, data);
            return data;
        }
    }

    private static String getDataFromServer(String url) {
        return "My Page: " + url;
    }
}
