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

    public int len(ListNode head){

        ListNode curr = head;
        int c = 0;

        while(curr != null){
            curr = curr.next;
            c++;
        }
        return c;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        int l = len(head);

        if(l==n){
            head = head.next;
            return head;
        }

        ListNode temp = head;
        for(int i = 1;i < (l-n);i++){
            temp = temp.next;
        }
        if(temp.next!= null){
            temp.next = temp.next.next;
        }

        return head;
    }
}