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
    public ListNode partition(ListNode head, int x) {
        ListNode smallList = smallerThenX(head, x); 
        ListNode largerList = largerThenX(head, x); 
        
        if (smallList == null) return largerList;
        
        ListNode temp = smallList; 
        while(temp.next != null){ 
            System.out.println(temp.val); 
            temp = temp.next; 
        } 
        temp.next = largerList; 
        return smallList; 
    } 

    private ListNode smallerThenX(ListNode head, int x){ 
        ListNode temp = head; 
        ListNode smallList = new ListNode(0); 
        ListNode smallListNode = smallList; 
        
        while(temp != null){ 
            if(temp.val < x){ 
                smallListNode.next = new ListNode(temp.val); 
                smallListNode = smallListNode.next; 
            } 
            temp = temp.next; 
        } 
        return smallList.next; 
    }

    private ListNode largerThenX(ListNode head, int x){
        ListNode temp = head;
        ListNode largeList = new ListNode(0);
        ListNode largeListNode = largeList;
        
        while(temp != null){
            if(temp.val >= x){ 
                largeListNode.next = new ListNode(temp.val);
                largeListNode = largeListNode.next;
            }
            temp = temp.next;
        }
        return largeList.next;
    }
}