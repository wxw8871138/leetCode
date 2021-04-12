package BD;

import java.util.HashMap;

public class CommonNodeInTwoLinkedList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap<ListNode,Integer> hashMap = new HashMap<>();
        while(pHead1!=null){
            hashMap.put(pHead1,hashMap.getOrDefault(pHead1,0)+1);
            hashMap.put(pHead2,hashMap.getOrDefault(pHead2,0)+1);
            if (hashMap.get(pHead1)==2){
                return pHead1;
            }
            if (hashMap.get(pHead2)==2){
                return pHead2;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2){
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1!=p2){
            p1 = p1==null?pHead2:p1.next;
            p2 = p2==null?pHead1:p2.next;
        }
        return p1;
    }
}
