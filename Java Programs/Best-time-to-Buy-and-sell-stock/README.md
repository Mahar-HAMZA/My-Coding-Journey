# Best Time to Buy and Sell Stock

This repository contains an optimized Java solution for the LeetCode problem **"Best Time to Buy and Sell Stock"**.

## 📝 Problem Description
You are given an array `arr` where `arr[i]` is the price of a given stock on the $i^{th}$ day.
You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.

Return *the maximum profit you can achieve*. If you cannot achieve any profit, return `0`.

## 🚀 Solution Approach (Single Pass)
The code uses an efficient approach to find the maximum profit in a single loop:
* **`first` Variable:** Tracks the minimum buying price encountered so far (initialized with `arr[0]`).
* **`newProfit` Variable:** Calculates the profit for the current day's price minus the minimum buying price (`arr[i] - first`).
* **Time Complexity:** $O(n)$ — Loop runs only once through the array, making it highly optimized.
* **Space Complexity:** $O(1)$ — No extra memory or data structures used.

## 🛠️ Tech Stack & Author
* **Developer:** Muhammad Hamza
* **Language:** Java
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub
*
