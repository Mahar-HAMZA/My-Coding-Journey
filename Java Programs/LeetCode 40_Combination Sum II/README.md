# 🧩 Combination Sum II - Unique Combinations Algorithm in Java

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![IDE](https://img.shields.io/badge/IDE-IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Algorithm](https://img.shields.io/badge/Algorithm-Backtracking_/_DFS-007ACC?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📌 Problem Overview

The **Combination Sum II** problem is an advanced variant of the classic Combination Sum challenge. Given a collection of candidate numbers (`candidates`) that may contain **duplicates**, find all **unique combinations** where the candidate numbers sum to `target`.

### Key Rules & Constraints
* **Single Use**: Each number in `candidates` may only be used **once** in the combination.
* **No Duplicate Combinations**: The solution set must not contain duplicate combinations.
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

## 🚀 Algorithmic Strategy: Sorting & Backtracking with Pruning

The algorithm handles duplicates and single-use constraints efficiently through **Pre-Sorting** and **Tree Pruning**:

```text
                     [Target = 8, Sorted Array = [1, 1, 2, 5, 6, 7, 10]]
                                        / 
                                  +1   /  
                                      v   
                                 [Sum = 1]
                                 /       \
                           +1   /         \   +2
                               v           v
                          [Sum = 2]     [Sum = 3]
                            /             ...
                      +6   / 
                          v   
                     [Sum = 8]  --> ✅ Match Found! Output: [1, 1, 6]