# Non Repeating Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of lowercase English Letters. return the first non-repeating character in  **s**. If there is no non-repeating character, return  **'$'**.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
```

```
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
```

```
Input: s = "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:52:23.625Z  

```java
class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map <Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(int i= 0; i < s.length(); i++){
            char ch= s.charAt(i);
            
            if(map.get(ch)==1){
                return ch;
            }
        }
        return '$';
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1)