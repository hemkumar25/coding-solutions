# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 95 ms (beats 9.23%)  
**Memory:** 47.9 MB (beats 37.48%)  
**Submitted:** 2026-09-22T15:58:05.838Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int left=0;

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);

            while(map.get(c)>1){
                char leftc = s.charAt(left);
                map.put(leftc, map.get(leftc)-1);

                if(map.get(leftc)==0){
                    map.remove(leftc);
                }

                left++;
            }

            int tempLen = right -left+1;
            len = Math.max(len, tempLen);

        }
        return len;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)