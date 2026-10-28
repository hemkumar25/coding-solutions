# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.4 MB (beats 98.56%)  
**Submitted:** 2026-10-28T13:47:20.319Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length-1;
        int startPosition = Position(nums,target,true);
        int endPosition = Position(nums,target,false);
        int [] result =  {startPosition, endPosition} ;

        return result;

    }

    public int Position(int [] arr, int target, boolean isFirst ){
        int  n = arr.length-1;
        int start = 0;
        int end = n;
        int result = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]== target){
                result =mid;

                if(isFirst){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                end = mid -1;
            }
        } 
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)