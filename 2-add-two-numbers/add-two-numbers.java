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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode ans = null;
      ListNode tail = ans;
      ListNode temp1 = l1;
      ListNode temp2 = l2;
      int carry = 0;
      while(carry != 0 || temp1 != null || temp2 != null){
        int num1 = 0;
        if(temp1 != null){
           num1 = temp1.val;
           temp1 = temp1.next;
        }else{
            num1 = 0;
        }
        int num2 = 0;
        if(temp2 != null){
           num2 = temp2.val;
           temp2 = temp2.next;
        }else{
            num2 = 0;
        }
        int sum = num1 + num2 + carry;
        carry = sum/10;
        ListNode newNode = new ListNode(sum%10);

        if(ans == null){
            ans = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;      
        }
      }
      return ans;
    }
}