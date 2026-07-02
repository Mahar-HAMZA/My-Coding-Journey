# 🔗 Singly Linked List - Insert at Specific Position

A professional Java implementation demonstrating foundational Linked List operations, focusing on sequential data entry and dynamic insertion at any user-defined position ($1$-based index).

## 📝 Description

This project showcases an interactive **Singly Linked List** structure in Java. It supports appending nodes to the end of the list sequentially using a tracking pointer (`temp`) and allows users to insert a new node at a specific position (beginning, middle, or end) by traversing the list up to the target insertion point.

---

## 💡 Algorithm & Intuition

### 1. Sequential Insertion (`input()` Method)
* Used to build the list initially by appending nodes to the tail.
* Maintains a `temp` pointer that always tracks the last node, ensuring that insertions happen in **$O(1)$** time.

### 2. Insertion at Specific Position (`insert_Specific()` Method)
To insert a node at position `pos`, the list must link the new node dynamically by locating the node immediately preceding it (`pos - 1`).

1. **Empty List Check:** If the list is empty (`head == null`), the new node becomes both `head` and `temp`.
2. **Head Position Case (`pos == 1`):** Prepend the node by pointing `newnode.next` to the current `head` and shifting `head` to `newnode`.
3. **Traversal:** Use a pointer `ptr` to skip forward `pos - 2` times until it rests exactly at the node *before* the insertion point.
4. **Tail Handling:** If `ptr.next == null` (inserting at the very end), append it to the current tail and update the global `temp` reference.
5. **Middle Insertion:** For any general position inside the list:
    * Set `newnode.next = ptr.next` (connect new node to the rest of the list).
    * Set `ptr.next = newnode` (link preceding node to the new node).

---

## 📊 Complexity Analysis

| Operation | Time Complexity | Space Complexity | Description |
| :--- | :--- | :--- | :--- |
| **Append (`input`)** | **$O(1)$** | **$O(1)$** | Instant insertion using the tracked tail pointer (`temp`). |
| **Insert at Position** | **$O(N)$** | **$O(1)$** | In the worst case (inserting near the end), it traverses $N$ nodes to find the position. |
| **Display** | **$O(N)$** | **$O(1)$** | Linearly visits every node from `head` to `null`. |

---

## 🛠️ Environment & Technical Specifications

* **Language:** Java (JDK 17+)
* **IDE/Tool:** IntelliJ IDEA
* **Domain:** Data Structures & Algorithms (DSA)
* **Data Structure:** Singly Linked List

---
Developed with 🚀 by **Hamza Chief**