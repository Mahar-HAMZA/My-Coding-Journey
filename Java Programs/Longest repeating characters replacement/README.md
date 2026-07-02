# Longest Repeating Character Replacement

A clean and efficient Java implementation to find the length of the longest substring containing the same letter after replacing at most `k` characters. This solution utilizes the optimized **Sliding Window (Two-Pointer)** technique.

---

## 📝 Problem Statement

Given a string `s` consisting of uppercase English letters and an integer `k`, you can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

The objective is to return the length of the longest substring containing the same letter you can get after performing the above operations.

### Example
- **Input:** `s = "AABAB"`, `k = 1`
- **Output:** `4`
- **Explanation:** Replace the 'B' at index 2 with 'A' to get "AAAAB". The longest repeating substring has a length of 4.

---

## 🛠️ Algorithm & Approach

The problem is solved using an optimal **Sliding Window** approach with two pointers (`left` and `right`):

1. **Expanding the Window:** The `right` pointer moves forward, expanding the window and updating the frequency of the current character in a fixed-size array.
2. **Tracking Maximum Frequency:** We maintain a `maxfrequent` variable to keep track of the count of the most frequent character inside the current window.
3. **Valid Window Condition:** A window is valid if the number of characters that need to be replaced is less than or equal to `k`. This is represented by the formula:
   > $\text{Window Length} - \text{maxfrequent} \le k$
4. **Shrinking the Window:** If the condition is violated (i.e., we need more than `k` replacements), we decrement the frequency of the character at the `left` pointer and increment `left` to shrink the window until it becomes valid again.
5. **Result:** The maximum window size achieved during the iteration is our answer.

---

## 📊 Complexity Analysis

- **Time Complexity:** $O(N)$
    - Both the `right` and `left` pointers traverse the string of length $N$ at most once. Hence, the time complexity scales linearly with the input size.

- **Space Complexity:** $O(1)$ (Constant Space)
    - The algorithm uses a fixed-size integer array of size 26 to store the frequencies of uppercase English letters. The space utilized does not grow with the size of the input string.

---

## ⚙️ Requirements
- Java Development Kit (JDK) 8 or higher.