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
        if (head == null) { return null; }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        int count = 0;
        // check if atleast k nodes, reverse only in that case
        while (count < k) {
            if (curr == null) {
                return head;
            }
            count++;
            curr = curr.next;
        }
        count = 0;
        curr = head;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKGroup(next, k);
        return prev;
    }
}