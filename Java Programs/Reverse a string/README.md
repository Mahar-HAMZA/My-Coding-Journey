# 🔗 String Optimization: In-Place Character Reversal

An enterprise-grade documentation for a **String Data Manipulation** algorithm implemented in Java, focusing on a highly optimized, in-place **Character Reversal Pipeline** utilizing strict memory constraints.

---

## 📐 Algorithmic Strategy & In-Place Swapping

Reversing a sequence of characters typically tempts developers to allocate a new String object or utilize a dynamic String Builder, which inherently pushes the space complexity up to $O(N)$. This solution strictly adheres to the $O(1)$ auxiliary space constraint by mutating the raw character array directly in-place.

### The Two-Pointer Convergence Strategy ($O(N)$ Time, $O(1)$ Space):
1. **Dual Boundary Mapping:** The system initializes two reference pointers at the absolute extremes of the character matrix: a `left` pointer at the starting coordinate ($0$) and a `right` pointer at the terminal coordinate ($\text{length} - 1$).
2. **Symmetric Value Swapping:** The algorithm evaluates the matrix symmetrically. While the `left` boundary index remains strictly less than the `right` boundary, the characters at both coordinates are swapped using a lightweight, primitive temporary variable.
3. **Center Convergence:** Following a successful swap, the `left` pointer steps forward (`left++`) and the `right` pointer steps backward (`right--`), shrinking the operational window symmetrically.
4. **Execution Termination:** The execution cycle seamlessly terminates the exact moment the pointers cross or meet at the structural center. This guarantees that every character has been mirrored across the median axis with exactly $N/2$ swapping operations.

---

## 🛠️ System Architecture & Stack

The programmatic architecture complies with clean-coding standards, decoupling the primary string mutation engine from driver environments:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **String Analytical Core (`Main` Partition Engine):** Houses the primary static execution pipeline (`reverseString`). It oversees boundary constraints, manages primitive swapping logic, and overrides character data coordinates natively inside the host array.
* **Driver Runtime (`Main` Entry Point):** The principal orchestration host managing the execution thread (`main` method) to instantiate sample character arrays, feed them into the reversal matrix, and print the structural output bounds on stdout.

---

## 📊 Complexity Analysis Matrix

| Core Computational Routing | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Two-Pointer Array Reversal** | $O(N)$ | $O(1)$ | Absolute Efficiency Peak; iterates through exactly half the array ($\frac{N}{2}$) using a single primitive variable for memory swapping. |
| **Terminal Structural Trace** | $O(N)$ | $O(1)$ | Sequential scan traversing the modified character array to log the mirrored string onto the console stream. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and run this module natively within your localized workspace environment:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your workstation.
* **JDK / SDK** properly assigned and active within active module definitions.

### 2. Execution Pipeline via IntelliJ
1. Load your repository source directory folder directly inside **IntelliJ IDEA**.
2. Verify system configurations trace the correct JDK setup via `File > Project Structure > Project > SDK`.
3. Open the target `.java` file layout from the Project explorer pane navigation.
4. Right-click inside the active file code editor tab and select **Run 'Main.main()'** (or trigger compilation via `Shift + F10`).

### 3. Verification & Runtime Flow
Upon booting, the driver pipes the raw character array directly into the dual-pointer execution framework. The system mirrors the distinct character fields symmetrically inside the memory block. Finally, it prints the structurally reversed array footprint into the IntelliJ console tab to confirm absolute indexing alignment.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**