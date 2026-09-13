# 📏 Linked List Length Counter (Recursive & Iterative)

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Data Structure](https://img.shields.io/badge/Data_Structure-Singly_Linked_List-007ACC?style=for-the-badge)
![Time Complexity](https://img.shields.io/badge/Time_Complexity-O(N)-green?style=for-the-badge)

A clean Java implementation to calculate the total number of nodes in a **Singly Linked List** using **Tail Recursion**.

---

## 📌 Algorithm Explanation

The algorithm traverses the linked list node-by-node starting from the `head` pointer:
1. **Base Case**: If the current node reference (`counter`) is `null`, return the accumulated count.
2. **Recursive Step**: Increment the accumulator variable (`count + 1`) and make a recursive call with `counter.next`.

---

## ⏱️ Complexity Analysis

| Metric | Complexity | Explanation |
| :--- | :---: | :--- |
| **Time Complexity** | $\mathcal{O}(N)$ | Visits every node in the linked list exactly once. |
| **Space Complexity** | $\mathcal{O}(N)$ | Requires call stack space for $N$ recursive calls. |

---

## 💻 Execution Output

```text
Input List: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
Total Nodes: 5