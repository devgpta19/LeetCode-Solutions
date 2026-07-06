class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode evenList = new ListNode(-1);
        ListNode oddList = new ListNode(-1);
        ListNode etemp = evenList;
        ListNode otemp = oddList;
        ListNode temp = head;
        
        int c = 1;
        while (temp != null) {
            if (c % 2 == 0) {
                etemp.next = temp;
                etemp = etemp.next;
            } else {
                otemp.next = temp;
                otemp = otemp.next;
            }
            temp = temp.next;
            c++;
        }

        etemp.next = null;
        otemp.next = evenList.next;

        return oddList.next;
    }
}