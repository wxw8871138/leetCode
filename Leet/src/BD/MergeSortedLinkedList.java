package BD;

public class MergeSortedLinkedList {
      public class ListNode {
        int val;
        ListNode next = null;
      }
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode pre = new ListNode();
        ListNode cur = pre;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1==null?l2:l1;
        return pre.next;

    }
}
