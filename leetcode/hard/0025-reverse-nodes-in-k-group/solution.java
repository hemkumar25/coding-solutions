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
        
            ListNode kth = prevGroupEnd;

            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) {
                    return dummy.next;
                }
            }

            ListNode nextGroupStart = kth.next;

        
            ListNode prev = nextGroupStart;
            ListNode curr = prevGroupEnd.next;

            while (curr != nextGroupStart) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

          
            ListNode oldGroupStart = prevGroupEnd.next;
            prevGroupEnd.next = kth;
            prevGroupEnd = oldGroupStart;
        }
    }
}