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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;

        for (ListNode node = head; node != null; node = node.next)
        n++;

        int el = n/k;
        int rem = n%k;
        ListNode[] nodes = new ListNode[k];

        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            int tel = el;
            nodes[i] = curr;

            while (tel-- > 0 && curr != null) {
                prev = curr;
                curr = curr.next;
            }

            if (rem > 0 && curr != null) {
                prev = curr;
                curr = curr.next;
                rem--;
            } 

            if (prev != null)
            prev.next = null;
        }

        return nodes;
    }
}