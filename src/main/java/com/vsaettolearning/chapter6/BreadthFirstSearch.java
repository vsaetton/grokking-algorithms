package com.vsaettolearning.chapter6;

import java.util.*;

public class BreadthFirstSearch {
    private static final Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        graph.put("you", new ArrayList<>(List.of("alice", "bob", "claire")));
        graph.put("bob", new ArrayList<>(List.of("anuj", "peggy")));
        graph.put("alice", new ArrayList<>(List.of("peggy")));
        graph.put("claire", new ArrayList<>(List.of("thom", "jonny")));
        graph.put("anuj", new ArrayList<>());
        graph.put("peggy", new ArrayList<>());
        graph.put("thom", new ArrayList<>());
        graph.put("jonny", new ArrayList<>());

        System.out.println("Found a mango seller: " + search("you"));
        System.out.println("Found a mango seller: " + search("claire"));
        System.out.println("Found a mango seller: " + search("peggy"));
    }

    private static boolean search(String name) {
        if (!graph.containsKey(name)) return false;

        Set<String> searched = new HashSet<>();
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();

            if (!searched.contains(person)) {
                if (isPersonSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    searchQueue.addAll(graph.getOrDefault(person, Collections.emptyList()));
                    searched.add(person);
                }
            }
        }
        return false;
    }

    private static boolean isPersonSeller(String person) {
        return person.endsWith("m");
    }
}
