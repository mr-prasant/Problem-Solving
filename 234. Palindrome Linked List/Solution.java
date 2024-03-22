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

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode rev = null;

        while (fast != null && fast.next != null) {
            rev = new ListNode(slow.val, rev);

            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;

        while (slow != null) {
            if (slow.val != rev.val) return false;

            slow = slow.next;
            rev = rev.next;
        }

        return rev == null;
    }
}