# Summary: Chapter 2 - Selection Sort

This chapter explores how computer memory works and compares the two most fundamental ways to store data: **Arrays** and
**Linked Lists**. It concludes by using these concepts to implement your first sorting algorithm: **Selection Sort**.

---

## 1. How Memory Works

Your computer’s memory is like a giant set of drawers, each with its own **address**.

* When you want to store something, you ask the computer for space.
* The computer gives you an address (e.g., fe0f or eb12) where your data is stored.
* If you need to store multiple items, you must choose between an **Array** or a **Linked List**.

---

## 2. Arrays vs. Linked Lists

Both structures store lists of data, but they handle memory allocation very differently.

### Arrays (Contiguous Memory)

* **Concept:** All items are stored right next to each other in memory.
* **The Movie Theater Analogy:** It’s like a group of friends sitting together in a row. If a new friend joins and there
  are no empty seats next to you, the entire group must move to a new row that fits everyone.
* **Random Access:** Because items are contiguous, you can calculate the exact address of any index instantly.
* **Efficiency:** * Read: O(1) (Instant)
    * Insertion/Deletion: O(n) (Slow, because you must shift other elements)

### Linked Lists (Scattered Memory)

* **Concept:** Items can be anywhere in memory. Each item stores the **address of the next item** in the list.
* **The Treasure Hunt Analogy:** You go to the first address, which tells you where the second item is, and so on.
* **Sequential Access:** To find the 5th item, you must visit the first 4 items to get their addresses. You cannot jump
  directly to the middle.
* **Efficiency:**
    * Read: O(n) (Slow)
    * Insertion/Deletion: O(1) (Fast, if you have the address of the element)

---

## 3. Comparison Table: Run Times

| Operation | Array | Linked List |
|:----------|:------|:------------|
| Reading   | O(1)  | O(n)        |
| Insertion | O(n)  | O(1)        |
| Deletion  | O(n)  | O(1)        |

---

## 4. Selection Sort

Selection Sort works by repeatedly finding the "smallest" (or largest) item in a list and moving it to a new sorted
list.

### How it Works:

1. Suppose you have a list of numbers: [5, 3, 6, 2, 10].
2. Search through the list to find the smallest number (2).
3. Pop it out and add it to a new list.
4. Repeat this for the remaining numbers until the original list is empty.

### Performance: O(n^2)

* You have to check n elements to find the smallest one (O(n) time).
* You have to do this n times (n * n).
* **Result:** O(n^2) (Quadratic time).

---

## 5. Python Implementation

Following the second edition, here is the code to sort an array from smallest to largest.

```python
# Function to find the smallest element in an array
def findSmallest(arr):
    smallest = arr[0]        # Stores the smallest value
    smallest_index = 0      # Stores the index of the smallest value
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

# Function to perform Selection Sort
def selectionSort(arr):
    newArr = []
    for i in range(len(arr)):
        # Finds the smallest element and adds it to the new array
        smallest = findSmallest(arr)
        newArr.append(arr.pop(smallest))
    return newArr

print(selectionSort([5, 3, 6, 2, 10])) # Output: [2, 3, 5, 6, 10]
```

## Key Takeaways

* **Arrays** allow fast **random access** (O(1) reads) because all items are contiguous in memory.
* **Linked Lists** are better for fast **insertions and deletions** (O(1)) because you only need to change where a
  pointer "points."
* **Selection Sort** is a basic sorting algorithm with **O(n²)** run time.
* In Big O notation, we ignore constants. Even though you check fewer elements as the list gets smaller (n, n-1,
  n-2...), it still averages out to n/2 checks, which simplifies to **O(n²)**.
* **Choosing the right structure matters:** If your app involves many more reads than inserts, use an Array. If it
  involves many more inserts than reads, use a Linked List.