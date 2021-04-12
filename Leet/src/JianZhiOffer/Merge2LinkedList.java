package JianZhiOffer;

import java.util.PriorityQueue;

public class Merge2LinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((n1,n2)-> n1.val- n2.val);
        queue.add(l1);
        queue.add(l2);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            cur.next = node;
            cur = cur.next;
            if (cur.next!=null){
                queue.add(cur.next);
            }
        }
        return dummy.next;
    }
}
