# 21. Merge Two Sorted Lists

**Difficulty:** Easy  
**URL:** [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
**Solved in:** 3m 30s

| Metric | Value | Beats |
|--------|-------|-------|
| Runtime | 0 ms | 100% |
| Memory  | 44.2 MB | 74.67% |

---

## Problem

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Return _the head of the merged linked list_.

 

Example 1:

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

Example 2:

```
Input: list1 = [], list2 = []
Output: []
```

Example 3:

```
Input: list1 = [], list2 = [0]
Output: [0]
```

 

**Constraints:**

	- The number of nodes in both lists is in the range `[0, 50]`.

	- `-100 <= Node.val <= 100`

	- Both `list1` and `list2` are sorted in **non-decreasing** order.