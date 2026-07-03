# 🔗 Doubly Linked List - Constant Time Insertion at End

An enterprise-grade documentation for a **Doubly Linked List (DLL)** implementation in Java, focusing on high-performance **Append (Insertion at End)** operations optimized via active tail reference tracking.

---

## 📐 Algorithmic Strategy & Tail Optimization

In a naive Doubly Linked List implementation, appending an element requires traversing downstream from the `head` pointer until reaching the termination bound, resulting in an $O(N)$ linear time complexity.

### The Tail Pointer Optimization ($O(1)$):
This implementation eliminates the sequential traversal bottleneck entirely by utilizing a dedicated tracking pointer (`temp`) that persistently references the current tail boundary node:
1. **Empty State Structural Setup:** When the data structure is empty, the initial incoming node acts as both the logical entry point (`head`) and terminal anchor point (`temp`).
2. **Bidirectional Link Interlocking:** For subsequent insertions, the algorithm anchors the current tail's forward link (`temp.next`) to the new node, cross-references the new node's backward link (`newnode.prev`) back to the current tail, and shifts the tracking reference (`temp`) forward to the new terminal node.
3. **Complexity Vector:** Direct address mapping ensures execution completes in **$O(1)$ constant time**, regardless of how large the sequence grows.

---

## 🛠️ System Architecture & Stack

The codebase strictly adheres to modular Object-Oriented Programming (OOP) paradigms, decoupling structural entities from state-mutation engines:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Data Blueprint (`Node` Class):** The structural layout engine representing an individual node capsule containing an integer data payload alongside twin forward (`next`) and backward (`prev`) pointer handles.
* **Operational Controller (`List` Class):** Encapsulates the core structural modification routines, handles interactive keyboard stream data ingestion via Java's native `Scanner` interface, and coordinates dual-pointer link alignment.
* **Driver Runtime (`DoublyList` Class):** The host execution framework hosting the program entry point (`main` method) to systematically test sequential tail allocations and verify active state transitions.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Runtime Performance Vector |
| :--- | :--- | :--- | :--- |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | Maximum performance; instant link redirection using an active tail reference pointer. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Sequential iteration mapping active forward reference nodes to print structural states onto stdout. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To build, compile, and run this system natively within your localized workstation workspace:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your system.
* **JDK / SDK** properly assigned within your project's active SDK modules.

### 2. Execution Pipeline via IntelliJ
1. Load your project repository folder directly inside **IntelliJ IDEA**.
2. Confirm the active SDK engine path matches project specifications via `File > Project Structure > Project > SDK`.
3. Locate the `DoublyList.java` component inside the Project pane hierarchy.
4. Right-click the file and trigger **Run 'DoublyList.main()'** (or execute via `Shift + F10`).

### 3. Interactive Runtime Flow
Input integer structures into the active IntelliJ console stream when prompted. The engine continuously pipes elements directly to the tail of the list, locks bidirectional pointers instantly without heavy looping, and streams the structured output list to verify structural integrity.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**