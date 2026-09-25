# Minimum Window Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two strings `s` and `t` of lengths `m` and `n` respectively, return  *the  **minimum window***   ***substring**  **of  *`s`*  such that every character in  *`t`*  (** including duplicates**) is included in the window *. If there is no such substring, return* the empty string *`""`.

The testcases will be generated such that the answer is  **unique**.

 

 **Example 1:** 

```
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

```

 **Example 2:** 

```
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.

```

 **Example 3:** 

```
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

```

 

 **Constraints:** 

- m == s.length
- n == t.length
- 1 <= m, n <= 105
- s and t consist of uppercase and lowercase English letters.

 

 **Follow up:**  Could you find an algorithm that runs in `O(m + n)` time?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.70%)  
**Memory:** 45.1 MB (beats 98.49%)  
**Submitted:** 2026-09-25T16:31:43.347Z  

```java
class Solution {
    public String minWindow(String s, String t) {
        int [] need = new int[128];

        for(char c : t.toCharArray()){
            need[c]++;
        }

        int left=0; 
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            if(need[c]>0){
                count--;
            }
            need[c]--;

            while(count == 0){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }

                char leftc = s.charAt(left);
                need[leftc]++;

                if(need[leftc]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?"": s.substring(start,start+minLen);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-window-substring/)