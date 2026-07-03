# 🔗 Efficient Singly Linked List (Tail-Synchronized Deletion at Specific Position)

An enterprise-grade documentation for a **Singly Linked List** implementation in Java, featuring dynamic **Deletion at a Specific Position** with comprehensive multi-pointer tracking and boundary state synchronization.

---

## 📐 Algorithmic Strategy & Pointer Re-alignment

Deleting a node from an arbitrary index within a Singly Linked List requires precise reference manipulation. Since nodes only contain forward links, the algorithm must locate the node directly preceding the deletion target (the $N-1$ node).

### Structural Manipulation Sequence:
1. **Target Boundary Navigation:** The routine executes a look-ahead sequence mapping up to the targeted index node. If the index falls out of bounds or maps to an empty chain, execution halts safely.
2. **Link Skipping ($O(N)$):** Structural detachment is achieved by bypassing the target node completely and re-linking the previous node's `next` pointer directly to the target node's successive link (`ptr.next = ptr.next.next`).
3. **Boundary Synchronization Safeguards:** * **Head Deletion:** Deleting position `1` syncs the structural head. If the action depletes the entire list, the internal trailing pointer (`temp`) resets to `null`.
    * **Tail Deletion:** If the dynamic deletion occurs exactly at the current terminal tail boundary, the inner trailing structural tracker (`temp`) is seamlessly moved backward to track the newly established last node. This preserves constant-time tail insertions.

---

## 🛠️ System Architecture & Stack

The architecture strictly complies with Object-Oriented Programming (OOP) clean-coding paradigms, encapsulating independent memory layers:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Design:
* **Data Blueprint (`Node` Class):** Structural structural engine mapping data allocation containers containing an integer payload (`data`) and a reference forwarding hook (`next`).
* **Operational Controller (`List` Class):** Manages list mutations, dynamic allocation arrays, keyboard streaming configurations via Java's native `Scanner`, and state tracking pointer synchronization.
* **Driver Runtime (`Main` Class):** Main program orchestration engine housing execution flows to build a multi-node linked track, display structures, trigger multiple random-access pointer deletions, and check console system outputs.

---

## 📊 Complexity Analysis Matrix

| Targeted Operation | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Deletion at Index (`deletion_Specific`)** | $O(N)$ | $O(1)$ | Dependent on structural scale; requires traversing up to the targeted position bounds. |
| **Tail Insertion (`input`)** | $O(1)$ | $O(1)$ | Maximum efficiency; utilizes a dedicated trailing tail pointer framework. |
| **Linear Traversal (`display`)** | $O(N)$ | $O(1)$ | Iterative sequence tracking streaming structural outputs natively onto the IDE window. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To launch, test, and run this system cleanly within your localized workflow:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) running natively on your workstation.
* **JDK / SDK** paths successfully configured within global execution environment modules.

### 2. Deployment Pipeline via IntelliJ
1. Load your repository file folder directly into **IntelliJ IDEA**.
2. Confirm the active SDK engine path matches settings via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` program template via the Project navigation hierarchy.
4. Right-click the class scope window and select **Run 'Main.main()'** (or activate via `Shift + F10`).

### 3. Interactive Runtime Flow
Populate data elements sequentially as requested by the active IntelliJ terminal. The system maps the original track arrays, asks for target position adjustments, dynamically skips pointer bindings while instantly syncing boundary pointer configurations, and prompts updated state lists onto the console tab.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**