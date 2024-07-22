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
    public ListNode rotateRight(ListNode head, int k) {

       if(head == null || head.next == null){
        return head;
       }
       ListNode t1 = head;
       ListNode t2 = head;

       int c = 0;
       while(t1 != null){
        t1 = t1.next;
        c++;
       }

       k = k % c;
       if(k==0){
        return head;
       }

       t1 = head;
       while(k>0){
        t2 = t2.next;
        k--;
       }

       while(t2.next != null){
        t1 = t1.next;
        t2 = t2.next;
       }
       t2.next = head;
       head = t1.next;
       t1.next = null;

       return head;
        
    }
}