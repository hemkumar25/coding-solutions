# Single Element in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return  *the single element that appears only once*.

Your solution must run in `O(log n)` time and `O(1)` space.

 

 **Example 1:** 

```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,3,7,7,10,11,11]
Output: 10

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 24.60%)  
**Memory:** 52.7 MB (beats 76.71%)  
**Submitted:** 2026-09-14T08:47:12.930Z  

```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-element-in-a-sorted-array/)