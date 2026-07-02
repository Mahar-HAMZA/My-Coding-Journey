# 🔗 Efficient Singly Linked List (Tail-Optimized Insertion)

An enterprise-grade documentation for a **Singly Linked List** implementation, focusing on high-performance **Append (Insertion at End)** operations using smart reference tracking.

---

## 📐 Algorithmic Strategy & Optimization

In a standard Singly Linked List implementation, appending a node to the tail requires traversing the structure from the `head` node through the entire sequence until the `next` pointer equals `null`. This results in a linear time complexity of **$O(N)$**.

### The Tracking Pointer Optimization:
This implementation bypasses the traversal bottleneck by introducing a persistent trailing pointer (`temp`) that constantly tracks the **current tail node**. By maintaining immediate access to the end of the list, structural updates can link directly to the new node, optimizing the insertion operation to a constant time complexity of **$O(1)$**.

---

## 🛠️ System Architecture & Stack

The codebase follows strict Object-Oriented Programming (OOP) principles, isolating data layout from state modification:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Compatible with version 8 and above)

### Component Breakdown:
* **Data Blueprint (`Node` Class):** Encapsulates the core structural unit containing an integer payload (`data`) and a self-referencing forward pointer (`next`).
* **Execution & Memory Engine (`List` Class):** Houses the memory manipulation logic. It handles standard stream inputs via Java's `Scanner` utility, orchestrates link updates, prevents structural leaks, and manages pointers during dynamic allocations.
* **Runtime Driver (`SinglyList` Class):** The host engine containing the application entry point (`main` method) to simulate sequentially chained allocations and invoke downstream trace utilities.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Description |
| :--- | :--- | :--- | :--- |
| **Tail Insertion (Append)** | $O(1)$ | $O(1)$ | Constant time optimization; leverages immediate tail reference redirection without traversing elements. |
| **Linear Traversal (Display)** | $O(N)$ | $O(1)$ | Non-destructive iterative routine utilizing a temporary stack frame reference to print existing data nodes. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To build, compile, and run this system within your local workstation:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) installed.
* **JDK / SDK** properly configured inside the IDE project structure.

### 2. Execution Pipeline via IDE
1. Open **IntelliJ IDEA** and load your project folder.
2. Ensure your JDK is selected in `File > Project Structure > Project > SDK`.
3. Locate the `SinglyList.java` file in your Project tool window.
4. Right-click on the file and select **Run 'SinglyList.main()'** (or press `Shift + F10`).

### 3. Interactive Runtime Flow
Upon execution, the terminal output tab in IntelliJ will prompt you sequentially to populate the data structure. Input integer values when requested to see the structural transformation and dynamic list mutations printed in real-time.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**