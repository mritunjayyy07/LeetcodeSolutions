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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        return head;
        ListNode prev = head;
        ListNode next = head.next;
        while(next != null)
        {
           if(prev.val == next.val)
           {
            prev.next=next.next;
            next= next.next;
           }
           else
           {
            prev = prev.next;
            next= next.next;
           }
           

        }
        return head;
    }
}