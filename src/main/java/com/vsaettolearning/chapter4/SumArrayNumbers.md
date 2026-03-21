# Sum

```pyhon
def sum_arr(arr):
    if not arr: # Base case: list is empty
        return 0
    return arr[0] + sum_arr(arr[1:])

if __name__ == '__main__':
    print(sum_arr([2, 4, 6]))
```
