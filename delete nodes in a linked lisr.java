Intuition
1.Given Node: Let's say we are given the node node that needs to be deleted.

2.Next Node: We have access to node.next, which is the node immediately following node.

3.Copy Value: Instead of removing node directly, we copy the value of node.next into node. Now node contains the value of node.next.

4.Bypass Next Node: We then change the next pointer of node to point to node.next.next, effectively bypassing the original node.next.

Approach
1.While Loop: The loop continues as long as there is a next node.

2.Copy Value: In each iteration, the value of the next node is copied to the current node.

3.Check for Last Node: If the next node is the last node (node.next.next == null), we set node.next to null to remove the last node from the list.

4.Move to Next Node: If the next node is not the last node, we move to the next node and continue the process.

Complexity
Time complexity:
Space complexity:
Code
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public void deleteNode(ListNode node) 
    {
       while (node.next != null) 
       {
            node.val = node.next.val;   
            if (node.next.next == null) 
            {
                node.next = null;
            } 
            else 
            {
                node = node.next;
            }
        }
    }
}
