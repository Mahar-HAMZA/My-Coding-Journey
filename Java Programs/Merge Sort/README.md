# 🔀 Merge Sort Algorithm in Java

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Algorithm](https://img.shields.io/badge/Algorithm-Divide_%26_Conquer-007ACC?style=for-the-badge)
![Time Complexity](https://img.shields.io/badge/Time_Complexity-O(n_log_n)-green?style=for-the-badge)

A clean, efficient, and well-structured implementation of the **Merge Sort** algorithm in Java using the classic **Divide and Conquer** strategy.

---

## 📌 Algorithm Overview

Merge Sort is a comparison-based, stable sorting algorithm. It works by recursively breaking down an array into smaller sub-arrays until each sub-array contains a single element, and then merging those sub-arrays back together in sorted order.

### Steps:
1. **Divide**: Find the middle index `mid` to split the array into two halves (`start` to `mid` and `mid + 1` to `end`).
2. **Conquer**: Recursively call `divide()` on both halves until sub-arrays have 1 element (`start >= end`).
3. **Combine**: Merge the two sorted halves back together into the original array using the `conquer()` function with a temporary `merged[]` array.

---

## ⚙️ Time & Space Complexity

| Case / Space | Complexity | Explanation |
| :--- | :---: | :--- |
| **Best Case** | $\mathcal{O}(n \log n)$ | Array is divided into $\log n$ levels and merged in $O(n)$ time. |
| **Average Case** | $\mathcal{O}(n \log n)$ | Consistently splits and merges elements in log-linear steps. |
| **Worst Case** | $\mathcal{O}(n \log n)$ | Guarantees $O(n \log n)$ performance regardless of initial element ordering. |
| **Space Complexity** | $\mathcal{O}(n)$ | Requires auxiliary memory for the dynamic `merged` array of size `(end - start + 1)`. |
| **Stability** | ✅ Stable | Preserves relative order of duplicate elements using `<=`. |

---

## 💻 How to Run

1. **Save Code**:
   Save the source code in a file named `Main.java`.

2. **Compile**:
   ```bash
   javac Main.java