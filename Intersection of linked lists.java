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
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
       ListNode thA = headA;
       int flag = 0;
       while(thA != null)
       {
        ListNode thB = headB;
        while(thB != null)
        {
            if(thA == thB)
            {
                flag=1;
                return thA;
            }
            thB = thB.next;
        }
        thA = thA.next;
       }
       if(flag == 0)
       {
        return null;
       }
       return headA;
    }
}
