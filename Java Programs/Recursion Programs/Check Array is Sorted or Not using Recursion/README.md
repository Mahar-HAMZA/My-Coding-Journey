# 🔗 Recursive Verification: Sequential Array Sorting Engine

An enterprise-grade documentation for a **Linear Recursion Sorting Validation** algorithm implemented in Java, evaluating sequential data structures through continuous call-stack frame analysis.

---

## 📐 Algorithmic Strategy & Recursive Call-Stack Topology

Verifying whether an array sequence maintains non-decreasing structural order can be trivially achieved via an iterative loop. However, utilizing **Linear Tail Recursion** breaks down the problem into atomic sub-problems, verifying neighbor boundaries via call-stack unwinding while preserving functional immutability.

### The Recursive Stack Decomposition ($O(N)$ Time, $O(N)$ Space):
1. **Empty / Single-Element Guard:** The engine first evaluates edge-case scenarios where array lengths are $\le 1$. If true, structural sorting is trivially validated without allocating stack frames.
2. **Terminal Base Boundary:** The recursion terminates successfully when the tracking pointer (`index`) reaches the last element ($\text{Length} - 1$). This confirms that every preceding adjacent pair satisfied the sorted condition.
3. **Inversion Detection (Pruning):** At each frame, the system compares `arr[index]` against `arr[index + 1]`. If an inversion is detected ($\text{Current} > \text{Next}$), the execution immediately short-circuits and returns `false`, preventing unnecessary stack allocations.
4. **Sequential Unwinding:** If the current adjacent pair is valid, the function passes execution to the next frame via `ArrayCheck(arr, index + 1)`, systematically processing the array from left to right.

---

## 🛠️ System Architecture & Stack

The programmatic architecture strictly follows clean-code principles, isolating recursive validation logic from driver execution pipelines:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Array Verification Core (`Main` Processing Engine):** Contains the primary static recursive evaluation pipeline (`ArrayCheck`). It manages boundary constraints, index checking, and call-stack frame progression.
* **Driver Runtime (`Main` Entry Point):** The primary orchestration host managing the execution thread (`main` method) to instantiate sample static integer arrays and log the resulting boolean evaluation onto stdout.

---

## 📊 Complexity Analysis Matrix

| Core Execution Route | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Recursive Sequential Scan** | $O(N)$ | $O(N)$ | **Optimal Linear Verification;** visits each element at most once. Auxiliary memory usage accounts for $N$ recursive call-stack frames during deep evaluation. |
| **Iterative Alternative (Refinement)** | $O(N)$ | $O(1)$ | Potential future optimization to reduce memory footprints to constant space by replacing call-stack frames with simple loops. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and execute this module natively within your localized workspace environment:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your system.
* **JDK / SDK** properly configured in system module settings.

### 2. Execution Pipeline via IntelliJ
1. Open your repository source directory folder inside **IntelliJ IDEA**.
2. Verify the project SDK configuration via `File > Project Structure > Project > SDK`.
3. Navigate to and open the `Main.java` source file from the Project explorer pane.
4. Right-click inside the active code editor tab and select **Run 'Main.main()'** (or press `Shift + F10`).

### 3. Runtime Output
Upon execution, the driver pipes the test array into the recursive engine. The function processes each element sequentially, evaluates call-stack boundaries, and prints `true` or `false` on the console terminal to confirm structural sorting integrity.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**