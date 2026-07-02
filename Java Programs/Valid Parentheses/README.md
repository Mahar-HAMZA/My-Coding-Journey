# 🔤 Valid Parenthesis

This repository contains the Stack-based solution for the popular **"Valid Parentheses"** LeetCode problem in Java.

## 📝 Problem Description
Given a string containing only brackets **( ) [ ] { }**, determine if the input string is **valid**.
A string is valid if every opening bracket is closed by the **correct closing bracket** in the correct order.

## 💡 Example
- Input: "([)]{}"`
- Output: Invalid Parenthesis! ❌

- Input: "()[]{}"
- Output: Valid Parenthesis! ✅

## 🚀 Solution Approach
1. Traverse the string character by character
2. If **opening bracket** → push onto Stack
3. If **closing bracket** → check Stack top for matching opening bracket
4. If match → pop from Stack, if no match → Invalid
5. At end if Stack is **empty** → Valid, else → Invalid

- **Time Complexity:** O(n) — Single traversal of string
- **Space Complexity:** O(n) — Stack stores opening brackets

## 🔧 Tech Stack & Author
- **Developer:** Muhammad Hamza
- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub