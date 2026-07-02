# 🔗 Singly Linked List Implementation (Insertion at Start)

A professional, well-structured Java implementation demonstrating core Linked List operations, specifically focusing on **Insertion at the Beginning (Start)** with optimized memory management.

## 📝 Description

This project provides a clean, object-oriented implementation of a **Singly Linked List** in Java. It demonstrates how memory is dynamically allocated using custom `Node` structures and how elements can be prepended to the list efficiently in $O(1)$ time complexity.

The implementation features interactive user input via a globally scoped `Scanner` instance to prevent resource leaks and redundant object instantiation.

---

## 💡 Algorithm & Intuition

### Insertion at Start (Prepend Operation)
Inserting a new element at the beginning of a Singly Linked List involves updating pointer references rather than shifting elements (unlike arrays).

1. **Node Creation:** A new node instance is allocated in memory with the user-defined data, and its `next` pointer is initially set to `null`.
2. **Empty List Check (`head == null`):** If the list is empty, the `head` pointer directly points to this newly created node.
3. **Existing List Handling (`else`):** If the list already contains elements:
    * The `next` pointer of the new node is set to point to the current `head` node (`newnode.next = head`).
    * The `head` pointer is then updated to point to the new node (`head = newnode`).

---

## 📊 Complexity Analysis

| Operation | Time Complexity | Space Complexity | Description |
| :--- | :--- | :--- | :--- |
| **Insertion at Start** | **$O(1)$** | **$O(1)$** | Requires constant time as it only involves manipulating a couple of references, regardless of the list size. |
| **Display / Traversal** | **$O(N)$** | **$O(1)$** | Traverses the entire list from `head` to `null` to print each element sequentially. |

---

## 🛠️ Environment & Technical Specifications

* **Language:** Java (JDK 17+)
* **IDE/Tool:** IntelliJ IDEA
* **Domain:** Data Structures & Algorithms (DSA)
* **Data Structure:** Singly Linked List

---
Developed with 🚀 by **Hamza Chief**