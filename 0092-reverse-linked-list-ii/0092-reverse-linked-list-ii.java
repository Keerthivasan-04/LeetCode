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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       
        if (head == null) {
            return null;
        }
        
        
        ListNode dummy = new ListNode(-1); 
        dummy.next = head;
        ListNode prev_left = dummy;
        
        for (int i = 1; i < left; i++) {
            prev_left = prev_left.next;
        }
        
        ListNode curr = prev_left.next;
        ListNode next = null;
        ListNode prev = null;
        
        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
 
        prev_left.next.next = curr; 
        prev_left.next = prev; 
        
        return dummy.next; 
    }
}
