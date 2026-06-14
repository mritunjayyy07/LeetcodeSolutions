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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode temp = head;
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        
        while(temp != null) {
            lst.add(temp.val);
            temp = temp.next;
        }
        int j = lst.size()-1;
        int sum = 0;
        while(i <= j){
            sum = Math.max(sum,(lst.get(i)+lst.get(j)));
            i++;
            j--;
        }
        return sum;

        
        
        
    }
}