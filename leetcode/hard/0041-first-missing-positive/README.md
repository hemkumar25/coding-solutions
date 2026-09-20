# First Missing Positive

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an unsorted integer array `nums`. Return the  *smallest positive integer*  that is  *not present*  in `nums`.

You must implement an algorithm that runs in `O(n)` time and uses `O(1)` auxiliary space.

 

 **Example 1:** 

```
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

```

 **Example 2:** 

```
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

```

 **Example 3:** 

```
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -231 <= nums[i] <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 20.74%)  
**Memory:** 74 MB (beats 23.94%)  
**Submitted:** 2026-09-20T07:29:06.192Z  

```java
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ansExpected =1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<ansExpected){
                continue;
            }
           else if(ansExpected==nums[i] ){
                ansExpected++;
           }
           else if(nums[i]>ansExpected){
                return ansExpected;
           }
        }
        return ansExpected;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/first-missing-positive/)