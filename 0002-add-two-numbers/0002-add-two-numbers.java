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
    ListNode rev(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
         ListNode ans=null;
         ListNode temp=null;
         int carry=0;
         while(h1!=null&&h2!=null)
         {
            if(ans==null)
            {
           int sum=h1.val+h2.val+carry;
           int rem=sum%10;
           System.out.print(rem);
            ans=new ListNode(rem);
            temp=ans;
            carry=sum/10;

            }
           else
           {
            int sum=h1.val+h2.val+carry;
            int rem=sum%10;
             System.out.print(rem);
            ListNode x=new ListNode(rem);
            temp.next=x;
            temp=x;
            carry=sum/10;
           }
           h1=h1.next;
           h2=h2.next;
         }
        // return ans;

         while(h1!=null)
         {
           int sum=h1.val+carry;
        int rem=sum%10;
           ListNode x=new ListNode(rem);
           temp.next=x;
           temp=x;
           carry=sum/10;
           h1=h1.next;
         }
         while(h2!=null)
         {
           int sum=h2.val+carry;
           int rem=sum%10;
           ListNode x=new ListNode(rem);
           temp.next=x;
           temp=x;
           carry=sum/10;
           h2=h2.next;
         }
         if(carry!=0)
         {
             ListNode x=new ListNode(carry);
             temp.next=x;
              temp=x;
         }
        
         return ans;
          
         

    }
}