# Summary: Chapter 5 - Hash Tables

Chapter 5 introduces **Hash Tables**, arguably the most important data structure in a programmer's toolbox. They provide
a way to map keys to values, allowing for near-instant data retrieval regardless of the size of the dataset.

## 1. The Hash Function

A hash function is the "engine" of a hash table. It takes an input (like a string) and spits out a number.

* **Consistency:** The same input always results in the same output number.
* **Index Mapping:** It maps different strings to different indexes in an array.
* **One-Way:** You can't put the number back in to get the original string.

## 2. Real-World Use Cases

Hash tables (known as `dict` in Python, `HashMap` in Java, or `Objects` in JavaScript) are used for:

### A. Lookups

Mapping a person's name to their phone number, or a website name to an IP address (DNS).

### B. Preventing Duplicates

Using a hash table to track who has already voted in a contest.

```python
voted = {}
def check_voter(name):
    if voted.get(name):
        print("Kick them out!")
    else:
        voted[name] = True
        print("Let them vote!")
```

## 3. Collisions and Performance

A **collision** occurs when the hash function assigns two different keys to the same slot in the array.

### Dealing with Collisions

The most common solution is to start a **linked list** at that slot. If multiple keys land in the same slot, they are
simply added to the list. However, if a hash function is poor and puts all keys into a single slot, the hash table
effectively becomes a giant linked list.

### Performance Breakdown

| Operation  | Average Case (Constant Time) | Worst Case (Linear Time) |
|:-----------|:-----------------------------|:-------------------------|
| **Search** | $O(1)$                       | $O(n)$                   |
| **Insert** | $O(1)$                       | $O(n)$                   |
| **Delete** | $O(1)$                       | $O(n)$                   |

* **Average Case:** The hash function distributes keys evenly. Linked lists at each slot are very short (1 or 2 items),
  making lookups feel instantaneous.
* **Worst Case:** Every item is in one slot. To find a specific key, you have to search through all $n$ items in that
  list.

## 4. Avoiding the Worst Case

To maintain $O(1)$ performance, you need to manage two factors:

### A. Load Factor

The load factor measures how "full" your hash table is:
$$\text{Load Factor} = \frac{\text{Number of items in hash table}}{\text{Total number of slots}}$$
If the load factor starts to grow (the book recommends resizing once it hits **0.7**), you must **resize**. This
involves creating a new, larger array and re-inserting all existing items using the hash function.

### B. A Good Hash Function

A good hash function distributes values evenly across the array. A bad hash function clusters values together, which
increases the likelihood of collisions and slows down your program.

## Key Takeaways

* Hash tables are built using an **array** and a **hash function**.
* They are ideal for **modeling relationships**, **filtering duplicates**, and **caching**.
* To stay fast ($O(1)$), keep the **load factor low** and use a **high-quality hash function**.