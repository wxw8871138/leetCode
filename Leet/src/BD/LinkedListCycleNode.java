package BD;

public class LinkedListCycleNode {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode meetNode = null;
        while (fast!=null&&fast.next==null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                meetNode =  slow;
                break;
            }
        }
        if (meetNode==null){
            return null;
        }
        fast = head;
        while (fast!=meetNode){
            fast = fast.next;
            meetNode = meetNode.next;
        }
        return meetNode;
    }
}
