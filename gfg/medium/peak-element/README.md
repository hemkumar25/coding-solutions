# Peak in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

 **Note:**  Consider the element before the first element and the element after the last element to be negative infinity.

**Examples :
**

```
Input: arr = [1, 2, 4, 5, 7, 8, 3]
Output: true
Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
```

```
Input: arr = [10, 20, 15, 2, 23, 90, 80]
Output: true
Explanation: Element 20 at index 1 is a peak since 10 < 20 > 15. Index 5 (value 90) is also a peak, but returning any one peak index is valid.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:43:56.226Z  

```java
class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        int start = 0 ;
        int end = n-1;
        
        while(start<end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/peak-element/1)