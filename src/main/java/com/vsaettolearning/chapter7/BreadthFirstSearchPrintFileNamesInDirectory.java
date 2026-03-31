package com.vsaettolearning.chapter7;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class BreadthFirstSearchPrintFileNamesInDirectory {
    public static void main(String[] args) {
        URL resource = BreadthFirstSearchPrintFileNamesInDirectory.class.getResource("/pics");

        assert resource != null : "Folder 'pics' not found in resources!";

        printFileNamesInDirectory(resource.getPath());
    }

    private static void printFileNamesInDirectory(String startDir) {
        Deque<Path> searchQueue = new ArrayDeque<>();
        searchQueue.add(Paths.get(startDir));

        while (!searchQueue.isEmpty()) {
            Path currentDir = searchQueue.pollFirst();

            try (Stream<Path> stream = Files.list(currentDir)) {
                stream.sorted().forEach(path -> {
                    if (Files.isRegularFile(path)) {
                        System.out.println(path.getFileName());
                    } else if (Files.isDirectory(path)) {
                        searchQueue.addLast(path);
                    }
                });
            } catch (IOException e) {
                System.err.println("Could not read directory: " + currentDir + " - " + e.getMessage());
            }
        }
    }
}
