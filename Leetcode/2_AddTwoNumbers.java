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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int c = 0;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while (a != null && b != null) {
            temp.next = new ListNode((a.val + b.val + c) % 10);
            c = (a.val + b.val + c) / 10;
            a = a.next;
            b = b.next;
            temp = temp.next;
        }
        while (a != null) {
            temp.next = new ListNode((a.val + c) % 10);
            c = (a.val + c) / 10;
            a = a.next;
            temp = temp.next;
        }
        while (b != null) {
            temp.next = new ListNode((b.val + c) % 10);
            c = (b.val + c) / 10;
            b = b.next;
            temp = temp.next;
        }
        if (c != 0) {
            temp.next = new ListNode(c);
        }
        ans = ans.next;
        return ans;
    }
}