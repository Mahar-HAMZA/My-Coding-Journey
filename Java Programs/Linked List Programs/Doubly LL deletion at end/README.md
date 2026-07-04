# 🔗 Doubly Linked List - Constant Time Tail Deletion ($O(1)$ Optimization)

An enterprise-grade documentation for a **Doubly Linked List (DLL)** implementation in Java, focusing on a highly optimized, loop-free **Deletion at Last (Pop Tail)** operation running at true constant time complexity.

---

## 📐 Algorithmic Strategy & Tail Tracking Optimization

In standard sequential structures or traditional Singly Linked Lists, deleting the terminal node requires a full forward traversal ($O(N)$) to locate the second-to-last node. This implementation bypasses that performance bottleneck completely by leveraging bidirectional references synchronized with a persistent tail tracker pointer.

### The Direct Pointer Shift Mechanism ($O(1)$):
1. **Instant Boundary Remapping:** Since the system maintains an active internal tail reference (`temp`), the algorithm jumps straight to the end of the sequence without looping.
2. **Reverse Link Traversal:** Utilizing the backward reference pointer, the tail tracker is seamlessly shifted one step backward to the second-to-last element (`temp = temp.prev`).
3. **Link Severance & Isolation:** The newly established tail node breaks its forward connection by setting its downstream reference pointer to `null`. This actions orphans the detached node in memory, making it instantly eligible for Java's automatic Garbage Collection (GC) routine.
4. **Complexity Vector:** Execution completes in **$O(1)$ constant time** regardless of the structure's physical size, maximizing throughput.

---

## 🛠️ System Architecture & Stack

The codebase strictly adheres to modular Object-Oriented Programming (OOP) paradigms, decoupling structural node entities from state-mutation controllers:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Data Blueprint (`Node` Class):** The structural core mapping an individual node container holding an integer payload (`data`) along with dual forward (`next`) and backward (`prev`) pointer links.
* **Operational Controller (`List` Class):** Encapsulates memory management logic. Governs instant tail-appends, handles loop-free boundary pointer reductions, manages depleted state resets, and processes keyboard data ingestion via Java's native `Scanner` streams.
* **Driver Runtime (`Main` Class):** The orchestration host hosting the application entry point (`main` method) to systematically allocate a linked sequence, process the optimized boundary removal, and print the resulting traces.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Deletion at End (`deletion_Last`)** | $O(1)$ | $O(1)$ | Maximum Performance Optimization; shifts pointers instantly without traversal loops. |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | Constant time optimization utilizing direct tracking via the persistent tail pointer. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Sequential forward tracking loop streaming active layout maps natively onto stdout. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, build, and test this system natively within your workstation IDE:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your computer.
* **JDK / SDK** properly assigned within active project structure settings.

### 2. Execution Pipeline via IntelliJ
1. Load your workspace directory folder directly inside **IntelliJ IDEA**.
2. Verify SDK paths match project criteria via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` component from the Project panel navigation window.
4. Right-click inside the code editor interface and select **Run 'Main.main()'** (or use the shortcut `Shift + F10`).

### 3. Interactive Runtime Flow
Provide integer payloads sequentially when prompted by the active IntelliJ terminal. The system builds the bidirectional array, prints the original structure, instantly executes the loop-free tail deletion pipeline using the optimized $O(1)$ mechanism, and streams the updated structure back to the terminal tab to confirm absolute reference alignment.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**