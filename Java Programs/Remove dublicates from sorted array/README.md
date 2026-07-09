# 🔗 Array Optimization: In-Place Sorted Duplicate Elimination

An enterprise-grade documentation for an **Array Data Manipulation** algorithm implemented in Java, focusing on high-performance, in-place **Duplicate Elimination from a Sorted Stream** with zero auxiliary storage allocation.

---

## 📐 Algorithmic Strategy & Fast Pointer Compaction

Removing redundant items from raw sequential arrays typically demands allocating a dynamic helper collection (like a Hash Set), forcing a memory degradation boundary down to $O(N)$ space complexity. Since the incoming stream data layout is strictly pre-sorted, this solution bypasses memory penalties by leveraging linear index mutations directly.

### The Two-Pointer Sliding Compaction Strategy ($O(N)$ Time, $O(1)$ Space):
1. **Dynamic Frontier Mapping:** The algorithm uses twin reference variables: an inner write-allocation boundary anchor (`left`) and an outer downstream exploratory scanner (`right`).
2. **Redundancy Skipping Phase:** As the exploratory tracker sweeps forward, it skips adjacent matching pairs seamlessly. Because duplicates reside consecutively in sorted arrays, matching fields are bypassed simply by advancing the exploration parameter.
3. **Unique Value Overwriting:** The split-second an independent, non-matching identity bounds check passes, the allocation anchor advances one position forward (`left++`). The newly found unique element is immediately shifted into this targeted slot, compacting distinct records tightly at the front.
4. **Capacity Return Tracking:** Upon terminal collection boundary exit, the unique array sub-segment size maps cleanly onto the zero-indexed pointer coordinate, reporting the precise unique item count via standard mathematical alignment ($\text{left} + 1$).

---

## 🛠️ System Architecture & Stack

The programmatic layout strictly complies with modular Object-Oriented Programming (OOP) standard patterns, decoupling data engineering utilities from system driver processes:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Array Analytical Engine (`Main` Compaction Core):** Houses the primary static execution pipeline (`RemoveDuplicate`). It coordinates boundary range thresholds, handles memory swapping, and manages internal shifting parameters natively inside the host frame.
* **Driver Runtime (`Main` Entry Point):** The primary orchestration host hosting the execution thread (`main` method) to instantiate sample sorted arrays, pipe active arrays into the compaction matrix, and display both the unique entry capacity and total stream values.

---

## 📊 Complexity Analysis Matrix

| Core Operational Sequence | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **In-Place Duplicate Remapping** | $O(N)$ | $O(1)$ | Absolute Efficiency Peak; mutates existing elements inside a single directional sweep without temporary buffers. |
| **Terminal Log Trace Sweep** | $O(N)$ | $O(1)$ | Sequential stream traversal printing the modified array structure directly into stdout. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and run this module natively within your localized workspace environment:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your computer.
* **JDK / SDK** properly assigned and active within active module definitions.

### 2. Execution Pipeline via IntelliJ
1. Load your repository source directory folder directly inside **IntelliJ IDEA**.
2. Verify system configurations trace the correct JDK setup via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` file layout from the Project explorer pane navigation.
4. Right-click inside the active file code editor tab and select **Run 'Main.main()'** (or trigger compilation via `Shift + F10`).

### 3. Verification & Runtime Flow
Upon booting, the program channels the raw, duplicate-ridden array sequence directly into the two-pointer execution framework. The system condenses distinct integer fields toward the front of the block inside the IntelliJ console tab, cuts redundant scanning scopes, prints the length of unique fields, and displays the underlying array footprint to confirm absolute indexing alignment.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**