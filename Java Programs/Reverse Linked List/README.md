# 🔄 Reverse Linked List (Recursive Approach — LeetCode 206)

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-206-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Data Structure](https://img.shields.io/badge/Data_Structure-Singly_Linked_List-007ACC?style=for-the-badge)

A clean Java implementation solving **LeetCode Problem #206: Reverse Linked List** using **Recursion**.

---

## 📌 Problem Overview

Given the `head` of a singly linked list, reverse the list in-place and return the new head of the reversed linked list.

---

## 💡 Algorithm & Recursive Logic

1. **Base Cases**:
    * If `head == null`, the list is empty; return `null`.
    * If `head.node == null`, a single node is already reversed; return `head`.
2. **Recursive Call**: Recursively traverse to the end of the list (`Node newHead = reverseList(head.node)`) to capture the last node as the new head.
3. **Pointer Reversal**: While unwinding the recursion stack, point the next node back to the current node (`head.node.node = head`) and break the old forward link (`head.node = null`) to prevent cycles.

---

## ⏱️ Complexity Analysis

| Metric | Complexity | Explanation |
| :--- | :---: | :--- |
| **Time Complexity** | $\mathcal{O}(N)$ | Visits each of the $N$ nodes once during recursive traversal. |
| **Space Complexity** | $\mathcal{O}(N)$ | Uses auxiliary recursion call stack space proportional to the list length $N$. |

---

## 💻 Sample Execution

**Original List:**
```text
10 20 30 40 50 60