/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        HashSet<ListNode> sets = new HashSet<>();
        if(h1 == null || h2 == null)
        {
            return null;
        }
        while(h1 != null)
        {
            sets.add(h1);
            h1= h1.next;

        }
        while(h2 != null)
        {
            if(sets.contains(h2))
            return h2;
            else
            h2= h2.next;
        }
        return null;



        
    }
}