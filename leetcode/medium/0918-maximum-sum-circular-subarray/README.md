# Maximum Sum Circular Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a  **circular integer array**  `nums` of length `n`, return  *the maximum possible sum of a non-empty  **subarray**  of* `nums`.

A  **circular array**  means the end of the array connects to the beginning of the array. Formally, the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i]` is `nums[(i - 1 + n) % n]`.

A  **subarray**  may only include each element of the fixed buffer `nums` at most once. Formally, for a subarray `nums[i], nums[i + 1],..., nums[j]`, there does not exist `i <= k1`, `k2 <= j` with `k1 % n == k2 % n`.

 

 **Example 1:** 

```
Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.

```

 **Example 2:** 

```
Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

```

 **Example 3:** 

```
Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.78%)  
**Memory:** 51.1 MB (beats 40.89%)  
**Submitted:** 2026-10-02T13:52:36.249Z  

```java
class Solution {
    static{
        for(int i=0; i<400; i++)
            maxSubarraySumCircular(new int[]{1});
            }
    public static int  maxSubarraySumCircular(int[] nums) {
        int total = nums[0];
        int maxSum = nums[0];
        int currMax = nums[0];

        int minSum = nums[0];
        int currMin = nums[0];

        for(int i = 1 ; i< nums.length; i++){
           
            total +=  nums[i];

            currMax = Math.max( nums[i], currMax + nums[i]);
            maxSum = Math.max(currMax , maxSum);

            currMin = Math.min( nums[i], currMin +  nums[i]);
            minSum = Math.min(currMin, minSum);

            
        }

        if(maxSum<0){
            return maxSum;
        }

        return Math.max(maxSum,total - minSum);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-sum-circular-subarray/)