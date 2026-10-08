# Is Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` *if* `s` *is a  **subsequence**  of* `t` *, or* `false` *otherwise*.

A  **subsequence**  of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

 

 **Example 1:** 

```
Input: s = "abc", t = "ahbgdc"
Output: true

```

 **Example 2:** 

```
Input: s = "axc", t = "ahbgdc"
Output: false

```

 

 **Constraints:** 

- 0 <= s.length <= 100
- 0 <= t.length <= 104
- s and t consist only of lowercase English letters.

 

 **Follow up:**  Suppose there are lots of incoming `s`, say `s1, s2,..., sk` where `k >= 109`, and you want to check one by one to see if `t` has its subsequence. In this scenario, how would you change your code?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.78%)  
**Memory:** 42.9 MB (beats 27.76%)  
**Submitted:** 2026-10-08T06:46:02.728Z  

```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            boolean found = false;

            for(; j<t.length(); j++){
                if(s.charAt(i)==t.charAt(j)){
                    found = true;
                    j++;
                    break;
                    
                }
            }

            if(found == false){
                return false;
            }

        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/is-subsequence/)