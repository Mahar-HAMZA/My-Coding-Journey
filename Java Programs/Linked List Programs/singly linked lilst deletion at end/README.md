# 🔗 Efficient Singly Linked List (Tail-Synchronized Deletion at End)

An enterprise-grade documentation for a **Singly Linked List** implementation in Java, focusing on **Deletion at Last (Pop Tail)** operations with precise pointer re-alignment and tail tracking synchronization.

---

## 📐 Algorithmic Strategy & Pointer Management

Deleting an element from the tail of a Singly Linked List introduces a classic constraint: unlike a Doubly Linked List, a Singly Linked List cannot look backward. Therefore, to safely remove the last element, the sequence must locate the **second-to-last node**.

### The Synchronization Architecture:
1. **Iterative Secondary Tracking:** The routine utilizes a look-ahead pointer condition (`ptr.next.next != null`) to halt iteration exactly at the second-to-last element.
2. **Link Severance ($O(N)$):** Once positioned, the algorithm breaks the connection to the final node by setting the second-to-last node's forward reference to `null`.
3. **Tail Pointer Re-synchronization:** To preserve the integrity of future constant-time tail insertions, the inner structural tail pointer (`temp`) is instantly redirected to point to this newly established boundary node. This prevents desynchronization and memory leaks.

---

## 🛠️ System Architecture & Stack

The codebase strictly follows Object-Oriented Programming (OOP) design principles, isolating raw data models from functional execution states:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Breakdown:
* **Data Blueprint (`Node` Class):** Encapsulates the sequential node unit containing an integer data payload (`data`) and a forward reference link (`next`).
* **Execution & Memory Engine (`List` Class):** Governs structural modifications. Handles dynamic tail padding via Java's native `Scanner` stream, regulates boundary removals, manages multi-pointer cross-references, and traces sequential configurations to stdout.
* **Runtime Driver (`Main` Class):** The orchestration engine hosting the `main` entry method to simulate structured multi-element insertions, structural verification, boundary tail de-allocation, and structural state reporting.

---

## 📊 Complexity Analysis Matrix

| Core Operation | Time Complexity | Space Complexity | Performance Context |
| :--- | :--- | :--- | :--- |
| **Deletion at End (`deletion_Last`)** | $O(N)$ | $O(1)$ | Requires linear traversal to find the second-to-last tracking boundary node. |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | High-performance execution; uses a dedicated trailing tail pointer. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Iterative sequence lookup streaming active configurations to the IDE. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To compile, link, and run this system natively inside your workspace:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your workstation.
* **JDK / SDK** assigned and verified within active project modules.

### 2. Execution Pipeline via IntelliJ
1. Launch **IntelliJ IDEA** and source your project directory.
2. Ensure compiler configurations look up the correct path via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` component inside the Project pane.
4. Right-click the class scope and trigger **Run 'Main.main()'** (or execute via `Shift + F10`).

### 3. Interactive Runtime Flow
Input integer structures into the active IntelliJ console stream when requested. The system maps the linked chain, prompts the display map, cleanly strips the final node while dynamically updating the structural tracking layout, and prints the pruned state list to verify pointer alignment.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**