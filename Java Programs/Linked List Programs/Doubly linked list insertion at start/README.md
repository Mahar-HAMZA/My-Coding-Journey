# 🔗 Doubly Linked List - Constant Time Insertion at Start

An enterprise-grade documentation for a **Doubly Linked List (DLL)** implementation in Java, focusing on high-performance **Insertion at Head (Prepend)** operations with bidirectional pointer synchronization.

---

## 📐 Algorithmic Strategy & Pointer Architecture

Unlike a Singly Linked List where nodes only reference downstream elements, a Doubly Linked List maintains a bidirectional chain. Each node encapsulates two reference hooks: one pointing forward (`next`) and one pointing backward (`prev`).

### The Prepend Optimization ($O(1)$):
Inserting a node at the absolute beginning of a Doubly Linked List requires immediate dual-link synchronization to maintain the bidirectional structural integrity:
1. **Empty State Instantiation:** If the list is empty, both the structural `head` and the tracking tail reference (`temp`) anchor directly to the newly allocated node.
2. **Bidirectional Linkage:** If the list contains existing elements, the new node's forward reference points to the current head, the current head's backward reference links back to the new node, and the `head` pointer updates to the new boundary node.
3. **Performance Vector:** Because this routine maps references instantly without loops, it operates at a guaranteed constant time complexity of **$O(1)$**.

---

## 🛠️ System Architecture & Stack

The design strictly complies with Object-Oriented Programming (OOP) paradigms, decoupling structural entities from operational mutation engines:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Data Blueprint (`Node` Class):** The structural core mapping an integer data payload (`data`) along with twin reference pointer handles (`next` and `prev`).
* **Operational Controller (`List` Class):** Encapsulates memory management logic. Handles bidirectional pointer alignment, dynamic memory allocation routines, and data collection using Java's native `Scanner` stream wrapper.
* **Driver Runtime (`Main` Class):** The execution host hosting the program entry point (`main` method) to sequentially build a multi-node doubly-linked sequence, execute immediate entry point prepends, and run trace maps.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Insertion at Head (`insertion_First`)** | $O(1)$ | $O(1)$ | Maximum performance; instant reference patching regardless of list length. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Sequential forward traversal parsing active reference nodes to output current layout states. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, link, and run this system natively within your workstation IDE:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your machine.
* **JDK / SDK** properly assigned within your active project modules.

### 2. Execution Pipeline via IntelliJ
1. Load your workspace directory folder directly inside **IntelliJ IDEA**.
2. Verify SDK configurations match your workspace setup via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` source file from the Project navigation tool window.
4. Right-click within the class scope and choose **Run 'Main.main()'** (or activate via `Shift + F10`).

### 3. Interactive Runtime Flow
Input integer payloads sequentially into the IntelliJ terminal console when prompted. The engine continuously pushes elements to the front of the list, updates bidirectional nodes instantly, and streams the ordered layout to confirm flawless reference integration.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**