package BD;

public class DeleteReverseNthNode {
      public class ListNode {
        int val;
        ListNode next = null;
      }
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode left = pre, right = pre;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right.next!=null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return pre.next;
    }
}
