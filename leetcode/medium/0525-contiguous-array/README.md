# Contiguous Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary array `nums`, return  *the maximum length of a contiguous subarray with an equal number of* `0` *and* `1`.

 

 **Example 1:** 

```
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

```

 **Example 2:** 

```
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

```

 **Example 3:** 

```
Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 53.80%)  
**Memory:** 65.8 MB (beats 8.86%)  
**Submitted:** 2026-10-05T15:23:23.349Z  

```java
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        int prefixSum = 0;
        int maxLength = 0;

        for(int i =0 ; i<nums.length; i++){
            if(nums[i]== 0 ){
                prefixSum--;
            }else{
                prefixSum++;
            }

            if(map.containsKey(prefixSum)){
                int length = i- map.get(prefixSum);

                maxLength = Math.max(maxLength, length);
            }else{
                map.put(prefixSum, i );
            }
        }
        return maxLength;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contiguous-array/)