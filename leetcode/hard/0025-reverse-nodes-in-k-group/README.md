# Reverse Nodes in k-Group

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given the `head` of a linked list, reverse the nodes of the list `k` at a time, and return  *the modified list*.

`k` is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of `k` then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

```

 

 **Constraints:** 

- The number of nodes in the list is n.
- 1 <= k <= n <= 5000
- 0 <= Node.val <= 1000

 

 **Follow-up:**  Can you solve the problem in `O(1)` extra memory space?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 33.90%)  
**Memory:** 45.8 MB (beats 95.29%)  
**Submitted:** 2026-10-23T15:21:52.682Z  

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
    public ListNode reverseKGroup(ListNode head, int k) {
         if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;

        while (true) {
            // Find the kth node of the current group
            ListNode kth = prevGroupEnd;

            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) {
                    return dummy.next;
                }
            }

            ListNode nextGroupStart = kth.next;

            // Reverse the current group
            ListNode prev = nextGroupStart;
            ListNode curr = prevGroupEnd.next;

            while (curr != nextGroupStart) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect the reversed group
            ListNode oldGroupStart = prevGroupEnd.next;
            prevGroupEnd.next = kth;
            prevGroupEnd = oldGroupStart;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-nodes-in-k-group/)