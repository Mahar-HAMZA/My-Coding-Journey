# 🔗 Array Optimization: Single Number Detection via Frequency Hashing

An enterprise-grade documentation for an **Array Processing** algorithm implemented in Java, focusing on isolating the **Single Number** (the unique element that appears exactly once while all other elements repeat twice) using an optimized Hash Map architecture.

---

## 📐 Algorithmic Strategy & Frequency Filtering

Locating a non-repeated unique element within a contiguous data block can easily lead to a structural trade-off. A brute-force nested loop approach results in an inefficient quadratic $O(N^2)$ runtime boundary due to repeated comparisons.

### The Linear Hash Mapping Strategy ($O(N)$ Time, $O(N)$ Space):
This system achieves high throughput by converting linear data streams into deterministic frequency tables:
1. **Dynamic Density Mapping:** The core algorithm processes the primitive integer array sequentially in a single directional pass. Each element is mapped as an identifier key inside a Hash Map, and its corresponding configuration frequency increments dynamically with each recurrence.
2. **Deterministic Lookup Sweep:** After compiling the mapping distribution layer, a second fast scan iterates through the array elements to look up their assigned values from the memory table.
3. **Isolation Filter:** The system instantly terminates and returns the active identity frame the moment it detects a key mapped to an evaluation count of exactly `1`, cleanly capturing the unique single number.

---

## 🛠️ System Architecture & Stack

The codebase layout strictly complies with modular Object-Oriented Programming (OOP) clean-code paradigms, separating analytical computation engines from application runtime entry frames:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Algorithmic Analytics Engine (`Main` Processing Utility):** Houses the static verification method (`singleElement`). Manages memory tables, coordinates hash distribution arrays, and ensures linear lookup complexity via Java's native `java.util.HashMap` API wrappers.
* **Execution Driver (`Main` Class Entry Point):** The primary host managing the runtime execution lifecycle thread. It instantiates the target integer sequences, channels data into the parsing matrix, and outputs the result to the console window.

---

## 📊 Complexity Analysis Matrix

| Core Computational Routing | Time Complexity | Space Complexity | Execution Performance Vector |
| :--- | :--- | :--- | :--- |
| **Frequency Density Composition** | $O(N)$ | $O(N)$ | High Performance Optimization; substitutes nested traversal loops with linear-time key hashing tables. |
| **Unique Key Lookup Sweep** | $O(N)$ | $O(1)$ | Sequential lookup sweep verifying active reference boundaries inside the memory map. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, build, and run this module natively within your localized workspace directory:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your computer.
* **JDK / SDK** paths properly assigned within global execution modules.

### 2. Execution Pipeline via IntelliJ
1. Load your source project repository folder directly inside **IntelliJ IDEA**.
2. Verify SDK paths match your workstation setup parameters via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` source component file from the Project explorer navigation view.
4. Right-click within the class scope container pane and choose **Run 'Main.main()'** (or press the shortcut `Shift + F10`).

### 3. Verification & Runtime Flow
Upon boot, the program feeds the pre-defined target array directly into the linear hashing engine. The system builds the analytical frequency map, parses the identity bounds inside the IntelliJ console window, filters out the duplicate pairs, and logs the single unique element safely onto stdout.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**