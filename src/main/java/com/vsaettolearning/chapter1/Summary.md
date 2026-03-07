# Summary: Chapter 1 - Introduction to Algorithms

This chapter introduces the fundamental concepts of algorithms, focusing on how they are measured and why choosing the
right one can drastically change the performance of your software.

---

## 1. What is an Algorithm?

An **algorithm** is simply a set of instructions for accomplishing a task. Every piece of code can be considered an
algorithm, but this book focuses on the ones that are particularly fast or solve interesting problems.

---

## 2. Binary Search

Binary search is a significantly more efficient way to search through a **sorted list** of elements.

### How it Works

Instead of checking every single item from the beginning (Simple Search), binary search starts in the middle:

* **The Guess:** You guess the middle element.
* **The Result:** If the guess is too high or too low, you eliminate **half** of the remaining numbers.
* **Repeat:** You repeat this until you find the item or have no items left.

**Crucial Note:** Binary search only works if the list is **already sorted**.

### Python Implementation

```python
def binary_search(list, item):
    low = 0
    high = len(list) - 1

    while low <= high:
        mid = (low + high) // 2  # The // operator rounds down automatically
        guess = list[mid]
        
        if guess == item:
            return mid          # Found the item!
        if guess > item:
            high = mid - 1      # Guess was too high
        else:
            low = mid + 1       # Guess was too low
            
    return None                 # Item doesn't exist
```

#### Testing it out

```python
my_list = [1, 3, 5, 7, 9]
print(binary_search(my_list, 3)) # => 1 (The index of number 3)
print(binary_search(my_list, -1)) # => None
```

## 3. Running Time and Big O Notation

Big O notation is a special language used to describe how fast an algorithm is. It doesn't measure speed in seconds;
instead, it measures **how quickly the number of operations increases** as the size of the input ($n$) grows.

### Common Big O Run Times (Fastest to Slowest)

1. **$O(\log n)$ (Log time):** Binary search.
2. **$O(n)$ (Linear time):** Simple search.
3. **$O(n \cdot \log n)$:** Fast sorting algorithms like Quicksort.
4. **$O(n^2)$:** Slow sorting algorithms like Selection Sort.
5. **$O(n!)$:** Extremely slow algorithms like the Traveling Salesperson.

---

## 4. Visualizing the Difference

To understand the power of $O(\log n)$, consider searching a list of **4 billion items**:

* **Simple Search ($O(n)$):** Could take up to **4 billion steps**.
* **Binary Search ($O(\log n)$):** Takes a maximum of only **32 steps**.

> **Big O is about the Worst-Case Scenario:** Big O notation always establishes a "guarantee" of performance. If you use
> simple search ($O(n)$), you might find your item on the first try (Best Case), but Big O tells you it will *never be
slower* than $n$ operations.

---

## 5. The Traveling Salesperson ($O(n!)$)

This is a famous problem where a salesperson must visit $n$ cities while traveling the minimum distance.

* The only way to solve it perfectly is to check every possible combination of cities.
* For 5 cities, there are 120 combinations ($5!$).
* For 100+ cities, the number of operations is so high that it is mathematically impossible to solve in a human
  lifetime.

---

## Key Takeaways

* **Binary search** is significantly faster than simple search but requires a **sorted list**.
* Algorithm speed is measured by the **growth of operations**, not time in seconds.
* **Big O notation** is the standard way to express an algorithm’s worst-case efficiency.
* **Logarithms** are the inverse of exponentials; $\log_2(1024) = 10$ because $2^{10} = 1024$