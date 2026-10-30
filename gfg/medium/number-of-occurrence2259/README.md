# Count Occurrences in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]** and a number  **target**, find the number of occurrences of target in given array. 

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.
```

```
Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.

```

```
Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T13:53:25.246Z  

```java


class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count =0;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1)