Intuition
1.The primary intuition behind reversing a singly linked list is to change the direction of the pointers.

2.In a forward singly linked list, each node points to the next node in the list.

3.When reversed, each node should instead point to the previous node.

Approach
1.Initialize Pointers:

i.We start by initializing two pointers: prev and current.
ii.prev is initially set to null to mark the end of the reversed list.
iii.current is set to the head of the original list.

2.Iterative Reversal:

i.We traverse the original list one node at a time, starting from the head.
ii.For each node current, we reverse its pointer to point to its previous node (prev) instead of its next node.
iii.After reversing the pointer, we move both prev and current one step forward.

3.Return the New Head:

i.At the end of the traversal, prev will be pointing to the last node of the original list, which becomes the new head of the reversed list.
ii.We return prev as the head of the reversed list.

Complexity
Time complexity:
Space complexity:
Code
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev; 
            prev = current; 
            current = nextNode; 
        }
        return prev; 
    }
}
