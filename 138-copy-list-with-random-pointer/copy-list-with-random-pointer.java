class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Node temp = head;

        // Step 1: Insert copy nodes
        while (temp != null) {
            Node newnode = new Node(temp.val);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = newnode.next;
        }

        // Step 2: Assign random pointers
        temp = head;
        while (temp != null) {
            Node copynode = temp.next;
            if (temp.random != null) {
                copynode.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // Step 3: Separate the lists
        Node curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;

        while (curr != null) {
            Node copy = curr.next;

            copyCurr.next = copy;
            copyCurr = copy;

            curr.next = copy.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}