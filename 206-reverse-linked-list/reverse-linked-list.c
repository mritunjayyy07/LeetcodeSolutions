/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
       struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    while (curr != NULL) {
        struct ListNode* nextNode = curr->next; 
        curr->next = prev; 
        prev = curr; 
        curr = nextNode; 
    }
    return prev;
    }
    
