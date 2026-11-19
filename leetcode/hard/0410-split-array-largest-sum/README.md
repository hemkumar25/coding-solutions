# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is  **minimized**.

Return  *the minimized largest sum of the split*.

A  **subarray**  is a contiguous part of the array.

 

Original
Java
 **Example 1:** 

```
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 106
- 1 <= k <= min(50, nums.length)

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 34.20%)  
**Memory:** 42.3 MB (beats 95.56%)  
**Submitted:** 2026-11-19T14:55:59.746Z  

```java
class Solution {
    public int splitArray(int[] nums, int k) {

        if(k==1) {
            int sum =0;
            for(int num : nums){
                sum += num;
            }
            return sum;
        }
        int low = 0;
        int high = 0;

        for(int num: nums){
            low = Math.max(low, num);
            high += num;
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            int count = 1;
            int sum =0;

            for(int num : nums){
                if(sum + num<= mid){
                    sum +=num;
                }else{
                    count++;
                    sum =num;
                }

            }

            
                if(count <= k){
                    high = mid-1;
                }else{
                    low = mid+1;
                }

        }
        return low;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/split-array-largest-sum/)