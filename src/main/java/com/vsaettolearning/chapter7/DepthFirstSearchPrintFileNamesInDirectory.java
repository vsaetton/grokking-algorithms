package com.vsaettolearning.chapter7;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class DepthFirstSearchPrintFileNamesInDirectory {
    public static void main(String[] args) throws URISyntaxException {
        URL resource = DepthFirstSearchPrintFileNamesInDirectory.class.getResource("/pics");

        assert resource != null : "Folder 'pics' not found in resources!";

        try {
            Path startPath = Paths.get(resource.toURI());

            printFileNamesInDirectory(startPath);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void printFileNamesInDirectory(Path directory) {
        try (Stream<Path> stream = Files.list(directory)) {
            stream.sorted().forEach(path -> {
                if (Files.isRegularFile(path)) {
                    System.out.println(path.getFileName());
                } else if (Files.isDirectory(path)) {
                    printFileNamesInDirectory(path);
                }
            });
        } catch (IOException e) {
            System.err.println("Could not read directory: " + directory + " - " + e.getMessage());
        }
    }
}
