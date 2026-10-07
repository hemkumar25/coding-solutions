# Merge Intervals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return  *an array of the non-overlapping intervals that cover all the intervals in the input*.

 

 **Example 1:** 

```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

```

 **Example 2:** 

```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

```

 **Example 3:** 

```
Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.

```

 

 **Constraints:** 

- 1 <= intervals.length <= 104
- intervals[i].length == 2
- 0 <= starti <= endi <= 104

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 89.38%)  
**Memory:** 49.1 MB (beats 42.80%)  
**Submitted:** 2026-10-07T04:59:00.675Z  

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i<intervals.length; i++){
            int currentStart =  intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart <= end){
                end = Math.max(end, currentEnd);
            }else{
                result.add(new int [] {start,end});

                start = currentStart;
                end = currentEnd;
            }
        }
         result.add(new int[]{start, end});

         return result.toArray(new int[result.size()][]);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-intervals/)