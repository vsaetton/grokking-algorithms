# Chapter 1 - Introduction to algorithms

## 1.1

Suppose you have a sorted list of 128 names, and you’re searching through it using binary search. What’s the maximum
number of steps it would take?

*Answer*: 7

## 1.2

Suppose you double the size of the list. What’s the maximum number of steps now?

*Answer*: 8

## 1.3

You have a name, and you want to find the person’s phone number in the phone book.

*Answer*: $O(log n)$

## 1.4

You have a phone number, and you want to find the person’s name in the phone book. (Hint: You’ll have to search through
the whole book!)

*Answer*: $O(n)$.

## 1.5

You want to read the numbers of every person in the phone book.

*Answer*: $O(n)$.

## 1.6

You want to read the numbers of just the As.

*Answer*: $O(n)$. You may think, “I’m only doing this for 1 out of 26 characters, so the run time should be $O(n/26)$.”
A simple rule to remember is, ignore numbers that are added, subtracted,
multiplied, or divided. None of these are correct Big O run times: $O(n + 26)$, $O(n - 26)$, $O(n * 26)$, $O(n / 26)$.
They’re
all the same as $O(n)!$ Why? If you’re curious, flip to “Big O notation revisited,” in chapter 4, and read up on
constants
in Big O notation (a constant is just a number; 26 was the constant in this question).