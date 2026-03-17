# Factorial

```pyhon
def factorial(x):
    if x < 0:
        raise ValueError("Factorial is not defined for negative numbers.")
    if x == 0:
        return 1
    return x * factorial(x - 1)
```
