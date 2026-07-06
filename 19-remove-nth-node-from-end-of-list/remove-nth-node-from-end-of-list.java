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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int x = size+1-n;
        if(x == 1) return head.next;

        ListNode prev = new ListNode();

        temp = head;
        int c = 1;
        while(temp.next!=null){
            if(c==x){
                prev.next = temp.next;
                temp.next = null;
                return head;
            }
            prev = temp;
            if(c+1 == x && x == size){
                temp = null;
                prev.next = null;
                return head;
            }
            temp = temp.next;
            c++;
        }

        return head;
    }
}