# 🔗 Efficient Singly Linked List (Tail-Synchronized Deletion at Start)

An enterprise-grade documentation for a **Singly Linked List** implementation in Java, focusing on high-performance **Deletion at Start (Pop First)** operations with complete pointer synchronization and boundary edge-case handling.

---

## 📐 Algorithmic Strategy & Optimization

Unlike contiguous data structures like arrays—where deleting the first element requires shifting all subsequent elements down the memory blocks (an expensive linear $O(N)$ operation)—Linked Lists excel at boundary mutations through structural pointer redirection.

### The Head & Tail Pointer Synchronization:
1. **Constant Time Execution ($O(1)$):** Deletion from the beginning of the list is achieved by instantly decouplng the leading node and redirecting the operational `head` pointer to the successive node (`head.next`).
2. **State Management Edge Case:** This optimized implementation explicitly tracks list depletion. When the final remaining element is removed, the logic cleanly resets both the tracking `head` and the trailing `temp` (tail) pointers to `null`, effectively preventing dangling references and memory desynchronization during subsequent insertion cycles.

---

## 🛠️ System Architecture & Stack

The codebase strictly adheres to Object-Oriented Programming (OOP) design patterns, isolating physical data layout components from state modification engines:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Breakdown:
* **Data Blueprint (`Node` Class):** Encapsulates the core structural unit containing an integer data payload (`data`) and a self-referencing forward link pointer (`next`).
* **Execution & Memory Engine (`List` Class):** Houses the structural mutation routines. It handles user data inputs via Java's native `Scanner` stream, orchestrates head-redirections, triggers dynamic pointer tracking updates, and outputs structural state maps safely.
* **Runtime Driver (`Main` Class):** The host execution engine containing the entry point (`main` method) to simulate a pipeline of sequential tail insertions, structure visualization, instant boundary deletion, and terminal state validation.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Runtime Performance Vector |
| :--- | :--- | :--- | :--- |
| **Deletion at Head (`At_First`)** | $O(1)$ | $O(1)$ | Maximum Efficiency; instant single-link redirection regardless of list scale. |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | Constant time optimization utilizing a trailing tail tracking pointer. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Sequential iteration tracking node references to stream configurations to the console. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To build, compile, and execute this system within your local workstation setup:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your system.
* **JDK / SDK** mapped and configured inside the active IDE project settings.

### 2. Execution Pipeline via IntelliJ
1. Open **IntelliJ IDEA** and load the project directories.
2. Confirm the compiler path maps correctly under `File > Project Structure > Project > SDK`.
3. Locate the `Main.java` source file in your Project explorer view.
4. Right-click the file and click **Run 'Main.main()'** (or select the class tab and press `Shift + F10`).

### 3. Interactive Runtime Flow
Upon boot, pass integer stream values sequentially when prompted by the IntelliJ terminal console. The engine will render the initial structural sequence, seamlessly drop the leading node via the $O(1)$ pointer redirection pipeline, and immediately print the updated list layout to confirm structural integrity.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**