# Summary: Chapter 4 - Quicksort

This chapter introduces **Divide and Conquer (D&C)**, a recursive strategy for solving problems. It then applies D&C to
create **Quicksort**, one of the fastest and most widely used sorting algorithms.

---

## 1. Divide and Conquer (D&C)

D&C is a recursive mindset. To solve a problem using D&C, you follow two steps:

1. **Figure out the base case:** This should be the simplest possible case (e.g., an empty array).
2. **Divide or decrease your problem:** Shrink your problem until it becomes the base case.

### Example: Summing an Array

If you want to sum `[2, 4, 6]`:

* **Recursive Step:** `2 + sum([4, 6])`
* **Next Step:** `2 + (4 + sum([6]))`
* **Base Case:** `sum([6])` is just `6`.
* **Total:** `2 + 4 + 6 = 12`.

---

## 2. Quicksort

Quicksort is much faster than Selection Sort. It uses the D&C strategy to sort an array.

### The Algorithm:

1. **Base Case:** If the array has 0 or 1 element, it is already sorted. Return it.
2. **Pick a Pivot:** Choose an element from the array (e.g., the first element).
3. **Partitioning:** Create two sub-arrays: one for elements **smaller** than the pivot and one for elements **larger**
   than the pivot.
4. **Recurse:** Call Quicksort on both sub-arrays and combine them.

### Python Implementation

```python
def quicksort(array):
    if len(array) < 2:
        return array  # Base case
    else:
        pivot = array[0] # Recursive case
        less = [i for i in array[1:] if i <= pivot]
        greater = [i for i in array[1:] if i > pivot]
        
        return quicksort(less) + [pivot] + quicksort(greater)

print(quicksort([10, 5, 2, 3])) # Output: [2, 3, 5, 10]
```

## 3. Big O Notation: Worst Case vs. Best Case

The performance of Quicksort depends entirely on the **pivot** you choose.

* **Worst Case (O(n²)):** This happens if you always pick the smallest (or largest) element as the pivot (e.g., trying
  to sort an already sorted array without picking a random pivot). The stack is very tall ($n$ levels).
* **Best Case (O(n log n)):** This happens if you pick the middle element as the pivot. The stack is short ($\log n$
  levels).
* **Average Case (O(n log n)):** If you pick a **random** element as the pivot, Quicksort hits this average case almost
  every time.

---

## 4. Quicksort vs. Merge Sort

Merge Sort is also $O(n \log n)$, but Quicksort is often faster in practice.

* **Constants:** In Big O notation ($c \cdot n \log n$), Quicksort has a smaller constant ($c$) than Merge Sort, meaning
  it performs fewer actual operations per step.
* **Memory:** Modern implementations of Quicksort are very memory efficient and can often sort "in-place."

---

## Key Takeaways

* **Divide and Conquer** works by breaking a problem down into smaller versions of itself.
* The **Base Case** for sorting is an empty array or an array with one element.
* **Quicksort’s performance** depends on the pivot. A random pivot usually results in $O(n \log n)$ time.
* **Constants** in Big O notation matter when comparing two algorithms with the same Big O run time.