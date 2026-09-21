# Longest Substring with K Uniques

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**  consisting only lowercase alphabets and an integer  **k**. Your task is to find the  **length** of the  **longest substring**  that contains exactly  **k**  distinct characters.

 **Note :**  If no such substring exists, return  **-1**. 

 **Examples:** 

```
Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

```

```
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.

```

```
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T14:24:29.310Z  

```java
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        
        for(int right=0; right<s.length();right++){
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            
            while(hm.size()>k){
                char c = s.charAt(left);
                hm.put(c, hm.get(c)-1);
                
                if(hm.get(c)==0){
                    hm.remove(c);
                }
                left++;
            }
            
            if(hm.size()==k){
                int len = right-left+1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen == 0? -1:maxLen;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)