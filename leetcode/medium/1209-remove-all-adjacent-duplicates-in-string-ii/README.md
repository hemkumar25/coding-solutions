# Remove All Adjacent Duplicates in String II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`, a `k`  **duplicate removal**  consists of choosing `k` adjacent and equal letters from `s` and removing them, causing the left and the right side of the deleted substring to concatenate together.

We repeatedly make `k`  **duplicate removals**  on `s` until we no longer can.

Return  *the final string after all such duplicate removals have been made*. It is guaranteed that the answer is  **unique**.

 

 **Example 1:** 

```
Input: s = "abcd", k = 2
Output: "abcd"
Explanation: There's nothing to delete.
```

 **Example 2:** 

```
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
Explanation: 
First delete "eee" and "ccc", get "ddbbbdaa"
Then delete "bbb", get "dddaa"
Finally delete "ddd", get "aa"
```

 **Example 3:** 

```
Input: s = "pbbcggttciiippooaais", k = 2
Output: "ps"

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- 2 <= k <= 104
- s only contains lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 97.96%)  
**Memory:** 45.7 MB (beats 99.83%)  
**Submitted:** 2026-10-16T07:13:56.946Z  

```java
class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] chars = new char[n];
        int[] count = new int[n];

        int top= -1;
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(top>=0 && chars[top]==ch){
                top++;
                chars[top]=ch;
                count[top] = count[top-1]+1;
            }
            else{
                top++;
                chars[top]=ch;
                count[top] = 1; 
            }

            if(count[top]==k){
                top-=k;
            }
        }

        return new String(chars, 0 , top+1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/)