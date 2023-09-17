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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prev=null;
        ListNode left=head,right=head;
          if(left.next==null||left==null)
              return null;
        while(right!=null&&right.next!=null){
             prev=left;
             left=left.next;
             right=right.next.next;
             

        }

        if(left!=null)
        prev.next=left.next;
                
        return head;
        
    }
}