# Summary: Chapter 7 - Trees

In this chapter, the focus shifts from general networks to a specific, highly efficient data structure: the **Tree**. [cite_start]While trees are a type of graph, they have unique properties that make them ideal for modeling hierarchies and speeding up data retrieval. [cite: 29, 315]

---

## 1. Defining a Tree
A tree is a special type of graph characterized by two main rules:
* [cite_start]**Connected and Acyclic:** A tree must be connected (all nodes reachable) and **acyclic**, meaning it contains no cycles.
* [cite_start]**Rooted Structure:** The trees discussed here are **rooted trees**, meaning they have one top-level "root" node from which all other nodes branch out.
* [cite_start]**Unique Paths:** Because there are no cycles, there is exactly one unique path from the root to any other node in the tree. [cite: 272]

---

## 2. Depth-First Search (DFS)
[cite_start]While Breadth-First Search (BFS) explores a graph layer by layer, **Depth-First Search** is the standard algorithm for traversing trees by going as deep as possible down one branch before backtracking. [cite: 294, 296]

* [cite_start]**Logic:** DFS starts at the root, moves to the leftmost child, and continues moving down until it hits a leaf node (a node with no children) before moving to the next branch.
* [cite_start]**Use Cases:** It is commonly used for searching file systems or generating a **topological sort**. [cite: 296, 297]
* [cite_start]**Implementation:** Unlike BFS which uses a **Queue**, DFS is typically implemented using **Recursion** (which utilizes a stack). [cite: 175, 538]

---

## 3. Binary Trees
[cite_start]A **Binary Tree** is a tree where every node has a maximum of **two children**, usually called the left child and the right child.

* **Binary Search Trees (BST):** A specialized version where for every node:
  * [cite_start]All nodes in the **left** subtree have values **smaller** than the parent. [cite: 311]
  * [cite_start]All nodes in the **right** subtree have values **larger** than the parent. [cite: 311]
* [cite_start]**Performance:** A balanced BST allows for $O(\log n)$ search time, similar to binary search in an array, but with much faster insertion and deletion speeds. [cite: 317, 318]

---

## 4. Huffman Coding
[cite_start]Trees are the fundamental structure behind **Huffman Coding**, a popular algorithm for data compression.

* [cite_start]**Variable-Length Encoding:** Instead of using a fixed number of bits (like 8 bits per character), Huffman coding uses shorter bit-sequences for characters that appear frequently and longer sequences for rare ones.
* [cite_start]**The Huffman Tree:** The algorithm builds a tree where frequent characters are closer to the root (shorter path/code) and infrequent characters are deeper in the tree.

---

## 5. Code Example: Traversing a Directory Tree
[cite_start]While the book notes that DFS is the standard "deep dive" for trees, this example demonstrates how to use a queue-based approach to list all files in a directory (treating the file system as a tree).

```python
from os import listdir
from os.path import isfile, join
from collections import deque

def printnames(start_dir):
    search_queue = deque()
    search_queue.append(start_dir)
    
    while search_queue:
        current_dir = search_queue.popleft()
        # Sort results to ensure the order is consistent
        for file in sorted(listdir(current_dir)):
            fullpath = join(current_dir, file)
            if isfile(fullpath):
                # If it's a file, we print its name
                print(file)
            else:
                # If it's a folder (a child node), add it to the queue to search later
                search_queue.append(fullpath)

# Example execution
# printnames("my_documents")
```

## Key Takeaways

* **A Tree** is a graph that is connected and has no cycles (acyclic).
* **Rooted trees** have a single starting point; every node except the root has exactly one parent.
* **DFS** is the primary way to traverse trees when you need to explore a full branch before moving sideways.
* **Huffman Coding** leverages tree structures to perform efficient data compression.
* **Binary Search Trees** provide a balance of fast searching and fast data modification.