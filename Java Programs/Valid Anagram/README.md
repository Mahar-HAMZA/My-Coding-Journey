# 🔤 Valid Anagram

This repository contains the HashMap frequency solution for checking whether two strings are Valid Anagrams in Java.

## 📝 Problem Description
Given two strings, check whether they are **anagrams** of each other.
Two strings are anagrams if they contain the **same characters** with the **same frequency**.

## 💡 Example
- Input: s1 = "anagram", s2 = "nagaram"
- Output: Valid Anagram! ✅

- Input: s1 = "rat", s2 = "car"
- Output: Not an Anagram! ❌

## 🚀 Solution Approach
1. Store frequency of each character of **first string** in HashMap
2. Traverse **second string** and decrease frequency of each character
3. If any character is **missing** or frequency becomes **invalid** → Not an Anagram

- **Time Complexity:** O(n) — Single traversal of both strings
- **Space Complexity:** O(n) — HashMap stores character frequencies

## 🔧 Tech Stack & Author
- **Developer:** Muhammad Hamza
- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub