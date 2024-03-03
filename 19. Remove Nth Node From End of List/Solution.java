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
        int len = 0; // length
        for (ListNode node = head; node != null; node = node.next) len++;

        // if have to remove the first element
        if (len-n == 0) return head.next;

        ListNode node = head;
        for (int i = 0; i < (len-n-1); i++) node = node.next;

        node.next = node.next.next;
        return head;
    }
}