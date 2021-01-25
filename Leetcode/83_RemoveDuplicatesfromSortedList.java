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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l = head;
        ListNode r = head;
        while (r != null) {
            if (l.val != r.val) {
                l.next = r;
                l = l.next;
            }
            r = r.next;
        }
        if (l != null) {
            l.next = null;
        }
        return head;
    }
}