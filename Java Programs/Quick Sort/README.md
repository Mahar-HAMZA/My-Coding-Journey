# ⚡ Quick Sort Algorithm in Java

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Algorithm](https://img.shields.io/badge/Algorithm-Divide_%26_Conquer-007ACC?style=for-the-badge)
![Average Time Complexity](https://img.shields.io/badge/Time_Complexity-O(n_log_n)-green?style=for-the-badge)

A clean and efficient implementation of the **Quick Sort** algorithm in Java using the **Divide and Conquer** approach and **In-Place Partitioning**.

---

## 📌 How Quick Sort Works

Quick Sort picks an element as a **pivot** and partitions the array around the chosen pivot, such that elements smaller than or equal to the pivot are placed before it, and elements greater are placed after it.

### Algorithm Steps:
1. **Pivot Selection & Swapping**: Selects the starting element as pivot and swaps it with the `end` element.
2. **Partitioning**: Iterates through sub-arrays using a two-pointer technique (`i` and `j`) to group elements `<= pivot` to the left.
3. **Pivot Placement**: Places the pivot in its final sorted position at `i + 1`.
4. **Recursion**: Recursively applies Quick Sort to the left sub-array `[start...pivotIndex-1]` and right sub-array `[pivotIndex+1...end]`.

---

## ⏱️ Complexity Analysis

| Metric | Complexity | Explanation |
| :--- | :---: | :--- |
| **Best Case Time** | $\mathcal{O}(n \log n)$ | Pivot consistently splits array into balanced halves. |
| **Average Case Time** | $\mathcal{O}(n \log n)$ | Expected performance over random input distributions. |
| **Worst Case Time** | $\mathcal{O}(n^2)$ | Occurs when the array is already sorted or reverse sorted with poor pivot selection. |
| **Auxiliary Space** | $\mathcal{O}(\log n)$ | In-place sorting algorithm requiring space only for recursive call stack. |
| **Stability** | ❌ Unstable | Element swaps can change the relative order of duplicate elements. |

---

## 💻 Execution Output

```text
Input:  [6, 3, 9, 5, 2, 8]
Output: 2   3   5   6   8   9