package BD;

public class ReverseNodesInKGroup {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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

    private void reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
    }
}
