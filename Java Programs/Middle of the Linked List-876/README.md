# 🎯 Middle of the Linked List (LeetCode 876)

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-876-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Data Structure](https://img.shields.io/badge/Data_Structure-Singly_Linked_List-007ACC?style=for-the-badge)

A clean Java implementation solving **LeetCode Problem #876: Middle of the Linked List** using a **Two-Pass Length Counting Approach**.

---

## 📌 Problem Overview

Given the `head` of a singly linked list, return the **middle node** of the linked list.

* If the list has an **odd** number of nodes, return the exact middle node.
* If the list has an **even** number of nodes (two middle nodes), return the **second middle node**.

---

## 💡 Algorithm & Approach (Two-Pass Traversal)

1. **Null Check**: Verify if `head == null`. If empty, return `null`.
2. **First Pass (Count Nodes)**: Traverse the entire linked list from `head` to `null` to determine the total number of nodes (`count`).
3. **Calculate Midpoint**: Compute the target index using `count / 2` (this naturally lands on the second middle node for even-length lists).
4. **Second Pass (Locate Middle)**: Reset the pointer to `head` and advance `count / 2` steps forward to return the middle node.

---

## ⏱️ Complexity Analysis

| Metric | Complexity | Explanation |
| :--- | :---: | :--- |
| **Time Complexity** | $\mathcal{O}(N)$ | Traverses the list to count nodes ($\mathcal{O}(N)$) and traverses halfway to find the middle ($\mathcal{O}(N/2)$), simplifying to $\mathcal{O}(N)$. |
| **Space Complexity** | $\mathcal{O}(1)$ | Uses constant extra space with only primitive counters and node references. |

---

## 💻 Sample Execution

**Input Sequence (6 Nodes):**
```text
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> NULL