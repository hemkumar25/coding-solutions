# Max Consecutive Ones III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums` and an integer `k`, return  *the maximum number of consecutive* `1` *'s in the array if you can flip at most*  `k` `0`'s.

 

 **Example 1:** 

```
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

 **Example 2:** 

```
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.
- 0 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-24T15:36:44.294Z  

```java
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int maxLen = 0;
        int zeroes = 0;

        for(int right=0; right<nums.length; right++){
           if(nums[right]==0) zeroes++;   
            while(zeroes> k){
                if(nums[left]==0) zeroes--;
                left++;
            }

            int len = right - left +1 ;
            maxLen = Math.max(len, maxLen);     
        }
        
        return maxLen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones-iii/)