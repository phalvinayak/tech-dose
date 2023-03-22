# 215\. Kth Largest Element in an Array

**_Medium_** | [Leetcode](https://leetcode.com/problems/kth-largest-element-in-an-array/)

Given an integer array `nums` and an integer `k`, return _the_ `k<sup>th</sup>` _largest element in the array_.

Note that it is the `k<sup>th</sup>` largest element in the sorted order, not the `k<sup>th</sup>` distinct element.

You must solve it in `O(n)` time complexity.

**Example 1:**

**Input:** nums = \[3,2,1,5,6,4\], k = 2
**Output:** 5

**Example 2:**

**Input:** nums = \[3,2,3,1,2,4,5,5,6\], k = 4
**Output:** 4

**Constraints:**

- `1 <= k <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`