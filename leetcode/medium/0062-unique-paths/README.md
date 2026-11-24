# Unique Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is a robot on an `m x n` grid. The robot is initially located at the  **top-left corner**  (i.e., `grid[0][0]`). The robot tries to move to the  **bottom-right corner**  (i.e., `grid[m - 1][n - 1]`). The robot can only move either down or right at any point in time.

Given the two integers `m` and `n`, return  *the number of possible unique paths that the robot can take to reach the bottom-right corner*.

The test cases are generated so that the answer will be less than or equal to `2 * 109`.

 

Original
Java
 **Example 1:** 

```
Input: m = 3, n = 7
Output: 28

```

 **Example 2:** 

```
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

```

 

 **Constraints:** 

- 1 <= m, n <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.3 MB  
**Submitted:** 2026-11-24T15:30:01.194Z  

```java
class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        return solve(m-1,n-1,dp);

    }

    public int solve(int m, int n,int[][] dp){
        if(n==0 && m == 0){
            return 1;
        }

        if(n<0 || m<0 ){
            return 0;
        }

        if(dp[m][n]!=0){
            return dp[m][n];
        }

        int up = solve(m-1,n,dp);
        int down = solve(m,n-1,dp);

        return dp[m][n] = up + down;       
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/unique-paths/)