# 🔤 First Non Repeating Character

This repository contains the HashMap frequency solution for finding the First Non Repeating Character in a string in Java.

## 📝 Problem Description
Given a **string**, find the **first character** that does not repeat anywhere in the string.

## 💡 Example
- Input: "aabbcdef"
- Output: First Non Repeating Character: c

## 🚀 Solution Approach
1. Traverse string and store **frequency** of each character in HashMap
2. Traverse string again and check which character has **frequency == 1**
3. Print that character and return

- **Time Complexity:** O(n) — Two traversals of string
- **Space Complexity:** O(n) — HashMap stores character frequencies

## 🔧 Tech Stack & Author
- **Developer:** Muhammad Hamza
- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub