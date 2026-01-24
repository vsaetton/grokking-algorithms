# Grokking Algorithms — Personal Notes

These are my personal notes and code examples based on the book "Grokking Algorithms" by Aditya Y. Bhargava. This repository contains small example implementations, exercises, and question & example (Q&E) markdown files that I use to learn and practise the algorithms covered in the book.

This is a personal study resource, not an official companion to the book. If you find issues or want to suggest improvements, feel free to open an issue or a pull request.

## Repository layout

- Source code and examples (Java): `src/main/java/com/vsaettolearning/`
- Each chapter has its own package directory with code and Q&E notes.
- Q&E Markdown files in each package contain the chapter titles and notes.

## Chapters included so far

<!-- CHAPTERS_START -->
- Chapter 1 - Introduction to algorithms (/Users/vsaetto/IdeaProjects/algorithms/src/main/java/com/vsaettolearning/chapter1/Q&E.md)
- Chapter 2 - Selection sort (/Users/vsaetto/IdeaProjects/algorithms/src/main/java/com/vsaettolearning/chapter2/Q&E.md)
- Chapter 3 - Recursion (/Users/vsaetto/IdeaProjects/algorithms/src/main/java/com/vsaettolearning/chapter3/Q&E.md)
- Chapter 4 Quicksort (/Users/vsaetto/IdeaProjects/algorithms/src/main/java/com/vsaettolearning/chapter4/Q&E.md)
- Chapter 5 - Hash tables (/Users/vsaetto/IdeaProjects/algorithms/src/main/java/com/vsaettolearning/chapter5/Q&E.md)
<!-- CHAPTERS_END -->


If you add more chapters or rename Q&E files, update this list accordingly. The repository contains a helper script at `scripts/update_readme.py` that will regenerate the list automatically from the first headings in the Q&E markdown files.

## How to browse

1. Open the package folder for the chapter you're interested in, for example:
    - `src/main/java/com/vsaettolearning/chapter3/`
2. Read the `Q&E.md` (or similarly named) file for the chapter title and notes.
3. Inspect Java classes and example main methods to run small demos.

## Running examples

- This project contains Java examples. Use your preferred JDK (8+) and build/run with your IDE or `javac` / `java`.
- If you want, I can add a small Maven/Gradle build file or instructions for compiling and running specific examples.

## Contributing

- This repo is primarily personal notes, but contributions are welcome.
- To propose a change: open an issue describing the improvement or submit a PR with a clear explanation and example.

## License

These are personal study notes. If you want a license (MIT, CC-BY, etc.), tell me which license you'd like and I'll add it.

## Contact

- Author: vsaetton (GitHub: [vsaetton](https://github.com/vsaetton))