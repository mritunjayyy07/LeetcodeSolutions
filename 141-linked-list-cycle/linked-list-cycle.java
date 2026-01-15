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
    public boolean hasCycle(ListNode head) {
        Set <ListNode> ls = new HashSet<>();
        ListNode curr = head;
        while(curr != null)
        {
            if(ls.contains(curr))
            return true;
            ls.add(curr);
            curr = curr.next;

        }
        return false;
        
    }
}