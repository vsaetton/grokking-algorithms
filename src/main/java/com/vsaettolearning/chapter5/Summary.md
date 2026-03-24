# Summary: Chapter 5 - Hash Tables

This chapter explores **Hash Tables**, a data structure that provides a way to store and retrieve data instantly by
mapping keys to values.

---

## 1. Hash Functions

A hash table is built by combining an **array** with a **hash function**. A hash function "maps strings to numbers" (
indices in the array).

### Requirements for a Good Hash Function:

* **Consistency:** Putting in the same string must always return the same number.
* **Unique Mapping:** It should ideally map different words to different numbers.
* **Boundary Awareness:** The function must only return valid indices within the size of the array.

---

## 2. Use Cases

Hash tables are highly versatile and are used for various practical applications.

* **Lookups:** Modeling relationships, such as a phone book (mapping names to numbers) or a menu (mapping items to
  prices).
* **DNS Resolution:** Translating web addresses into IP addresses.
* **Preventing Duplicates:** Quickly checking if an item, such as a voter's name, has been processed already.
* **Caching:** Storing data so that a server doesn't have to repeat a heavy task.

---

## 3. Collisions

A **collision** occurs when two different keys are assigned to the same slot in the hash table array.

* **Handling Collisions:** The most common solution is to start a **linked list** at that slot.
* **Performance Impact:** If many keys collide in one slot, the linked list grows long, and searching through it becomes
  slow.

---

## 4. Performance (Big O)

Hash tables are designed for speed, typically offering "constant time" performance for most operations.

| Operation     | Average Case | Worst Case |
|:--------------|:-------------|:-----------|
| **Search**    | O(1)         | O(n)       |
| **Insertion** | O(1)         | O(n)       |
| **Deletion**  | O(1)         | O(n)       |

* **Average Case:** Known as "constant time." The operation takes the same amount of time regardless of the number of
  items.
* **Worst Case:** Happens if the hash function is poor and all items are stored in a single linked list.

---

## 5. Load Factor

The **load factor** helps track how full the hash table is and when it needs maintenance.
`Load Factor = (Number of items in hash table) / (Total number of slots)`

* **Resizing:** When the load factor gets too high (typically above 0.7), the hash table should be resized to a larger
  array to keep operations fast and minimize collisions.

---

## 6. Python Implementation Examples

In Python, hash tables are implemented as **dictionaries** (`dict`).

### Basic Usage

```python
# Create a new hash table (dictionary)
book = {}

# Adding items (Keys and Values)
book["apple"] = 0.67
book["milk"] = 1.49
book["avocado"] = 1.49

# Looking up a value
print(book["avocado"]) # Output: 1.49
```

### Preventing Duplicates (Voting Example)

```python
voted = {}

def check_voter(name):
    if name in voted:
        print("kick them out!")
    else:
        voted[name] = True
        print("let them vote!")

check_voter("tom")   # let them vote!
check_voter("mike")  # let them vote!
check_voter("mike")  # kick them out!
```

### Using Hash Tables as a Cache

```python
cache = {}

def get_page(url):
    if url in cache:
        return cache[url] # Returns cached data
    else:
        data = get_data_from_server(url)
        cache[url] = data # Saves data in cache for next time
        return data
```

## Key Takeaways

* **Hash tables** provide instant O(1) lookups, making them one of the most useful data structures.
* They depend on a **hash function** to distribute keys across an **array**.
* **Collisions** and a high **load factor** are the primary causes of performance slowdowns.
