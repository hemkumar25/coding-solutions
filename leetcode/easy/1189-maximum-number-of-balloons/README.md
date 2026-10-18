# Maximum Number of Balloons

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `text`, you want to use the characters of `text` to form as many instances of the word  **"balloon"**  as possible.

You can use each character in `text`  **at most once**. Return the maximum number of instances that can be formed.

 

 **Example 1:** 

```
Input: text = "nlaebolko"
Output: 1

```

 **Example 2:** 

```
Input: text = "loonbalxballpoon"
Output: 2

```

 **Example 3:** 

```
Input: text = "leetcode"
Output: 0

```

 

 **Constraints:** 

- 1 <= text.length <= 104
- text consists of lower case English letters only.

 

 **Note:**  This question is the same as 2287: Rearrange Characters to Make Target String.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 96.11%)  
**Memory:** 42.7 MB (beats 99.10%)  
**Submitted:** 2026-10-18T17:01:48.060Z  

```java
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2;
        int o = freq['o' - 'a'] / 2;
        int n = freq['n' - 'a'];

        return Math.min(
            Math.min(b, a),
            Math.min(Math.min(l, o), n)
        );
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-balloons/)