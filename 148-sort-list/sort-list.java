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
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode midNode = getMid(head);

        ListNode left = head;
        ListNode right = midNode.next;

        midNode.next = null;

        ListNode leftSorted = sortList(left);
        ListNode rightSorted = sortList(right);

        return merge(leftSorted, rightSorted);

    }

     private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode leftSorted, ListNode rightSorted){

        ListNode mergedNode = new ListNode(0);
        ListNode temp = mergedNode;

        while(leftSorted!=null && rightSorted!=null){
            if (leftSorted.val < rightSorted.val) {
                temp.next = leftSorted;
                leftSorted = leftSorted.next;
            }else{
                temp.next = rightSorted;
                rightSorted = rightSorted.next;
            }
            temp = temp.next;
        }

        if(leftSorted!=null)
        temp.next = leftSorted;
        else
        temp.next = rightSorted;
        

        return mergedNode.next;
    }
}