# Search in Rotated Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of  **distinct** elements, which was initially  **sorted in ascending order**  but then  **rotated**  at some unknown pivot, the task is to find the index of a target  **key**.  If the key is not present in the array, return  **-1**.

 **Examples :** 

```
Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
```

```
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.

```

```
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T15:37:25.802Z  

```java
class Solution {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int start = 0; 
        int end = n-1;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == key){
                return mid;
            }
            else if (arr[start]<=arr[mid]){
                if(arr[start]<=key && key<= arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]<=key && key <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1)