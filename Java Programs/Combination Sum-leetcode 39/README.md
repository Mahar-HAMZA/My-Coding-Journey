# 🧩 Combination Sum - Backtracking Algorithm in Java

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![IDE](https://img.shields.io/badge/IDE-IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Algorithm](https://img.shields.io/badge/Algorithm-Backtracking_/_DFS-007ACC?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📌 Problem Overview

The **Combination Sum** problem is a classic algorithmic challenge that requires finding all unique candidate combinations that sum up to a specific target integer.

### Key Rules & Constraints
* **Unlimited Reuse**: Elements in the candidate array can be selected multiple times.
* **Uniqueness**: Combinations are considered unique if the frequency of selected numbers varies.
* **Order Independent**: Resulting combinations can be outputted in any order.

---

## 🛠️ Technology Stack & Environment

| Component | Specification |
| :--- | :--- |
| **Language** | Java (JDK 8 or higher) |
| **IDE / Code Editor** | IntelliJ IDEA |
| **Development Paradigm** | Object-Oriented Programming (OOP) & Recursion |
| **Developer** | **Hamza Chief** |

---

## 🚀 Algorithmic Strategy: Depth-First Search (DFS) & Backtracking

The program constructs a dynamic **Decision State-Space Tree** to evaluate candidates systematically:

```text
                     [Target = 7, Sum = 0]
                       /       \        \
                 +2   /   +3    \   +7   \
                     v           v        v
              [Sum = 2]     [Sum = 3]   [Sum = 7]  --> ✅ Match Found! Output: [7]
               /     \
         +2   /       \  +3
             v         v
        [Sum = 4]    [Sum = 5]
          /            ...
    +3   /
        v
   [Sum = 7]  --> ✅ Match Found! Output: [2, 2, 3]