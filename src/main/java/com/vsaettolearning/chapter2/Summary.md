# Summary: Chapter 2 - Selection Sort

Chapter 2 introduces fundamental data structures—**arrays** and **linked lists**—and uses them to explain **selection
sort**, your first sorting algorithm.

## 1. How Memory Works

* **The Drawer Analogy:** Computer memory is like a giant set of drawers.
* **Addresses:** Each "drawer" has a specific address.
* **Storage:** Every time you store an item, you ask the computer for space, and it gives you an address to store it.

## 2. Arrays vs. Linked Lists

When storing a list of items, there are two primary methods:

### Arrays

* **Contiguous Storage:** All items are stored right next to each other in memory.
* **The Problem with Adding:** If you run out of space or the next slot is taken, you must move the entire array to a
  new spot in memory that can fit everything.
* **Pros/Cons:**
    * **Fast Reads:** Since you know the starting address and elements are contiguous, you can jump to any index
      instantly ($O(1)$).
    * **Slow Inserts/Deletes:** Adding or removing items often requires shifting other elements ($O(n)$).

### Linked Lists

* **Distributed Storage:** Items can be anywhere in memory; each item stores the address of the next item.
* **Ease of Adding:** You can stick a new item anywhere in memory and just update the link from the previous item.
* **Pros/Cons:**
    * **Fast Inserts/Deletes:** You never have to move items; you just change where the pointers point ($O(1)$).
    * **Slow Reads:** To find the last item, you must start at the first and follow every link in the chain ($O(n)$).

### Summary Table: Run Times

| Operation     | Array  | Linked List |
|:--------------|:-------|:------------|
| **Reading**   | $O(1)$ | $O(n)$      |
| **Insertion** | $O(n)$ | $O(1)$      |
| **Deletion**  | $O(n)$ | $O(1)$      |

## 3. Selection Sort

* **Purpose:** A basic algorithm used to sort a list of elements.
* **How it works:**
    1. Search through the entire list to find the smallest (or largest) element.
    2. Add that element to a new list.
    3. Repeat this process for the remaining elements until the original list is empty.
* **Efficiency:** Because you have to check $n$ elements, then $n-1$, $n-2$, etc., the average number of elements
  checked is $1/2 \times n$. In Big O notation, constants are ignored, so the run time is **$O(n^2)$**.