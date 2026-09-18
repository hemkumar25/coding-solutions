# Triplets with Smaller Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** of distinct integers and an integer  **sum**, count the number of unique triplets of elements whose sum is strictly less than sum. A triplet is identified only by the three elements it contains, so different permutations of the same three elements are counted as one triplet.

  Examples :  

```
Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 

```

```
Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
Output: 4
Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T07:59:52.486Z  

```java
class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int count = 0;
        
        for(int i=0; i<arr.length-2; i++){
            
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            
            int left = i+1;
            int right= arr.length-1;
            
            while(left<right){
                int currSum = arr[i]+ arr[left]+ arr[right];
                
                if (currSum<sum){
                    count+= right-left;
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1)