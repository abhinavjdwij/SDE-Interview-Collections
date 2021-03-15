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
    private int getLen(ListNode x) {
        ListNode temp = x;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        int len = getLen(head);
        if (len == 0) { return head; }
        k %= len;
        k = (len-k) % len;
        if (k == 0) { return head; }
        ListNode pivot = head;
        ListNode prev = null;
        while (k-- > 0) {
            prev = pivot;
            pivot = pivot.next;
        }
        if (prev != null) { prev.next = null; }
        ListNode temp1 = pivot;
        ListNode temp2 = null;
        while (temp1 != null) {
            temp2 = temp1;
            temp1 = temp1.next;
        }
        if (temp2 != null) { temp2.next = head; }
        return pivot;
    }
}