# 🔗 Doubly Linked List - Insertion at Specific Position

An enterprise-grade documentation for a **Doubly Linked List (DLL)** implementation in Java, focusing on random-access **Insertion at an Arbitrary Index / Position** with complete head-and-tail pointer synchronization.

---

## 📐 Algorithmic Strategy & Pointer Re-alignment

Inserting a node at an arbitrary position within a Doubly Linked List requires navigating to the node immediately preceding the target index (the $N-1$ position) and routing four distinct reference strings simultaneously to preserve the bidirectional structure.

### Detailed Link Synchronization Sequence:
1. **Boundary Position 1 (Prepend):** If the targeted index matches position `1`, execution instantly shifts to the head patch mechanism, running at constant time **$O(1)$**.
2. **Intermediate Random-Access Interlocking ($O(N)$):** The sequence iterates look-ahead reference maps up to the target index configuration. Once positioned, it bridges links:
    * Maps the new node's forward reference (`next`) to the target point.
    * Maps the succeeding node's backward reference (`prev`) back to the new node.
    * Remaps the preceding node's forward link to the new node, and anchors the new node's backward link.
3. **Terminal Synchronization Safeguards (Tail Appends):** If the insertion happens exactly at the end of the sequence boundary (where `newnode.next == null`), the system dynamically shifts the internal trailing tracker pointer (`temp`) forward to anchor onto the new node. This prevents pointer desynchronization during subsequent stream additions.

---

## 🛠️ System Architecture & Stack

The design strictly complies with modular Object-Oriented Programming (OOP) clean-coding standards, separating model layouts from transactional routines:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Data Blueprint (`Node` Class):** The structural capsule containing an integer payload (`data`) along with bidirectional reference handles (`next` and `prev`).
* **Operational Controller (`List` Class):** Encapsulates the core structural modification routines, handles interactive keyboard stream data ingestion via Java's native `Scanner` interface, and coordinates multi-pointer alignment safely.
* **Driver Runtime (`Main` Class):** The host execution framework hosting the application entry point (`main` method) to systematically test sequential tail allocations, random index mutations, and active state transitions on the console.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Runtime Performance Vector |
| :--- | :--- | :--- | :--- |
| **Insertion at Index (`insertion_Specific`)** | $O(N)$ | $O(1)$ | Dependent on list depth; requires traversing references up to the targeted index boundaries. |
| **Tail Initialization (`input`)** | $O(1)$ | $O(1)$ | High performance; utilizes direct address tracking via an internal tail pointer frame. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Sequential frame iteration parsing active forward nodes to print data maps onto stdout. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, build, and run this system natively within your workstation:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your system.
* **JDK / SDK** properly configured inside active IDE project structures.

### 2. Execution Pipeline via IntelliJ
1. Import your working module folder directly into **IntelliJ IDEA**.
2. Ensure compiler configurations trace the proper JDK path via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` component via the Project navigation hierarchy tree.
4. Right-click within the editor container and select **Run 'Main.main()'** (or activate via `Shift + F10`).

### 3. Interactive Runtime Flow
Input integer structures sequentially when prompted by the IntelliJ console stream to populate the list. The system maps the array, requests position/value inputs for random mutations, updates bidirectional link references instantly while adjusting boundary tail configurations, and reprints the active list structures to verify reference compliance.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**