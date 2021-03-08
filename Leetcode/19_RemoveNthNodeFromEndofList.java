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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        assert(head != null && n >= 1);
        ListNode nAhead = head;
        for (int i = 0; i < n-1; i++) {
            assert(nAhead != null); // at least n nodes
            nAhead = nAhead.next;
        }
        if (nAhead.next == null) {
            return head.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (nAhead.next != null) {
            prev = curr;
            curr = curr.next;
            nAhead = nAhead.next;
        }
        prev.next = curr.next;
        return head;
    }
}