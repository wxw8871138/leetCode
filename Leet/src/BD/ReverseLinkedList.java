package BD;

import java.util.List;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if(head == null||head.next==null){
            return head;
        }
        ListNode newHead = ReverseList(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }
}
