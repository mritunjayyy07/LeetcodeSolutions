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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode temp = head;
        int len = 0;
        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
        temp = head;
        int pow = len-1;
        while(temp != null)
        {
            if(temp.val == 1){
            num = num + (int)Math.pow(2,pow);
            }
            pow -- ;
            temp = temp.next;
            
        
        
        }
        return num;
        
    }
}