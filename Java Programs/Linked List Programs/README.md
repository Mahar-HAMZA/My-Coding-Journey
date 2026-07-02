# 🔗 Data Structures: The Ultimate Linked List Repository

A centralized, production-grade repository containing comprehensive implementations of all major **Linked List** variants in Java. This collection focuses on highly optimized pointer manipulation, edge-case handling, and rigorous memory efficiency.

---

## 🛠️ Development Environment & Tech Stack

To ensure seamless compilation and runtime execution, all modules are built and verified using the following professional stack:

* **Language:** Java
* **Integrated Development Environment (IDE):** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

---

## 📂 Repository Architecture & Supported Structures

This repository serves as a complete toolkit for node-based sequential data structures, categorized into three core structural types:

### 1. Singly Linked List (SLL)
* Unidirectional node chaining using a single forward reference pointer (`next`).
* Implements optimized constant-time **Tail Insertion ($O(1)$)** via tracking tail pointers, as well as Head Insertion, Deletion, and Linear Searches.

### 2. Doubly Linked List (DLL)
* Bidirectional node traversal leveraging dual-pointer architecture (`next` and `prev`).
* Supports robust forward and backward traversal, complex insertions at arbitrary bounds, and safe node isolation during deletions.

### 3. Circular Linked List (CLL)
* Closed-loop structure where the trailing tail node references back to the leading `head` node.
* Implements specialized rotational traversals and loop management without hitting a null termination point.

---

## 📊 Structural Operation Matrix

| Linked List Type | Traversal Vector | Insertion (Head/Tail) | Deletion (Head/Tail) | Memory Overhead |
| :--- | :--- | :--- | :--- | :--- |
| **Singly Linked List** | Forward Only | $O(1)$ | $O(1)$ / $O(N)$ | Low (Single pointer per node) |
| **Doubly Linked List** | Forward & Backward | $O(1)$ | $O(1)$ | Medium (Two pointers per node) |
| **Circular Linked List** | Continuous Forward | $O(1)$ | $O(1)$ / $O(N)$ | Low (Single pointer loop) |

---

## 🚀 Compiling and Running inside IntelliJ IDEA

Every data structure component in this suite is fully decoupled and contains its own self-contained driver engine (`main` method) to allow individual execution and testing.

### 1. Initial Setup
1. Clone or import this master folder directly into your active **IntelliJ IDEA** workspace.
2. Ensure your JDK path is correctly mapped under `File > Project Structure > Project > SDK`.

### 2. Executing Modules
1. Expand the project tree in IntelliJ and navigate to the file you want to test (e.g., `SinglyList.java`, `DoublyList.java`).
2. Right-click the chosen class file and hit **Run 'ClassName.main()'** (or use the shortcut `Shift + F10`).
3. Use the integrated IntelliJ console tab to interact with the runtime execution and pass test cases via Java's native `Scanner` streams when prompted.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**