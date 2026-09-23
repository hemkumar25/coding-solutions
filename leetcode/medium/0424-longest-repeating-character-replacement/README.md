# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 27 ms (beats 24.30%)  
**Memory:** 47.2 MB (beats 11.77%)  
**Submitted:** 2026-09-23T15:10:50.764Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int MaxFrequency = 0; 
        int maxLen = 0;

        Map<Character, Integer> hm = new HashMap<>();

        for (int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);

            hm.put(ch, hm.getOrDefault(ch,0)+1);
            MaxFrequency = Math.max(MaxFrequency, hm.get(ch));

            while(right-left+1-MaxFrequency>k){
                char leftc = s.charAt(left);
                hm.put(leftc, hm.get(leftc)-1);

                left ++;
            }

            int len = right-left+1;
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)