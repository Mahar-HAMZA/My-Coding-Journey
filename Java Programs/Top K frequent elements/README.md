# 📊 Top K Frequent Elements

A professional and optimized solution documentation for the classic problem **"Top K Frequent Elements"**, designed for Java implementations utilizing HashMap and List Sorting techniques.

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in **any order**.

### 📥 Examples
* **Example 1:**
    * **Input:** `nums = [1,1,1,2,2,3]`, `k = 2`
    * **Output:** `[1,2]`
* **Example 2:**
    * **Input:** `nums = [1]`, `k = 1`
    * **Output:** `[1]`

---

## 💡 Algorithm & Intuition

The approach focuses on mapping element frequencies and extracting the highest-ranking elements based on counts.

1. **Frequency Mapping:** Use a `HashMap<Integer, Integer>` to iterate through the array and store the frequency of each element (`element -> count`).
2. **Entry List Conversion:** Convert the map's entry set into an `ArrayList` of `Map.Entry` pairs to enable customized sorting.
3. **Descending Sort:** Sort the list using a custom comparator based on values (`frequencies`) in descending order, ensuring the most frequent elements move to the top.
4. **Extraction:** Retrieve and display the keys of the first `k` entries from the sorted list.

---

## 📊 Complexity Analysis

| Metric | Complexity | Description |
| :--- | :--- | :--- |
| **Time Complexity** | **$O(N \log N)$** | Where $N$ is the number of unique elements, due to sorting the entry list. |
| **Space Complexity** | **$O(N)$** | Auxiliary space utilized by the HashMap and the ArrayList to store element frequencies. |

---

## 🛠️ Environment & Technical Specifications

* **Language:** Java (JDK 17+)
* **IDE/Tool:** IntelliJ IDEA
* **Domain:** Data Structures & Algorithms (DSA)
* **Category:** Hashing & Sorting

---
Developed with 🚀 by **Hamza Chief**