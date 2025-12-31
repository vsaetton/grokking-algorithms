# Chapter 3 - Recursion

## 3.1

Suppose I show you a call stack like this.

| Function   | Variables    |
|:-----------|:-------------|
| **GREET2** | NAME: MAGGIE |
| **GREET**  | NAME: MAGGIE |

What information can you give me, just based on this call stack?

*Answer*: Here are some things you could tell me:

* The `greet` function is called first, with `name = maggie`.
* Then the `greet` function calls the g`reet2` function, with `name = maggie`.
* At this point, the `greet` function is in an incomplete, suspended state.
* The current function call is the `greet2` function.
* After this function call completes, the `greet` function will resume.

## 3.2

Suppose you accidentally write a recursive function that runs forever. As you saw, your computer allocates memory on the
stack for each function call. What happens to the stack when your recursive function runs forever?

*Answer*: The stack grows forever. Each program has a limited amount of space on the call stack. When your program runs
out of space (which it eventually will), it will exit with a stack overflow error.