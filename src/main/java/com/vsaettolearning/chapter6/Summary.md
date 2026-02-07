# Summary: Chapter 6 - Breadth-First Search

**Breadth-First Search (BFS)** is an algorithm used to find the **shortest path** between two nodes in a graph. In an
unweighted graph, "shortest" doesn't mean physical distance; it means the path with the **minimum number of edges**.

---

## 1. Graphs: Nodes and Edges

A graph models a set of connections. It is made up of:

* **Nodes (Vertices):** The entities in the graph (e.g., people, cities, tasks).
* **Edges:** The lines connecting nodes, representing the relationship.
* **Neighbors:** Any node directly connected to another node.

### Graph Types

* **Directed Graph:** Relationships go one way (e.g., Alice follows Bob on Twitter).
* **Undirected Graph:** Relationships are mutual (e.g., Alice and Bob are friends).
* **DAG (Directed Acyclic Graph):** A directed graph with **no cycles**. This is required for Topological Sorting.

---

## 2. Two Questions BFS Answers

BFS is the primary tool for solving "shortest path" problems in unweighted networks:

1. **Is there a path?** (e.g., "Is there a mango seller in my network?")
2. **What is the shortest path?** (e.g., "Who is the *closest* mango seller?")

---

## 3. Data Structure: The Queue

To implement BFS, you must use a **Queue**.

* **FIFO (First-In, First-Out):** Like a line at a store. The first person in is the first person out.
* **Role in BFS:** You add neighbors to the back of the queue. This ensures you exhaust all 1st-degree neighbors before
  moving to 2nd-degree neighbors.

---

## 4. Code Example: The Mango Seller

This algorithm searches your network for a "mango seller" (defined as someone whose name ends with the letter 'm').

### Python Implementation

```python
from collections import deque

def person_is_seller(name):
    return name[-1] == 'm'

def search(name, graph):
    search_queue = deque()      # Initialize the queue
    search_queue += graph[name] # Add your neighbors
    searched = set()            # Keep track of who you've checked

    while search_queue:
        person = search_queue.popleft() # Grab the first person (FIFO)
        if person not in searched:      # Avoid infinite loops
            if person_is_seller(person):
                print(f"{person} is a mango seller!")
                return True
            else:
                search_queue += graph[person] # Add their friends
                searched.add(person)          # Mark as searched
    return False
```

## 5. Visualizing Trees vs. Graphs (Exercise 6.5)

A **Tree** is a special type of graph where nodes only branch out and never create a cycle (nothing points back "up" or
connects back to a previous branch).

```text
    (A) CYCLE (Not a Tree)      (B) HIERARCHY (Tree)      (C) MULTI-PATH (Not a Tree)
       (1) --> (2)                  (1)                      (1)
        ^       |                  /   \                    /   \
        |       v                (2)   (3)                (2)--> (3)
       (3) <----                  |
                                 (4)
```

## 6. Topological Sort

If a graph has dependencies (Task A must happen before Task B), you use a **Topological Sort** to find the correct order
of operations.

* **Logic:** It provides a linear list of steps that respects all arrows in the graph.
* **Constraint:** This only works on a **DAG** (Directed Acyclic Graph). If there is a cycle (e.g., Task A depends on B,
  and B depends on A), a topological sort is impossible.

---

## 7. Performance (Big O)

The complexity of Breadth-First Search is:
$$O(V + E)$$

* **V (Vertices):** You add every node to the queue at most once.
* **E (Edges):** You follow every connection (edge) in the graph exactly once.

---

## Key Takeaways

* **BFS** finds the path with the fewest edges (shortest path).
* **Queues** are FIFO (First-In, First-Out); **Stacks** (Recursion) are LIFO (Last-In, First-Out).
* Always use a **"Searched" list** or set to prevent infinite loops in graphs with cycles.
* A **Tree** is always a graph, but a **Graph** is not always a tree.
