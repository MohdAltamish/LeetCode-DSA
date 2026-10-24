# 507. Perfect Number

**Difficulty:** Easy  
**URL:** [Perfect Number](https://leetcode.com/problems/perfect-number/)
**Solved in:** 4m 39s

| Metric | Value | Beats |
|--------|-------|-------|
| Runtime | 2135 ms | 6.19% |
| Memory  | 42.1 MB | 55.51% |

---

## Problem

A **perfect number** is a **positive integer** that is equal to the sum of its **positive divisors**, excluding the number itself. A **divisor** of an integer `x` is an integer that can divide `x` evenly.

Given an integer `n`, return `true`_ if _`n`_ is a perfect number, otherwise return _`false`.

 

Example 1:

```
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
```

Example 2:

```
Input: num = 7
Output: false
```

 

**Constraints:**

	- `1 <= num <= 108`