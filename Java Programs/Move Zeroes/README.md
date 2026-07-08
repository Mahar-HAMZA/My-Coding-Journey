# 🔗 Array Optimization: In-Place Element Partitioning (Move Zeroes)

An enterprise-grade documentation for an **Array Manipulation** algorithm implemented in Java, focusing on a highly optimized, stable **Zero Displacement Pipeline** that pushes zero elements to the terminal boundary while preserving the original sequence matrix.

---

## 📐 Algorithmic Strategy & Stable Space Partitioning

Displacing specific elements within raw, primitive data structures often introduces a structural trade-off. While bidirectional swapping across opposite boundary headers can clear zero values from processing frames, it completely disrupts the original sequential order of the active dataset.

### The Linear Two-Pointer Compaction Strategy ($O(N)$ Time, $O(1)$ Space):
This implementation achieves maximum processing throughput and layout stability by scanning the data matrix from a synchronized, forward-moving vector head layout:
1. **Structural Scan & Compaction:** A tracking pointer sweeps the primitive storage block sequentially. When a non-zero element enters the evaluation matrix, it is instantly written into the slot reserved by a secondary write-allocation handle. This compresses the valid integer sequence toward the absolute front of the array without warping its relative structure.
2. **Terminal Constant Padding:** Once the scanning frame reaches structural capacity, the write-allocation handle marks the exact index boundary where active data terminates. A fast downstream loop sweeps from this checkpoint to the end of the data stream, overwriting the remaining records with zero constants.
3. **In-Place Efficiency:** Because all pointer displacements and reference mutations take place entirely within the original data structure, the allocation matrix operates at **$O(1)$ Auxiliary Space Complexity**, making it ideal for large-scale transaction arrays.

---

## 🛠️ System Architecture & Stack

The programmatic architecture strictly complies with modular Object-Oriented Programming (OOP) clean-coding standards, decoupling sorting pipelines from driver environments:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Array Analytical Engine (`Main` Processing Core):** Houses the primary static execution pipeline (`MoveZero`). It regulates structural tracking markers, handles multi-pointer alignment, and overrides sequential data points natively without auxiliary mirror allocations.
* **Driver Runtime (`Main` Entry Point):** The primary orchestration framework hosting the application execution thread (`main` method) to declare target sample arrays, stream raw arrays into the partitioning matrix, and verify structural output bounds on stdout.

---

## 📊 Complexity Analysis Matrix

| Core Computational Routing | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Two-Pointer Array Compaction** | $O(N)$ | $O(1)$ | High-Performance Optimization; modifies index allocations within a single sweep without auxiliary storage arrays. |
| **Terminal Traversal Log** | $O(N)$ | $O(1)$ | Sequential stream traversal mapping the updated array footprint onto the console stream window. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and run this system natively within your localized workspace directory:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your computer.
* **JDK / SDK** properly mapped and active within system compiler variables.

### 2. Execution Pipeline via IntelliJ
1. Load your repository source directory folder directly inside **IntelliJ IDEA**.
2. Confirm your active SDK paths match target properties via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` component from the Project tool pane tree layout.
4. Right-click inside the code editor context and select **Run 'Main.main()'** (or trigger the pipeline via `Shift + F10`).

### 3. Verification & Verification Flow
Upon booting, the driver pipes the raw test sequence directly into the structural array modification engine. The system partitions data positions cleanly, replaces terminal values with trailing zeroes inside the IntelliJ console window, and prints the stable, optimized integer track to confirm absolute alignment accuracy.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**