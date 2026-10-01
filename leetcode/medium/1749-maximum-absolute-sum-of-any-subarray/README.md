# Maximum Absolute Sum of Any Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`. The  **absolute sum**  of a subarray `[numsl, numsl+1,..., numsr-1, numsr]` is `abs(numsl + numsl+1 +... + numsr-1 + numsr)`.

Return  *the  **maximum**  absolute sum of any  **(possibly empty)**  subarray of* `nums`.

Note that `abs(x)` is defined as follows:

- If x is a negative integer, then abs(x) = -x.
- If x is a non-negative integer, then abs(x) = x.

 

 **Example 1:** 

```
Input: nums = [1,-3,2,3,-4]
Output: 5
Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.

```

 **Example 2:** 

```
Input: nums = [2,-5,1,-4,3,-2]
Output: 8
Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 74.61%)  
**Memory:** 67.1 MB (beats 13.51%)  
**Submitted:** 2026-10-01T15:12:56.091Z  

```java
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        int minSum = nums[0];
        int currMin = nums[0];

        for(int i =1; i<nums.length; i++){
            int x =  nums[i];
            currSum = Math.max(x, currSum + x );
            maxSum = Math.max(currSum, maxSum);

            currMin = Math.min(x,currMin + x);
            minSum =Math.min(currMin, minSum);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/)