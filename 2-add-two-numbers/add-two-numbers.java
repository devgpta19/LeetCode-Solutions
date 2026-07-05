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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {

        ListNode resultHead = new ListNode(-1);
        ListNode curr = resultHead;
        int carry = 0;

        ListNode t1 = head1;
        ListNode t2 = head2;
        while (t1 != null || t2 != null){

            int sum = carry;

            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }

            ListNode newNode = new ListNode(sum%10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;
        }

        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }

        return resultHead.next;
    }
}