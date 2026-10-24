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