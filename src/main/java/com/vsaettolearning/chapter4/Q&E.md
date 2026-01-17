# Chapter 4 Quicksort

## 4.1

Write out the code for the earlier sum function.

*Answer*:

```python
def sum(list):
    if list == []:
        return 0
    return list[0] + sum(list[1:])
```

## 4.2

Write a recursive function to count the number of items in a list.

*Answer*:

```python
def count(list):
    if list == []:
        return 0
    return 1 + count(list[1:])
```

## 4.3

Find the maximum number in a list.

*Answer*:

```python
def max(list):
    if len(list) == 2:
        return list[0] if list[0] > list[1] else list[1]
    sub_max = max(list[1:])
    return list[0] if list[0] > sub_max else sub_max
```

## 4.4

Remember binary search from chapter 1? It’s a divide-and-conquer algorithm, too. Can you come up with the base case and
recursive case for binary search?

*Answer*: The base case for binary search is an array with one item. If the item you’re looking for matches the item in
the array, you found it! Otherwise, it isn’t in the array. In the recursive case for binary search, you split the array
in half, throw away one half, and call binary search on the other half.

## 4.5

Printing the value of each element in an array.

*Answer*: $O(n)$.

## 4.6

Doubling the value of each element in an array.

*Answer*: $O(n)$.

## 4.7

Doubling the value of just the first element in an array.

*Answer*: $O(1)$.

## 4.8

Creating a multiplication table with all the elements in the array. So if your array is [2, 3, 7, 8, 10], you first
multiply every element by 2, then multiply every element by 3, then by 7, and so on

*Answer*: $O(n^2)$