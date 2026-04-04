# Summary: Chapter 8 - Balanced Trees

This chapter explores how **Binary Search Trees (BSTs)** can be optimized to avoid performance pitfalls. When a standard
BST becomes "unbalanced," it loses its efficiency, making **Balanced Trees** essential for high-performance
applications.

---

## 1. The Power of Binary Search Trees (BSTs)

A BST is a type of binary tree that combines the search speed of a sorted array with the insertion speed of a linked
list.

* **The BST Property:** For every node, the **left child** is always smaller, and the **right child** is always larger.
* **Subtree Rule:** This property extends to the entire subtree: all nodes in the left subtree are smaller than the
  parent node.
* **Fast Searching:** Because you can eliminate half the tree at each step, searching a BST is highly efficient.

---

## 2. Why "Balance" Matters

The performance of a tree depends entirely on its **height**.

* **Best Case (Balanced):** The tree is short and bushy. Its height is O(log n), allowing for logarithmic search and
  insertion times.
* **Worst Case (Unbalanced):** If you add sorted data (e.g., 1, 2, 3, 4, 5), the tree becomes a "skinny" line.
* **The Problem:** A skinny tree is essentially a **linked list**. Its height becomes O(n), making searches linear and
  slow.
* **The Goal:** To ensure O(log n) performance, we must guarantee the tree stays as short as possible through *
  *balancing**.

---

## 3. AVL Trees: Self-Balancing

**AVL trees** are a specific type of BST that automatically stay balanced.

* **Self-Correction:** Whenever an AVL tree becomes "out of balance" (too tall on one side), it corrects itself.
* **Rotations:** AVL trees use **rotations** to rearrange nodes. This process moves a set of nodes to a new, shorter
  arrangement, often changing which node is the root.
* **Performance:** They guarantee **O(log n)** time for search, insertion, and deletion by maintaining a height close to
  log n.

---

## 4. Other Balanced Tree Types

The chapter introduces other specialized trees for different needs:

* **Splay Trees:** These move the most recently accessed nodes to the top (near the root) so they can be found even
  faster the next time.
* **B-Trees:** These are wide, "fat" trees used extensively in **databases** to store massive amounts of data while
  keeping the height extremely low.

---

## 5. Performance Comparison

A balanced tree provides the best balance of speed across all major operations:

| Operation     | Sorted Array | Linked List | Balanced BST |
|:--------------|:-------------|:------------|:-------------|
| **Search**    | O(log n)     | O(n)        | **O(log n)** |
| **Insertion** | O(n)         | O(1)        | **O(log n)** |
| **Deletion**  | O(n)         | O(1)        | **O(log n)** |

---

## Key Takeaways

* **Trees** are the go-to data structure when arrays and linked lists aren't fast enough.
* A **BST** is only efficient if it is **balanced**; otherwise, it performs like a linked list.
* **AVL trees** use **rotations** to maintain an O(log n) height.
* **B-trees** are the standard for managing data in modern databases.