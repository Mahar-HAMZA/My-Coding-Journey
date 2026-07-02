# Max Consecutive Ones

This repository contains an optimized Java solution for the popular DSA problem **"Max Consecutive Ones"**.

## 📝 Problem Description
Given a binary array `arr`, find the maximum number of consecutive `1`s in this array if any.

## 🚀 Solution Approach
The problem is solved using a single-pass optimized approach:
* **`newCount` Variable:** Tracks the current streak of consecutive `1`s.
* **`count` Variable:** Stores the maximum streak encountered so far.
* **Logic:** When a `0` is encountered, the current streak resets after updating the maximum count. If a `1` is encountered, the streak increases and updates `count` if it exceeds the previous maximum.
* **Time Complexity:** $O(n)$ — Single loop, highly efficient.
* **Space Complexity:** $O(1)$ — Constant space used.

## 🛠️ Tech Stack & Author
* **Developer:** Muhammad Hamza
* **Language:** Java
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub
*
