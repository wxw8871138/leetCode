package Recursion;

import java.util.List;

public class Q21 {


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pre = new ListNode(0,head);
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                head.next=l1;
                l1 = l1.next;
            }else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return pre.next.next;
    }

    public static void main(String[] args) {
          Q21 q21 = new Q21();

    }
}
