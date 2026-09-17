# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `target`.

Find three integers at  **distinct indices**  in `nums` such that the sum is  **closest**  to `target`.

Return the sum of the three integers.

You may assume that each input would have  **exactly**  one solution.

 

 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 98.30%)  
**Memory:** 45.5 MB (beats 49.71%)  
**Submitted:** 2026-09-17T07:50:36.943Z  

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        

        Arrays.sort(nums);

        int ans = 0;
        int closeness =Integer.MAX_VALUE;

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]== nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int  sum = nums[i]+ nums[left] + nums[right];

                int tempCloseness = Math.abs(sum - target);

                if(tempCloseness < closeness){
                    closeness= tempCloseness;
                    ans = sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)