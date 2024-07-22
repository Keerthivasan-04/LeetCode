/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            {
                return slow;
            }
        }
        return null;
    }


    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode s1 = head;
        
        ListNode s2 = hasCycle(head);

        if(s2 == null){
            return null;
        }
    
        while(s1 != s2){
            s1 = s1.next;
            s2 = s2.next; 
        }
        return s1;
    }
}
