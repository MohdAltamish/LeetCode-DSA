# 940. Distinct Subsequences II

**Difficulty:** Hard  
**URL:** [Distinct Subsequences II](https://leetcode.com/problems/distinct-subsequences-ii/)
**Solved in:** 15m 59s

| Metric | Value | Beats |
|--------|-------|-------|
| Runtime | 2 ms | 100% |
| Memory  | 43.1 MB | 90.43% |

---

## Problem

Given a string s, return _the number of **distinct non-empty subsequences** of_ `s`. Since the answer may be very large, return it **modulo** `109 + 7`.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not.
 

Example 1:

```
Input: s = "abc"
Output: 7
Explanation: The 7 distinct subsequences are "a", "b", "c", "ab", "ac", "bc", and "abc".
```

Example 2:

```
Input: s = "aba"
Output: 6
Explanation: The 6 distinct subsequences are "a", "b", "ab", "aa", "ba", and "aba".
```

Example 3:

```
Input: s = "aaa"
Output: 3
Explanation: The 3 distinct subsequences are "a", "aa" and "aaa".
```

 

**Constraints:**

	- `1 <= s.length <= 2000`

	- `s` consists of lowercase English letters.