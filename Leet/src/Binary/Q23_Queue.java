package Binary;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q23_Queue {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a,b)->Integer.compare(a.val,b.val) );

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (ListNode node: lists){
            if (node!=null) queue.add(node);
        }
        while (!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;
            if (tail.next!=null){
                queue.add(tail.next);
            }
        }
        return dummy.next;
    }

}
