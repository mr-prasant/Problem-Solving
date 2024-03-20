/*
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        int rem = b-a+1;

        while (a-- > 1) head = head.next;

        ListNode tail = head;
        while (rem-- > 0) tail = tail.next;

        ListNode temp = list2;
        while (temp.next != null) temp = temp.next;
        
        temp.next = tail.next;
        head.next = list2;

        return list1;
    }
}