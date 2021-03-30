package BD;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCircle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Map<ListNode, Integer> map = new HashMap<>();
        while (head != null) {
            if (map.containsKey(head)) {
                return true;
            }
            map.put(head, 0);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null||head.next==null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null&&fast.next!=null&&fast.next.next!=null) {
            if(slow==fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

}
