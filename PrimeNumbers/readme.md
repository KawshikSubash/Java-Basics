# Prime Numbers

Finds and prints all **prime numbers** within a given range, using command-line input.

A prime number is any number greater than 1 that has no divisors other than 1 and itself (e.g. 2, 3, 5, 7, 11...).

---

## How It Works

For every number `i` in the given range:
1. Try dividing it by every number `j` from `2` up to `i - 1`.
2. If any `j` divides `i` evenly (`i % j == 0`), then `i` is **not** prime — stop checking early.
3. If none of them divide evenly, `i` is prime.

**The trick used here:** in Java, a `for` loop variable keeps its last value even after the loop ends. So:
- If the inner loop finds a divisor, it `break`s early — `j` stops at that divisor's value (always less than `i`).
- If the inner loop finishes naturally (no divisor found), `j` keeps incrementing until it equals `i`.

So checking `if (i == j)` after the loop tells us whether the loop ran all the way through without finding a divisor — meaning `i` is prime.

**Example** — checking if `7` is prime (range includes 7):
```
j = 2 → 7 % 2 = 1  (not divisible)
j = 3 → 7 % 3 = 1  (not divisible)
j = 4 → 7 % 4 = 3  (not divisible)
j = 5 → 7 % 5 = 2  (not divisible)
j = 6 → 7 % 6 = 1  (not divisible)
j = 7 → loop condition (j < i) fails, loop exits, j = 7

i == j → 7 == 7 → true → 7 is prime ✅
```

---

## Complexity

| Case | Time Complexity | Explanation |
|---|---|---|
| Per number check | O(n) | Checks every number from 2 up to n-1 |
| Full range (num1 to num2) | O(n²) worst case | Runs the O(n) check for every number in the range |

**Space Complexity:** O(1) — no extra data structures used.

> Note: This is the simple/beginner approach. It can be optimized by only checking divisors up to `√i` instead of `i - 1`, which is much faster for large ranges.

---

## Files

| File | Description |
|---|---|
| `PrimeNumbers.java` | Reads a range from command-line arguments and prints all primes within it |

---

## How to Run

This program takes **two numbers as command-line arguments** — the start and end of the range.

### Windows (Command Prompt / PowerShell)
```cmd
cd PrimeNumbers
javac PrimeNumbers.java
java PrimeNumbers 1 50
```

### Ubuntu / Debian Linux
```bash
cd PrimeNumbers
javac PrimeNumbers.java
java PrimeNumbers 1 50
```

### macOS
```bash
cd PrimeNumbers
javac PrimeNumbers.java
java PrimeNumbers 1 50
```

### Termux (Android)
```bash
cd PrimeNumbers
javac PrimeNumbers.java
java PrimeNumbers 1 50
```

> Replace `1 50` with any range you want — first number is the start, second is the end (inclusive).

---

## Example Output

```
$ java PrimeNumbers 1 50
Prime numbers between 1 and 50 are: 
 2
 3
 5
 7
 11
 13
 17
 19
 23
 29
 31
 37
 41
 43
 47
```

---

## Notes

- Requires **exactly two arguments** — if fewer are given, the program prints a message and exits.
- Both arguments must be valid integers (no built-in validation for non-numeric input in this version — passing text will crash with `NumberFormatException`).
- The range is **inclusive** on both ends.
