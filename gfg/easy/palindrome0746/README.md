# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`. Your task is to find if it is a palindrome.

 **Examples:** 

```
Input: n = 555
Output: true
Explanation: The number 555 reads the same backward as forward, so it is a palindrome.
```

```
Input: n = 123
Output: false
Explanation: The number 123 reads differently backward (321), so it is not a palindrome.
```

```
Input: n = -121
Output: true
Explanation: if number is palindrome, mainly ignore sign.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T14:50:17.133Z  

```java
class Solution {
    public boolean isPalindrome(int n) {
        // code here
        return n == reverse(n,0);
    }
    
    public int reverse(int n,int rev){
        if(n == 0){
            return rev;
        }
        
         int temp = n%10;
         rev = rev*10 + temp;
         
         return reverse(n/10, rev);
         
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome0746/1)