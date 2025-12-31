# Pseudocode: Searching for a Key

This document compares two fundamental ways to solve a nested search problem: **Iteration** and **Recursion**.

---

## 1. Iterative Approach

In the iterative version, we manage our own "to-do list" using a data structure (the `pile`). This is often called a *
*Breadth-First** or **Level-Order** search.

```
def look_for_key(main_box):
    # Initialize our manual tracking system
    pile = main_box.make_a_pile_to_look_through()
    
    while pile is not empty:
        box = pile.grab_a_box()
        for item in box:
            if item.is_a_box():
                # Add new boxes to the end of our list to search later
                pile.append(item)
            elif item.is_a_key():
                print("Found the key!")
                return  # Exit once the goal is reached
```

## 2. Recursive Approach

In the recursive version, we don't need to manually manage a "pile." Instead, the function calls itself. The computer
uses the **Call Stack** to keep track of which boxes are still open and waiting to be searched.

```
def look_for_key(box):
    for item in box:
        if item.is_a_box():
            # RECURSION: The function calls itself to handle the nested box
            look_for_key(item) 
        elif item.is_a_key():
            print("found the key!")
```

## Comparison Summary

| Feature              | Iteration                           | Recursion                                      |
|:---------------------|:------------------------------------|:-----------------------------------------------|
| **Control Flow**     | Uses `while` or `for` loops.        | Function calls itself.                         |
| **State Management** | Uses a local variable (the `pile`). | Uses the **Call Stack**.                       |
| **Stopping Point**   | When the loop condition is False.   | When the **Base Case** is reached.             |
| **Memory Risk**      | Generally low (Heap memory).        | **Stack Overflow** (if recursion is too deep). |

---

## Visualizing the Recursive Call Stack

When the function calls itself, it "stacks" the current state. Each call creates a new "frame" in memory that stores the
current variables for that specific box.

| Stack Layer | Current Task                       | Variable State             |
|:------------|:-----------------------------------|:---------------------------|
| **Call 3**  | Searching inside "Small Inner Box" | `item` = "Key"             |
| **Call 2**  | Searching inside "Medium Box"      | `item` = "Small Inner Box" |
| **Call 1**  | Searching inside "Main Box"        | `item` = "Medium Box"      |

---

### The Importance of the "Base Case"

Every recursive function must have a **Base Case**—a condition where it stops calling itself and begins returning values
back up the stack.

In your `look_for_key` example, the recursion stops when:

1. **The goal is met:** An `item` is identified as a key.
2. **The work is done:** There are no more items in the current box to loop through.

> **Warning:** Without a proper base case (or if the base case is unreachable, like searching for a factorial of a
> negative number using `x == 2`), the program will continue adding layers to the stack until it crashes with a
**StackOverflowError**.

