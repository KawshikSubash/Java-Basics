# Sorting

Implementation of **Bubble Sort** — one of the simplest sorting algorithms, often the first one taught when learning how sorting works.

Takes a list of numbers as command-line input, sorts them in ascending order, and prints both the unsorted and sorted arrays.

---

##  What is Bubble Sort?

Bubble Sort works by repeatedly comparing adjacent elements in the array and swapping them if they're in the wrong order. On each full pass through the array, the largest unsorted value "bubbles up" to its correct position at the end — hence the name.

This continues until the whole array is sorted.

**Example walkthrough** — sorting `[5, 3, 8, 1]`:

```
Pass 1: [5,3,8,1] → compare 5,3 → swap → [3,5,8,1]
                  → compare 5,8 → no swap
                  → compare 8,1 → swap → [3,5,1,8]   (8 is now in final position)

Pass 2: [3,5,1,8] → compare 3,5 → no swap
                  → compare 5,1 → swap → [3,1,5,8]   (5 is now in final position)

Pass 3: [3,1,5,8] → compare 3,1 → swap → [1,3,5,8]   (fully sorted)
```

---

## Complexity

| Case | Time Complexity | Explanation |
|---|---|---|
| Best (already sorted) | O(n) | *(this implementation still runs full passes — no early-exit optimization)* |
| Average | O(n²) | Nested loop comparisons across the array |
| Worst (reverse sorted) | O(n²) | Maximum number of swaps needed |

**Space Complexity:** O(1) — sorts in place, no extra array used.

**Stable?** Yes — equal elements keep their original relative order.

---

## Files

| File | Description |
|---|---|
| `Sorting.java` | Reads numbers from command-line arguments and sorts them using Bubble Sort |

---

## How to Run

This program takes numbers **as command-line arguments**, not as manual input while running. You need at least 2 numbers.

### Windows (Command Prompt / PowerShell)
```cmd
cd Sorting
javac Sorting.java
java Sorting 5 3 8 1 9
```

### Ubuntu / Debian Linux
```bash
cd Sorting
javac Sorting.java
java Sorting 5 3 8 1 9
```

### macOS
```bash
cd Sorting
javac Sorting.java
java Sorting 5 3 8 1 9
```

### Termux (Android)
```bash
cd Sorting
javac Sorting.java
java Sorting 5 3 8 1 9
```

> Replace `5 3 8 1 9` with any numbers you want to sort, separated by spaces.

---

## Example Output

```
$ java Sorting 5 3 8 1 9
Unsorted array:
5
3
8
1
9

Sorted array:
1
3
5
8
9
```

---

## Error Handling

| Scenario | Behavior |
|---|---|
| Fewer than 2 arguments | Prints a message asking for at least two numbers |
| Non-numeric input (e.g. `abc`) | Catches `NumberFormatException`, prints a friendly error |
| Unexpected index errors | Caught with `ArrayIndexOutOfBoundsException` as a safety net |

---

## Coming Soon

- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
