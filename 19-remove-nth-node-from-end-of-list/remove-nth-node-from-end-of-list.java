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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = findlen( head );
         int res = len-n;
         if(res==0)
         {
            ListNode newhead = head.next ;
            return newhead ;
         }
         ListNode temp = head ;
         int count =0 ;
         while(temp!=null)
         {
            res--;
            if(res==0)
            {
                break;
            }
            temp=temp.next ;

         }
         temp.next=temp.next.next ;
         return head ;
        
    } 
        public int findlen(ListNode head)
        {
            int count =0 ;
            ListNode temp = head ;
            while(temp!=null)
            {
                count++;
                temp = temp.next ;
            }
            return count ;

        }


        

    
}