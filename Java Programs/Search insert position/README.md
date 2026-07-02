# 🔍 Search Insert Position

A professional, high-performance solution documentation for the classic LeetCode problem **"Search Insert Position"**, designed for Java implementations using optimized Binary Search.

## 📝 Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

An algorithm with **$O(\log n)$** runtime complexity is mandatory.

### 📥 Examples
*   **Example 1:**
    *   **Input:** `nums = [1, 3, 5, 6]`, `target = 5`
    *   **Output:** `2`
*   **Example 2:**
    *   **Input:** `nums = [1, 3, 5, 6]`, `target = 2`
    *   **Output:** `1`
*   **Example 3:**
    *   **Input:** `nums = [1, 3, 5, 6]`, `target = 7`
    *   **Output:** `4`

---

## 💡 Algorithm & Intuition

The problem demands a logarithmic runtime complexity, making **Binary Search** the optimal approach.

1. **Two-Pointer Setup:** Initialize `low` at `0` and `high` at `nums.length - 1`.
2. **Binary Breakdown:** In every iteration, compute the middle element `mid = low + (high - low) / 2` to avoid potential integer overflow.
3. **Condition Checks:**
    *   If `nums[mid] == target`, return `mid`.
    *   If `nums[mid] < target`, shrink the search space to the right side by setting `low = mid + 1`.
    *   If `nums[mid] > target`, shrink to the left side by setting `high = mid - 1`.
4. **The Insertion Trick:** If the target is not present in the array, the loop breaks when `low > high`. At this exact state, `low` points perfectly to the correct index where the target element should be inserted.

---

## 📊 Complexity Analysis

| Metric | Complexity | Description |
| :--- | :--- | :--- |
| **Time Complexity** | **$O(\log n)$** | The search space is successfully halved at every single step. |
| **Space Complexity** | **$O(1)$** | Iterative execution requiring no auxiliary space. |

---

## 🛠️ Environment & Technical Specifications

*   **Language:** Java (JDK 17+)
*   **IDE/Tool:** IntelliJ IDEA
*   **Domain:** Data Structures & Algorithms (DSA)
*   **Category:** Binary Search

---
Developed with 🚀 by **Hamza Chief**