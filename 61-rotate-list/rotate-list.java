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

        if(head==null)return head ;
      int len =0 ;
      
       ListNode temp=head ;
      while(temp!=null)
      {
        len++ ;
        temp=temp .next ;
      }

      int times = k%len ;
   
   if(times==0)
    {
        return head ;
    }

       int count =0;


       ListNode ref = head ;
       ListNode curr = head ;
       ListNode prev = null ;
      
      
       while(count<times)
       {
        while(curr!=null && curr.next!=null)
        {
           prev = curr ;
           curr = curr.next ;

        }
        curr.next=ref ;
        prev.next=null;
        ref= curr ;
        count++ ;

        prev= null ;
        curr=ref ;
       }
       return ref ;
    }
}