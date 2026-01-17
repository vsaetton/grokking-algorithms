# Summary: Chapter 4 - Quicksort

Chapter 4 introduces **Divide and Conquer (D&C)**, a powerful recursive strategy for problem-solving, and applies it to
create **Quicksort**, one of the most efficient sorting algorithms.

## 1. Divide & Conquer (D&C)

D&C is a recursive technique used to break a problem down into smaller and smaller pieces until you reach a version of
the problem that is easy to solve.

### The Two Steps of D&C:

1. **Identify the Base Case:** This is the simplest possible case (e.g., an empty array).
2. **The Recursive Step:** Divide or "decrease" your problem until it becomes the base case.

### Example: Summing an Array

Instead of using a loop to sum `[2, 4, 6]`, you can use D&C:

* **Base Case:** If the list is empty, the sum is 0.
* **Recursive Step:** The sum of `[2, 4, 6]` is `2 + sum([4, 6])`.

**Python Code for Recursive Sum:**

```python
def sum(list):
    if list == []:
        return 0
    return list[0] + sum(list[1:])
```

## 2. Quicksort

Quicksort is much faster than Selection Sort because it uses D&C to sort an array.

### How the Algorithm Works:

1. **Pick a Pivot:** Choose an element from the array (e.g., the first element).
2. **Partitioning:** Create two sub-arrays: one containing all elements smaller than the pivot, and one containing all
   elements larger than the pivot.
3. **Recursion:** Call quicksort on both sub-arrays.

**The Base Case:** An array with 0 or 1 element is already sorted.

**Python Code for Quicksort:**

```python
def quicksort(array):
    if len(array) < 2:
        return array  # Base case: arrays with 0 or 1 element are already sorted
    else:
        pivot = array[0] # Recursive case
        less = [i for i in array[1:] if i <= pivot]
        greater = [i for i in array[1:] if i > pivot]
        return quicksort(less) + [pivot] + quicksort(greater)

print(quicksort([10, 5, 2, 3])) # Output: [2, 3, 5, 10]
```

## 3. Big O Notation: Average vs. Worst Case

Quicksort is unique because its performance depends heavily on the **pivot** you choose.

* **Worst Case ($O(n^2)$):** This happens if you always pick the first element as the pivot and the array is already
  sorted. In this scenario, the stack height is $n$, meaning you aren't really dividing the problem in half; you're just
  shaving off one element at a time.
* **Average Case ($O(n \log n)$):** If you pick a middle element or a random pivot, the stack height is $\log n$. You
  are dividing the array into two roughly equal halves at each step.

### Quicksort vs. Merge Sort

Both algorithms have an average run time of $O(n \log n)$. However, Quicksort is often faster in practice because it has
a smaller **constant**.

* **The Constant:** In Big O notation ($c \times n$), the '$c$' is a fixed amount of time that an algorithm takes.
  Usually, we ignore it, but when two algorithms have the same Big O run time (like Quicksort and Merge Sort), the one
  with the smaller constant wins. Quicksort's constant is smaller than Merge Sort's, making it faster for most
  real-world data.

## Key Takeaways

* **Divide and Conquer (D&C)** works by breaking a problem down into smaller sub-problems.
* The **base case** for recursive functions on arrays is usually an empty array or an array with one element.
* **Quicksort** is $O(n \log n)$ on average but $O(n^2)$ in the worst case.
* **Pivot selection** is the most important factor in Quicksort's efficiency. Choosing a random element as the pivot
  usually results in the average case run time.
