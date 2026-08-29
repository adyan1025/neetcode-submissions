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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;
        while (curr != null) {
            //saves next position fo later
            nxt = curr.next;

            //reverses the pointer
            curr.next = prev;
            
            //previous goes up 1
            prev = curr;

            //current goes up 1
            curr = nxt;
        }

        return prev;
    }
}
