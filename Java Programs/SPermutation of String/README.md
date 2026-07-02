# 🔀 Permutation in String

A high-performance and enterprise-grade documentation for the classic LeetCode problem **"Permutation in String"** (Permutation of String), designed for Java utilizing the optimized Sliding Window technique.

## 📝 Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

### 📥 Examples
* **Example 1:**
    * **Input:** `s1 = "ab"`, `s2 = "eidbaooo"`
    * **Output:** `true`
    * **Explanation:** `s2` contains one permutation of `s1` ("ba").
* **Example 2:**
    * **Input:** `s1 = "ab"`, `s2 = "eidboaoo"`
    * **Output:** `false`

---

## 💡 Algorithm & Intuition

The problem can be solved efficiently in linear time using a **Fixed-Size Sliding Window** approach combined with a Frequency Array.

1. **Length Constraint:** If `s1` is longer than `s2`, it is mathematically impossible for `s2` to contain a permutation of `s1`, so we return `false` instantly.
2. **Frequency Matching:** Create two frequency arrays (size 26) to track character counts for lower-case English alphabets.
3. **Initial Window:** Populate the frequency counts for `s1` and the first chunk of `s2` up to the length of `s1`. If they match immediately, return `true`.
4. **Sliding the Window:** Iteratively slide the window across `s2` one character at a time:
    * Include the new character entering the window from the right.
    * Discard the old character leaving the window from the left.
    * Perform an array equality check at each slide. If counts match, a permutation exists.

---

## 📊 Complexity Analysis

| Metric | Complexity | Description |
| :--- | :--- | :--- |
| **Time Complexity** | **$O(N)$** | Where $N$ is the length of string `s2`. The window passes through the string exactly once. |
| **Space Complexity** | **$O(1)$** | Fixed auxiliary space of size 26 for the frequency arrays, remaining constant regardless of input size. |

---

## 🛠️ Environment & Technical Specifications

* **Language:** Java (JDK 17+)
* **IDE/Tool:** IntelliJ IDEA
* **Domain:** Data Structures & Algorithms (DSA)
* **Category:** Two Pointers / Sliding Window

---
Developed with 🚀 by **Hamza Chief**