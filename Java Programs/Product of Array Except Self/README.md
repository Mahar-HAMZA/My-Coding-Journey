# Product of Array Except Self (Space Optimized)

A highly optimized Java solution for the **"Product of Array Except Self"** problem using the $O(1)$ extra space approach.

---

## 📝 Problem Description

Given an integer array `arr`, return an array `result` such that `result[i]` is equal to the product of all the elements of `arr` except `arr[i]`.

The solution must run in $O(N)$ time and without using the division operator.

### Example
- **Input:** `arr = [1, 2, 3, 4]`
- **Output:** `24 12 8 6`
- **Explanation:** - At index 0: $2 \times 3 \times 4 = 24$
    - At index 1: $1 \times 3 \times 4 = 12$
    - At index 2: $1 \times 2 \times 4 = 8$
    - At index 3: $1 \times 2 \times 3 = 6$

---

## 🛠️ Algorithm & Approach

Instead of allocating two separate arrays for Prefix and Suffix products, this solution optimizes memory by utilizing the output array itself to store the temporary values:

1. **Prefix (Left) Pass:** - We construct the prefix product directly inside the `result` array.
    - `result[0]` is set to `1`. For every subsequent element, `result[i] = result[i - 1] * arr[i - 1]`.
2. **Suffix (Right) Pass on the fly:** - We maintain a single integer variable `rightProduct` initialized to `1`.
    - We traverse the array backward (from right to left). In each step, we multiply the existing prefix product at `result[i]` with the `rightProduct`.
    - Then, we update `rightProduct` by multiplying it with `arr[i]` for the next iteration.

This allows us to get the final product array using only a single loop for the left pass and a single loop for the right pass, directly modifying the output container.

---

## 📊 Complexity Analysis

- **Time Complexity:** $O(N)$
    - The algorithm makes two independent passes over the array of size $N$ (one forward and one backward). Thus, the runtime scales linearly.

- **Space Complexity:** $O(1)$ (Constant Extra Space)
    - Excluding the `result` array which is required for the output, we only use a single primitive variable (`rightProduct`). No extra auxiliary arrays are created, making it memory optimal.

---

## ⚙️ Requirements
- Java Development Kit (JDK) 8 or higher.