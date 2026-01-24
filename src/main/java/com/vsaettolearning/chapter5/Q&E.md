# Chapter 5 - Hash tables

## Part 1

Which of these hash functions are consistent?

### 5.1

f(x) = 1 → Returns "1" for all input.

*Answer*: Consistent

## 5.2

f(x) = rand() → Return a random number every time

*Answer*: Not consistent

## 5.3

f(x) = nex_empty_slot() → Returns the index of the next empty slot in the hash table

*Answer*: Not consistent

## 5.4

f(x) = len(x) → Uses the length of the string as the index

*Answer*: Consistent

## Part 2

Suppose you have these four hash functions that work with strings:

A. Return “1” for all input.

B. Use the length of the string as the index.

C. Use the first character of the string as the index. So, all strings starting with a are hashed together, and so on.

D. Map every letter to a prime number: a = 2, b = 3, c = 5, d = 7, e = 11, and so on. For a string, the hash function is
the sum of all the characters modulo the size of the hash. For example, if your hash size is 10, and the string is
“bag”, the index is 3 + 2 + 17 % 10 = 22 % 10 = 2.

For each of the following examples, which hash functions would provide a good distribution? Assume a hash table size of
10 slots.

### 5.5

A phonebook where the keys are names and values are phone numbers. The names are as follows: Esther, Ben, Bob, and Dan.

*Answer*: Hash functions C and D would give a good distribution.

### 5.6

A mapping from battery size to power. The sizes are A, AA, AAA, and AAAA.

*Answer*: Hash functions B and D would give a good distribution.

### 5.7

A mapping from book titles to authors. The titles are _Maus_, _Fun Home_, and _Watchmen_.

*Answer*: Hash functions B, C, and D would give a good distribution.


