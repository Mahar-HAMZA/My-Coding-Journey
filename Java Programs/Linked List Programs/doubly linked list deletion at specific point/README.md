# 🔗 Doubly Linked List - Random Access Deletion at Specific Position

An enterprise-grade documentation for a **Doubly Linked List (DLL)** implementation in Java, focusing on dynamic **Deletion from an Arbitrary Position** with bidirectional pointer re-routing and strict tracking-pointer synchronization.

---

## 📐 Algorithmic Strategy & Reference Re-routing

Deleting a node from a specific index inside a Doubly Linked List requires navigating directly to the target node (`delptr`) and cross-linking its immediate neighbors. Thanks to bidirectional pointers, we can manipulate both the upstream and downstream links directly from the target instance.

### Logical Mutation Workflow:
1. **Leading Boundary Node (Position 1):** Instantly triggers head-advance pointer manipulation. If the list contains only a single node, the entire layout resets cleanly. If multiple components exist, it shifts the operational `head` forward and severs the reverse link (`head.prev = null`).
2. **Sequential Out-of-Bounds Protection:** The traversal loop verifies node existence at every iteration frame. If the user requests an index boundary exceeding active dimensions, execution halts gracefully to prevent standard NullPointerExceptions.
3. **Bidirectional Cross-linking ($O(N)$):**
    * **Downstream Alignment:** If a node exists after the target, its backward link shifts to skip the target (`delptr.next.prev = delptr.prev`).
    * **Upstream Alignment:** If a node exists before the target, its forward link shifts to skip the target (`delptr.prev.next = delptr.next`).
4. **Terminal Tail Sync Safety:** If the target happens to be the current terminal node (`delptr.next == null`), the system instantly rewinds the internal trailing tracking pointer (`temp = delptr.prev`). This prevents desynchronization for subsequent end-appends.

---

## 🛠️ System Architecture & Stack

The architectural blueprint strictly adheres to Object-Oriented Programming (OOP) clean-coding standards, separating memory layout containers from transaction runtime engines:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Data Blueprint (`Node` Class):** The atomic structural capsule containing an integer payload (`data`) along with dual forward (`next`) and backward (`prev`) pointer hooks.
* **Operational Controller (`List` Class):** Governs structural mutations. Coordinates constant-time tail padding, automates look-ahead position sweeps via Java's native `Scanner` stream, and safely re-routes structural references.
* **Driver Runtime (`Main` Class):** The orchestration host hosting the application entry point (`main` method) to construct a structured linked track, issue random position deletions, and evaluate terminal trace maps.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Runtime Performance Vector |
| :--- | :--- | :--- | :--- |
| **Deletion at Index (`deletion_Specific`)** | $O(N)$ | $O(1)$ | Dependent on list depth; requires linear traversal loops to position onto the targeted node block. |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | Maximum efficiency; utilizes a persistent tracking tail pointer. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Sequential tracking iteration streaming active layout sequences onto stdout. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and run this system natively within your localized workstation workspace:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your system.
* **JDK / SDK** properly mapped within your active project structure modules.

### 2. Execution Pipeline via IntelliJ
1. Import this repository source folder directly inside **IntelliJ IDEA**.
2. Confirm active SDK paths match settings via `File > Project Structure > Project > SDK`.
3. Locate the `Main.java` component via the Project window explorer pane.
4. Right-click inside the file container and hit **Run 'Main.main()'** (or press `Shift + F10`).

### 3. Interactive Runtime Flow
Feed integer stream inputs sequentially when prompted by the IntelliJ terminal console to build the list structure. The program maps the current bidirectional layout, requests a specific index input, executes the dual-pointer connection bypass sequence instantly while auto-adjusting boundary edge trackers, and streams the updated structure back onto the console tab.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**