# 🔗 Backtracking Engine: Combinatorial Power Set & Subset Generation

An enterprise-grade documentation for a **Combinatorial Power Set Generation Engine** implemented in Java, evaluating decision trees through state-space backtracking and recursive state undoing.

---

## 📐 Algorithmic Strategy & State-Space Backtracking

Generating all distinct sub-collections (Power Set) from a unique integer stream requires traversing an $N$-level binary decision tree. Rather than allocating redundant intermediate data frames, this implementation leverages **Combinatorial Backtracking** to dynamically explore and prune execution paths.

### The Include/Exclude Decision Tree ($O(N \cdot 2^N)$ Time, $O(N)$ Space):
1. **Binary Choice Branching:** At each structural level indexed by `index`, the algorithm branches into two operational paths for the candidate element (`arr[index]`):
    * **Exclude Path:** Recursively advances to `index + 1` without modifying the active candidate buffer (`ans`).
    * **Include Path:** Pushes `arr[index]` into `ans`, advances to `index + 1` to process down-stream decisions, and subsequently **backtracks** (`ans.remove(ans.size() - 1)`) to restore state balance for parallel branches.
2. **Base Boundary Evaluation:** When `index` reaches array capacity ($\text{index} == \text{Length}$), the algorithm takes a deep snapshot copy (`new ArrayList<>(ans)`) of the active subset buffer and appends it to the global collection matrix (`finalList`).
3. **State Unwinding:** The backtrack step guarantees $O(N)$ auxiliary stack usage by continuously reusing a single dynamic buffer across all $2^N$ combinatorial branch explorations.

---

## 🛠️ System Architecture & Stack

The programmatic infrastructure complies with clean Object-Oriented Programming (OOP) paradigms, separating data generation pipelines from runtime application drivers:

* **Language:** Java
* **Development Tool:** IntelliJ IDEA
* **Software Development Kit:** JDK / Java SDK (Version 8 and above compatible)

### Component Decomposition:
* **Subset Engine Core (`Main` Processing Logic):** Contains the primary static recursive evaluation routine (`subSets`). It controls boundary checks, element state pushes, state-space backtracking, and collection cloning.
* **Driver Runtime (`Main` Entry Point):** The primary orchestration host managing the execution lifecycle thread (`main` method) to instantiate target integer inputs, initialize storage matrices, and output the generated power set to stdout.

---

## 📊 Complexity Analysis Matrix

| Operational Metric | Complexity | Performance Characterization |
| :--- | :--- | :--- |
| **Total Time Complexity** | $O(N \cdot 2^N)$ | Generates $2^N$ distinct subsets, requiring $O(N)$ time per base boundary to copy state buffer into output arrays. |
| **Auxiliary Stack Space** | $O(N)$ | Maximum recursion tree depth matches array length $N$, ensuring tight memory consumption bounds. |
| **Output Space Capacity** | $O(N \cdot 2^N)$ | Total space required to store the aggregated power set output matrix. |

---

## 🚀 Environment Setup & Compilation inside IntelliJ IDEA

To configure, compile, and execute this module natively within your localized workspace environment:

### 1. Prerequisites
* **IntelliJ IDEA** (Community or Ultimate Edition) active on your workstation.
* **JDK / SDK** properly assigned within global project settings.

### 2. Execution Pipeline via IntelliJ
1. Load your repository source directory folder inside **IntelliJ IDEA**.
2. Verify SDK configurations via `File > Project Structure > Project > SDK`.
3. Open the `Main.java` source file component from the Project explorer pane navigation.
4. Right-click inside the active code editor tab and select **Run 'Main.main()'** (or press `Shift + F10`).

### 3. Verification & Runtime Output
Upon invocation, the system processes the input array through the binary decision tree. It dynamically backtracks through candidate combinations, constructs the complete power set without index duplication, and prints the generated collection list to stdout.

---
👨‍💻 Maintained with 🧠 by **Hamza Chief**