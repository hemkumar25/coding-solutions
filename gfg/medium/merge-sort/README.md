# Merge Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: We get the sorted array after using merge sort

```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: We get the sorted array after using merge sort 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T16:04:44.985Z  

```java
class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){
            return;
        }
        
        int mid = l+ (r-l)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr,l,mid,r);
    }
    
    public void merge(int[] arr, int l, int mid, int r){
        int [] temp = new int[r-l+1];
        
        int i=l;
        int j=mid+1;
        int k =0;
        
        while(i<=mid && j<=r){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
                
                
            }else{
                temp[k++]= arr[j++];
            }
        }
        
        while(i<=mid){
            temp[k++] = arr[i++];
            
        }
        
        while(j<=r){
            temp[k++] = arr[j++];
        }
        
        for(int x = 0; x<temp.length; x++){
            arr[l+x] = temp[x];
            
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-sort/1)