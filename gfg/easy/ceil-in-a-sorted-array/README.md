# Ceil in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]**  (which may contain duplicate elements) and an integer  **x**, find the 0-based index of the first element greater than or equal to x. This element is called the  **ceil**  of x.

If no such element exists, return -1.

 **Note:**  If multiple occurrences of the ceil exist, return the index of its first occurrence.

 **Examples:** 

```
Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 5
Output: 2
Explanation: Smallest number greater than 5 is 8, whose index is 2.
```

```
Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 20
Output: -1
Explanation: No element greater than 20 is found. So output is -1.
```

```
Input: arr[] = [1, 1, 2, 8, 10, 11, 12, 19], x = 0
Output: 0
Explanation: Smallest number greater than 0 is 1, whose indices are 0 and 1. The index of the first occurrence is 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T14:07:22.522Z  

```java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int start = 0;
        int end = n-1;
        
        while(start<end){
            int mid = start + (end - start)/2;
            
            if(arr[mid]<x){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        
        return arr[end]<x?-1:end;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1)