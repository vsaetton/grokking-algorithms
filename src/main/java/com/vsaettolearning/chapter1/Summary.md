# Summary: Chapter 1 - Introduction to Algorithms

Chapter 1 lays the foundation for the rest of the book by introducing algorithms, analyzing their performance, and
explaining the mathematical notation used to describe speed.

## 1. Introduction

* An **algorithm** is defined as a set of instructions for accomplishing a specific task.
* The book focuses on algorithms that are fast, solve interesting problems, or both.

## 2. Binary Search

* **Definition:** Binary search is an algorithm where the input is a sorted list of elements. If the element you are
  looking for is in the list, it returns the position; otherwise, it returns null.
* **Mechanism:** unlike "simple search" which checks every single element, binary search guesses the middle number and
  eliminates half the remaining numbers every time.
* **Efficiency:**
    * **Simple Search:** In the worst case, simple search takes linear time ($n$ steps).
    * **Binary Search:** In the worst case, binary search takes logarithmic time ($log_2 n$ steps).
* **Example:** If you have a list of 4 billion items:
    * Simple search could take up to 4 billion guesses.
    * Binary search would take at most 32 guesses.

## 3. Big O Notation

* **Purpose:** Big O notation is a special notation that tells you how fast an algorithm is. It allows you to compare
  the number of operations an algorithm will make.
* **Growth Rate:** Algorithm speed is not measured in seconds, but in the growth of the number of operations. It
  describes how quickly the run time increases as the size of the input increases.
* **Worst-Case:** Big O establishes a worst-case run time, reassuring you that the algorithm will never be slower than
  this.

### Common Big O Run Times

The chapter lists five common run times, sorted from fastest to slowest:

1. **$O(log n)$**: Logarithmic time (e.g., Binary Search).
2. **$O(n)$**: Linear time (e.g., Simple Search).
3. **$O(n * log n)$**: A fast sorting algorithm (e.g., Quicksort).
4. **$O(n^2)$**: A slow sorting algorithm (e.g., Selection Sort).
5. **$O(n!)$**: Factorial time (e.g., The Traveling Salesperson).

## 4. The Traveling Salesperson Problem

* This problem is used to illustrate an algorithm with a very slow run time: **$O(n!)$** or factorial time.
* **The Scenario:** A salesperson must visit *n* cities while traveling the minimum total distance.
* **Complexity:** To solve this perfectly, one must calculate every possible route (permutation).
    * For 5 cities, there are 120 permutations.
    * For 6 cities, there are 720 permutations.
    * For 100+ cities, it becomes impossible to calculate in a reasonable timeframe.

## Key Takeaways

* Binary search is significantly faster than simple search.
* $O(log n)$ is faster than $O(n)$, but the difference becomes much more drastic as the list of items grows.
* Algorithm speed is measured in terms of the growth of operations, not seconds.