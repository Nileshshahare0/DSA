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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            if(slow == fast){
                if(fast == head){
                    return slow;
                }
                slow = head;
                while(slow.next != fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.next;
            }else{
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return null;
    }
}