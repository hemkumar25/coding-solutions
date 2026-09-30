# Minimum Sum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**, find the sub-array containing at least one number which has the minimum sum and return its sum.

 **Examples :** 

```
Input: arr[] = [3,-4, 2,-3,-1, 7,-5]
Output: -6
Explanation: The subarray is [-4,2,-3,-1] = -6
```

```
Input: arr[] = [2, 6, 8, 1, 4]
Output: 1
Explanation: The subarray is [1] = 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:28:33.415Z  

```java
class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int currSum = arr[0];
        int minSum = arr[0];
        
        for(int i = 01; i<arr.length; i++){
            currSum = Math.min(arr[i],currSum+arr[i]);
            minSum = Math.min(currSum , minSum);
        }
        return minSum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1)