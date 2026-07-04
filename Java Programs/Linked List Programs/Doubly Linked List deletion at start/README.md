# 🔗 Doubly Linked List - Constant Time Deletion at Start

An enterprise-grade documentation for a **Doubly Linked List (DLL)** implementation in Java, focusing on high-performance **Deletion at Start (Pop First)** operations with complete boundary edge-case handling and bidirectional link cleanup.

---

## 📐 Algorithmic Strategy & Pointer Detachment

In contiguous structural layouts like arrays, dropping the first element triggers an expensive element-shifting routine across the entire block, creating an $O(N)$ resource bottleneck. Doubly Linked Lists optimize this boundary mutation down to constant time.

### Bidirectional Disconnection Workflow ($O(1)$):
1. **List Depletion Handling:** If the list contains only a single active element, removing it clears the system entirely, setting both the logical execution `head` and trailing structural `temp` pointers to `null`.
2. **Head Advance & Pointer Severance:** For multi-node configurations, the sequence performs two quick steps:
    * Advances the operational `head` pointer downstream to the second node (`head = head.next`).
    * Safely isolates and cuts the trailing reference of the new head node by mapping its backward reference pointer to null (`head.prev = null`).
3. **Garbage Collection Integration:** By completely unlinking the forward and backward paths of the initial node, it becomes an orphan in memory, allowing Java's automatic Garbage Collector to cleanly reclaim it without memory leaks.

---

## 🛠️ System Architecture & Stack

The codebase layout strictly complies with Object-Oriented Programming (OOP) clean-code design paradigms, segregating data blueprints from operational controllers:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Data Blueprint (`Node` Class):** The atomic element block containing an integer container (`data`) along with twin forward (`next`) and backward (`prev`) pointer handles.
* **Operational Controller (`List` Class):** Governs structural mutations. Coordinates rapid tail appends, handles single-link boundary removals, automates terminal adjustments, and processes data intake via Java's native `Scanner` streams.
* **Driver Runtime (`Main` Class):** The program execution runner hosting the `main` driver engine to populate structural nodes, trigger boundary pop routines, and display active structural traces inside the IDE terminal.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Runtime Performance Vector |
| :--- | :--- | :--- | :--- |
| **Deletion at Head (`deletion_Start`)** | $O(1)$ | $O(1)$ | Maximum performance; executes isolated pointer redirection instantly regardless of list length. |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | Constant time optimization utilizing a persistent trailing tail reference pointer. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Iterative loop shifting tracking references forward to stream active node layouts onto stdout. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and run this module natively within your localized system workspace:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your computer.
* **JDK / SDK** properly assigned within active project structure variables.

### 2. Compilation Steps via IntelliJ
1. Import this source repository folder directly into **IntelliJ IDEA**.
2. Verify structural SDK configurations map your local JDK path via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` source class from the Project explorer pane.
4. Right-click inside the file container and hit **Run 'Main.main()'** (or use the shortcut `Shift + F10`).

### 3. Interactive Testing Flow
Feed integer configurations sequentially into the active IntelliJ console tab when prompted by the stream. The program sets up the bidirectional linked structure, cleanly strips the leading node using the instant $O(1)$ pointer manipulation pipeline, and prints the pruned state sequence to verify data and structural integrity.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**