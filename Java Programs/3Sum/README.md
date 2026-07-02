# 3Sum Problem (Triplets with Target Sum)

An optimal and space-efficient Java solution for the classic **3Sum** problem using the **Sorting** and **Two-Pointer** approach.

---

## 📝 Problem Description

Given an integer array `arr`, the goal is to find all unique triplets `[arr[i], arr[left], arr[right]]` such that their sum equals a given `target` (in this case, `0`), where `i != left != right`.

The solution must handle duplicates efficiently so that no identical triplets are printed or returned in the final output.

### Example
- **Input:** `arr = [-2, 0, 0, 2, 2]`, `target = 0`
- **Output:** `-2 0 2`
- **Explanation:** The sum of `-2 + 0 + 2 = 0`. Even though the array contains duplicate elements, the algorithm ensures that the unique triplet is outputted exactly once.

---

## 🛠️ Algorithm & Approach

The problem is solved in $O(N^2)$ time complexity by transforming it into a series of Two-Sum problems using two pointers:

1. **Sorting the Array:** First, the array is sorted in ascending order. This allows us to use the two-pointer technique and makes it incredibly easy to skip duplicate elements.
2. **Fixing the First Element (`i`):** We iterate through the array using a loop. If the current element is identical to the previous one (`arr[i] == arr[i-1]`), we skip it to prevent duplicate triplets.
3. **Two-Pointer Search (`left` & `right`):**
    - For every unique element at index `i`, we set two pointers: `left = i + 1` and `right = arr.length - 1`.
    - If the `sum` (`arr[i] + arr[left] + arr[right]`) equals the `target`, a valid triplet is found and recorded.
    - To avoid duplicate combinations, both `left` and `right` pointers are immediately advanced inside `while` loops past any repeating numbers.
    - If the `sum` is greater than the target, we decrement `right` to reduce the total sum.
    - If the `sum` is less than the target, we increment `left` to increase the total sum.

---

## 📊 Complexity Analysis

- **Time Complexity:** $O(N^2)$
    - Sorting the array takes $O(N \log N)$ time.
    - The nested loop structure runs a two-pointer search for each element, taking $O(N \log N) + O(N^2)$, which simplifies to a total runtime of $O(N^2)$ where $N$ is the length of the array.

- **Space Complexity:** $O(1)$ (Constant Extra Space)
    - The algorithm processes the input entirely in-place. No additional data structures (like maps or sets) are utilized to eliminate duplicates, making it highly memory-efficient.

---

## ⚙️ Requirements
- Java Development Kit (JDK) 8 or higher.