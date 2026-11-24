# Climbing Stairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

 

Original
Java
 **Example 1:** 

```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

```

 **Example 2:** 

```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

```

 

 **Constraints:** 

- 1 <= n <= 45

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.6 MB (beats 71.96%)  
**Submitted:** 2026-11-24T15:03:44.596Z  

```java
class Solution {
    public int climbStairs(int n) {
       int [] dp = new int[n+1];
       return solve (n,dp);
    }

    public int solve(int n, int[] dp){
        if(n<=2){
            return n;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/climbing-stairs/)