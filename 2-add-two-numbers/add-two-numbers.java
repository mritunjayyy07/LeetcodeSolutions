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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode start = null;
        ListNode tail = null;

        while(l1 != null || l2 != null)
        {
            int f = l1!=null ? l1.val:0;
            int s = l2!=null ? l2.val:0;
            int sum = f+s+carry;
            int singlesum = sum%10;
             carry = sum/10;
             ListNode node = new ListNode (singlesum);
             if(start == null)
             {
                start = tail = node;
             }
             else
             {
                tail.next = node;
                tail = node;
             }
             if(l1 != null){
                l1 = l1.next;
             }

             if(l2 != null){
                l2 = l2.next;
             }
        }
        if(carry > 0)
        tail.next = new ListNode (carry);
        return start;
        
        
    }
}