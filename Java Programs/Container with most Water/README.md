# Container With Most Water

An optimized Java solution for the classic **"Container With Most Water"** problem using the highly efficient **Two-Pointer** technique.

---

## 📝 Problem Description

Given `n` non-negative integers `arr` where each element represents a point at coordinate `(i, arr[i])`. `n` vertical lines are drawn such that the two endpoints of the line `i` are at `(i, arr[i])` and `(i, 0)`.

The goal is to find two lines that, together with the x-axis, form a container such that the container contains the most water.

> **Note:** You may not slant the container.

### Example
- **Input:** `arr = [1, 8, 6, 2, 5, 4, 8, 3, 7]`
- **Output:** `Area: 49`
- **Explanation:** The max area is formed between the lines at index 1 (height 8) and index 8 (height 7).
    - $\text{Width} = 8 - 1 = 7$
    - $\text{Height} = \min(8, 7) = 7$
    - $\text{Area} = 7 \times 7 = 49$

---

## 🛠️ Algorithm & Approach

The solution utilizes a **Two-Pointer** approach to achieve maximum efficiency:

1. **Initialization:** We place two pointers, `left` at the beginning of the array (index 0) and `right` at the end of the array (`arr.length - 1`).
2. **Area Calculation:** In every iteration, the area of water the current container can hold is calculated using the formula:
   > $\text{Area} = \text{Width} \times \text{Height}$
   > Where $\text{Width} = \text{right} - \text{left}$ and $\text{Height} = \min(\text{arr[left]}, \text{arr[right]})$
3. **Updating Maximum Area:** We maintain a running maximum (`newArea`) and update it whenever we find a larger area.
4. **Pointer Movement Strategy:** To maximize the area, we need to find taller lines. Since moving the pointers shrinks the width, we must try to increase the height. Therefore, we always move the pointer pointing to the **shorter line**:
    - If `arr[left] < arr[right]`, we do `left++`
    - Otherwise, we do `right--`

---

## 📊 Complexity Analysis

- **Time Complexity:** $O(N)$
    - The algorithm loops through the array using two pointers that meet in the middle. Each element is visited at most once, making the time complexity linear with respect to the array length $N$.

- **Space Complexity:** $O(1)$ (Constant Space)
    - The problem is solved in-place using only a few primitive integer variables (`left`, `right`, `width`, `height`, etc.) without allocating any extra memory structures.

---

## ⚙️ Requirements
- Java Development Kit (JDK) 8 or higher.