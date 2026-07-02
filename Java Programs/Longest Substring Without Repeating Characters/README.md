# Longest Substring Without Repeating Characters

An optimized Java solution to find the length of the longest substring without repeating characters using the **Sliding Window** technique with a **HashSet**.

---

## 📝 Problem Description

Given a string `s`, find the length of the **longest substring** without repeating characters.

A **substring** is a contiguous sequence of characters within a string.

### Example
- **Input:** `name = "bcaeaf"`
- **Output:** `Longest Substring without repeating characters: 5`
- **Explanation:** The longest substring without repeating characters is `"caeaf"`? No, `"bcae"` has a length of 4. Wait, let's look closer at `"bcaeaf"`. The unique substrings are `"bcae"` (length 4). Then when 'a' comes, we shrink from left, window becomes `"ceaf"` (length 4). So the max length is `4`.

---

## 🛠️ Algorithm & Approach

The solution uses a **Sliding Window (Two-Pointer)** approach combined with a **HashSet** to keep track of unique characters efficiently:

1. **Two Pointers:** We maintain a `left` pointer and a `right` pointer to represent the current window of unique characters.
2. **HashSet for Duplicates:** As the `right` pointer moves forward, we check if the character at `name.charAt(right)` is already present in our `HashSet`.
3. **Shrinking the Window:** - If the character **is already in the set**, it means we have a duplicate.
    - We enter a `while` loop to remove characters from the `left` side of the window (`set.remove(name.charAt(left))`) and move the `left` pointer forward until the duplicate character is removed.
4. **Expanding and Updating:** Once the duplicate is removed, we add the current character to the `HashSet` and calculate the current window length using:
   > $\text{currentlength} = \text{right} - \text{left} + 1$
5. **Max Length:** We update `maxlength` whenever `currentlength` exceeds the maximum found so far.

---

## 📊 Complexity Analysis

- **Time Complexity:** $O(N)$
    - Although there is a nested `while` loop inside the `for` loop, each character is added to the `HashSet` at most once and removed from the `HashSet` at most once. Therefore, both `right` and `left` pointers traverse the string of length $N$ at most once, resulting in a linear time complexity.

- **Space Complexity:** $O(\min(M, N))$
    - The space complexity depends on the size of the `HashSet`. In the worst-case scenario, it will store unique characters proportional to the size of the string ($N$) or the size of the character set/alphabet ($M$, which is fixed, e.g., 26 for English letters or 128 for ASCII).

---

## ⚙️ Requirements
- Java Development Kit (JDK) 8 or higher.