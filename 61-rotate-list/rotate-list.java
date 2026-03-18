class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int count = 1;

        
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        
        

        k = k % count;
        if (k == 0) return head;
        temp.next = head;

        ListNode tail = head;

       
        for (int i = 0; i < (count - k -1); i++) {
            tail = tail.next;
        }

        ListNode newhead = tail.next;
        tail.next = null;

        return newhead;
    }
}