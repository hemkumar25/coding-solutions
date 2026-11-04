# Square Root

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n,**  find the square root of n. If n is not a perfect square, then return the floor value.

Floor value of any number is the greatest Integer which is less than or equal to that number.

 **Examples:** 

```
Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.

```

```
Input: n = 11
Output: 3
Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.
```

```
Input: n = 1
Output: 1
Explanation: 1 is a perfect square, so its square root is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T10:14:47.328Z  

```java
class Solution {
    int floorSqrt(int n) {
        // code here
        int start = 0 ;
        int end = n;
        int ans = 0;
        
        while(start<=end){
            int mid = start + (end -start)/2;
            if((long)mid*mid <= n){
                ans = mid;
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/square-root/1)