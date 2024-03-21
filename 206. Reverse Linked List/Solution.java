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
    public ListNode addNode(ListNode head, ListNode node) {
        if (head == null) return node;

        node.next = head;
        return node;
    }
    public ListNode reverseList(ListNode head) {
        ListNode thead = null;

        while (head != null) {
            thead = addNode(thead, new ListNode(head.val));
            head = head.next;
        }

        return thead;
    }
}