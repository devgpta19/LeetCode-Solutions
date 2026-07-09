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
    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode temp = head;
        ListNode mid = getMid(temp);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        ListNode prev = null;
        while(right!=null){
            ListNode newNode = right.next;
            right.next = prev;
            prev = right;
            right = newNode;
        }

        while(prev != null){
            ListNode temp1 = left.next;
            ListNode temp2 = prev.next;

            left.next = prev;
            prev.next = temp1;

            left = temp1;
            prev = temp2;

        }

    }

    private ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}