# Summary: Chapter 6 - Breadth-First Search

[cite_start]**Breadth-First Search (BFS)** is the algorithm used to solve **shortest-path problems
**[cite: 138, 141]. [cite_start]In an unweighted graph, it finds the path with the **minimum number of segments** or
edges[cite: 123, 137, 414].

---

## 1. Graphs: Modeling Connections

[cite_start]A graph is an abstract data structure used to model a network of connections[cite: 118, 153].

* [cite_start]**Nodes and Edges:** Every graph is composed of **nodes** (the entities) and **edges** (the connections
  between them)[cite: 148, 149].
* **Neighbors:** Nodes directly connected to another node. [cite_start]In directed graphs, these are specifically *
  *in-neighbors** (pointing to the node) or **out-neighbors** (the node points to them)[cite: 150].
* **Graph Types:**
    * [cite_start]**Directed:** Relationships have a direction (e.g., Alex owes Rama money)[cite: 120, 146].
    * [cite_start]**Undirected:** Relationships are mutual; the edge has no arrow, effectively meaning nodes are each
      other's neighbors.
    * [cite_start]**DAG (Directed Acyclic Graph):** A directed graph with **no cycles**.

---

## 2. Two Questions BFS Answers

[cite_start]BFS provides two distinct pieces of information about a network[cite: 156]:

1. [cite_start]**Existence:** Is there a path from node A to node B? [cite: 156, 172]
2. [cite_start]**Shortest Path:** What is the path with the fewest steps between them? [cite: 157, 173]

[cite_start]**Real-world examples:** Writing a spellchecker (fewest edits), finding the closest doctor in a network, or
building a search engine crawler[cite: 124, 125, 126].

---

## 3. Data Structure: The Queue

[cite_start]The BFS algorithm relies on a **Queue** to ensure it radiates outward correctly from the starting
point[cite: 179, 192].

* [cite_start]**FIFO (First-In, First-Out):** Elements are searched in the exact order they are added[cite: 191, 199].
* [cite_start]**Order Matters:** By searching 1st-degree neighbors before 2nd-degree neighbors, BFS guarantees that the
  first "target" found is the closest one[cite: 184, 185]. [cite_start]If you used a Stack (LIFO), you might find a
  path, but it wouldn't be the shortest[cite: 321, 325].

---

## 4. Code Implementation: The Mango Seller

[cite_start]To search for a "mango seller" (someone whose name ends in 'm'), we use a queue and a set to track
progress[cite: 161].

```python
from collections import deque

def person_is_seller(name):
    return name[-1] == 'm'

def search(name, graph):
    search_queue = deque()      # Creates a new queue
    search_queue += graph[name] # Adds all your neighbors to the queue
    searched = set()            # Tracks people already checked to avoid infinite loops

    while search_queue:
        person = search_queue.popleft() # Grabs the first person off the queue
        if person not in searched:
            if person_is_seller(person):
                print(f"{person} is a mango seller!")
                return True
            else:
                search_queue += graph[person] # Adds this person's friends to the queue
                searched.add(person)          # Marks person as searched
    return False
```

## 5. Trees vs. Graphs

A **Tree** is a specific type of graph.

* **The Rule:** A tree is a graph that **never has cycles**; it only branches out.
* **Navigation:** In a tree, there is exactly one unique path from the root to any other node. If you can get back to a
  node using a different path, or if a node points back to an ancestor, it is a graph but not a tree.

---

## 6. Topological Sort

When nodes have dependencies (Task A must happen before Task B), a **Topological Sort** identifies the necessary order
of tasks.

* **Linear Ordering:** It produces a list where every dependent node comes after the node it depends on.
* **Requirement:** This only works on **DAGs** (Directed Acyclic Graph). If a graph has a cycle (e.g., Task A depends on
  B, and B depends on A), there is no "first" task, making a topological sort impossible.

---

## 7. Performance (Big O)

The running time for Breadth-First Search is expressed as:
**O(V + E)**

* **V (Vertices):** You add every node to the queue at most once.
* **E (Edges):** You follow every edge (connection) in the graph exactly once.
* **Why it matters:** This means the time taken is proportional to the size of the entire network you are searching.

---

## Key Takeaways

* **Shortest path** in BFS refers to the fewest number of edges (segments), not physical distance or time.
* Use a **queue** (First-In, First-Out) for BFS; use a **stack** (Last-In, First-Out) for DFS/Recursion.
* The **"searched" set** is mandatory for any graph that might contain a cycle to prevent infinite loops.
* **O(V + E)** is the standard complexity for searching a graph.