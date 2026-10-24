# Reverse Nodes in Even Length Groups

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a linked list.

The nodes in the linked list are  **sequentially**  assigned to  **non-empty**  groups whose lengths form the sequence of the natural numbers (`1, 2, 3, 4,...`). The  **length**  of a group is the number of nodes assigned to it. In other words,

- The 1st node is assigned to the first group.
- The 2nd and the 3rd nodes are assigned to the second group.
- The 4th, 5th, and 6th nodes are assigned to the third group, and so on.

Note that the length of the last group may be less than or equal to `1 + the length of the second to last group`.

 **Reverse**  the nodes in each group with an  **even**  length, and return  *the*  `head`  *of the modified linked list*.

 

 **Example 1:** 

```
Input: head = [5,2,6,3,9,1,7,3,8,4]
Output: [5,6,2,3,9,1,4,8,3,7]
Explanation:
- The length of the first group is 1, which is odd, hence no reversal occurs.
- The length of the second group is 2, which is even, hence the nodes are reversed.
- The length of the third group is 3, which is odd, hence no reversal occurs.
- The length of the last group is 4, which is even, hence the nodes are reversed.

```

 **Example 2:** 

```
Input: head = [1,1,0,6]
Output: [1,0,1,6]
Explanation:
- The length of the first group is 1. No reversal occurs.
- The length of the second group is 2. The nodes are reversed.
- The length of the last group is 1. No reversal occurs.

```

 **Example 3:** 

```
Input: head = [1,1,0,6,5]
Output: [1,0,1,5,6]
Explanation:
- The length of the first group is 1. No reversal occurs.
- The length of the second group is 2. The nodes are reversed.
- The length of the last group is 2. The nodes are reversed.

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 105

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 47.79%)  
**Memory:** 197 MB (beats 91.51%)  
**Submitted:** 2026-10-24T15:05:18.256Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;
        int groupSize = 1;

        while (groupPrev.next != null) {
            ListNode groupStart = groupPrev.next;
            ListNode curr = groupStart;
            int count = 0;

            // Find the actual length of this group
            while (count < groupSize && curr != null) {
                curr = curr.next;
                count++;
            }

            // curr is now the first node of the next group
            ListNode nextGroupStart = curr;

            if (count % 2 == 0) {
                // Reverse the even-length group
                ListNode prev = nextGroupStart;
                curr = groupStart;

                for (int i = 0; i < count; i++) {
                    ListNode next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                // Connect the reversed group
                groupPrev.next = prev;
                groupPrev = groupStart;
            } else {
                // Skip the odd-length group
                for (int i = 0; i < count; i++) {
                    groupPrev = groupPrev.next;
                }
            }

            groupSize++;
        }

        return dummy.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-nodes-in-even-length-groups/)