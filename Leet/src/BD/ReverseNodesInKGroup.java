package BD;

public class ReverseNodesInKGroup {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      int len = 0;

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        while (tail != null) {
            reverse(tail, k);
            for (int i = 0; i < k; i++) {
                tail = tail.next;
            }
        }
        return null;
    }

    private void reverse(ListNode head, int k) {
          if(head==null||head.next==null||len==k){
              return;
          }
          reverse(head.next, k);
          head.next.next = head;
          len++;
    }
}
