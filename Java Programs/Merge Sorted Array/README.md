# 🔀 Merge Sorted Array (In-Place 2-Pointer Approach)

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Data Structure](https://img.shields.io/badge/Data_Structure-Arrays-007ACC?style=for-the-badge)
![Time Complexity](https://img.shields.io/badge/Time_Complexity-O(M%2BN)-green?style=for-the-badge)
![Space Complexity](https://img.shields.io/badge/Space_Complexity-O(1)-brightgreen?style=for-the-badge)

A clean Java solution to merge two sorted arrays into a single sorted array **in-place** using the **Two-Pointer technique from right to left**.

---

## 📌 Problem Overview

Given two sorted integer arrays `arr1` and `arr2`, merge `arr2` into `arr1` as one sorted array.

* `arr1` has an initial length of $m + n$, where the first $m$ elements denote the actual data, and the remaining $n$ elements are initialized to $0$ as placeholders.
* `arr2` has a length of $n$.

The goal is to modify `arr1` directly in-place without allocating additional heap memory.

---

## 💡 Algorithm & Approach

Instead of filling elements from the front (which would require shifting elements repeatedly), the algorithm fills `arr1` starting from the **back (index $m + n - 1$)**:

1. **Pointers Initialization**:
    * `current`: Points to the last valid element in `arr1` ($m - 1$).
    * `right`: Points to the last element in `arr2` ($n - 1$).
    * `left`: Points to the last available position in `arr1` ($m + n - 1$).
2. **Backwards Comparison**:
    * Compare `arr1[current]` and `arr2[right]`.
    * Place the larger element at `arr1[left]` and decrement the respective pointers.
3. **Cleanup Loop**:
    * If any remaining elements exist in `arr2`, copy them directly into `arr1`.

---

## ⏱️ Complexity Analysis

| Metric | Complexity | Explanation |
| :--- | :---: | :--- |
| **Time Complexity** | $\mathcal{O}(m + n)$ | Processes each element in both arrays at most once. |
| **Space Complexity** | $\mathcal{O}(1)$ | Operates directly in-place without allocating auxiliary arrays. |

---

## 💻 Sample Output

**Input Data:**
```text
arr1 = [0, 0, 3, 0, 0, 0, 0, 0, 0], m = 3
arr2 = [-1, 1, 1, 1, 2, 3], n = 6