# Summary: Chapter 3 - Recursion

Recursion is a technique where a function calls itself. It is often described as an "elegant" way to solve problems,
though it rarely provides a performance boost over loops. As the book says: *"Loops may achieve a performance gain for
your program. Recursion may achieve a performance gain for your
programmer."* (https://stackoverflow.com/questions/72209/recursion-or-iteration/72694#72694)

---

## 1. The Two Parts of a Recursive Function

Every recursive function **must** have two parts to avoid an infinite loop:

1. **The Base Case:** The condition under which the function stops calling itself.
2. **The Recursive Case:** The part where the function calls itself and moves closer to the base case.

### Example: Countdown

```python
def countdown(i):
    print(i)
    # Base case
    if i <= 0:
        return
    # Recursive case
    else:
        countdown(i - 1)

countdown(5)
```

## 2. The Stack

To understand recursion, you must understand the **Call Stack**. Imagine a stack of sticky notes. When you call a
function, the computer puts a "sticky note" on the stack with that function's variables.

* **Push:** Adding a new item to the top of the stack.
* **Pop:** Removing the top item from the stack.

### The Call Stack with Recursion

When you use recursion, the stack grows with each call. Each call is "paused" while waiting for the next one to finish.

**Example: Factorial (fact(3))**

1. Call `fact(3)` -> Push to stack.
2. `fact(3)` calls `fact(2)` -> Push to stack.
3. `fact(2)` calls `fact(1)` -> Push to stack.
4. `fact(1)` hits the **Base Case** and returns 1.
5. Pop `fact(1)`, return to `fact(2)`, calculate 2 * 1.
6. Pop `fact(2)`, return to `fact(3)`, calculate 3 * 2.
7. Final result: 6.

---

## 3. Python Implementation: Factorial

```python
def fact(x):
    if x == 1:
        return 1  # Base Case
    else:
        return x * fact(x - 1)  # Recursive Case

print(fact(3)) # Output: 6
```

## 4. Recursion vs. Loops

| Feature         | Loops (Iterative)               | Recursion                           |
|:----------------|:--------------------------------|:------------------------------------|
| **Performance** | Usually faster; lower memory.   | Slower; uses more memory.           |
| **Clarity**     | Can be messy for complex tasks. | Often cleaner and easier to read.   |
| **Memory**      | O(1) space (usually).           | O(n) space (due to the call stack). |

---

## 5. The "Stack Overflow"

When the call stack becomes too large (too many recursive calls), you run out of memory. This is called a **stack
overflow**.

* **Tip:** If you have a very large input, a loop is usually safer than recursion to avoid crashing your program.

---

## Key Takeaways

* **Recursion** is when a function calls itself.
* Every recursive function needs a **base case** and a **recursive case**.
* The **stack** has two operations: **push** and **pop**.
* All function calls go onto the **call stack**.
* The call stack can use a lot of memory. If it gets too tall, you get a **stack overflow**.
