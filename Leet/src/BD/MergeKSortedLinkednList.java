package BD;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedLinkednList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists==null||lists.size()==0){
            return null;
        }
        PriorityQueue<ListNode> pq =new PriorityQueue<>((n1,n2)->n1.val-n2.val);
        for (int i = 0; i < lists.size(); i++) {
            pq.add(lists.get(i));
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!pq.isEmpty()){
            cur.next = pq.poll();
            cur = cur.next;
            if (cur.next!=null){
                pq.add(cur.next);
            }
        }
        return dummy.next;
    }
}
