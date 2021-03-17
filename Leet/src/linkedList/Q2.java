package linkedList;

public class Q2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode current = head;
            int carry = 0;
            while(l1!=null||l2!=null){
                int x = l1 == null? 0 : l1.val;
                int y = l2 == null? 0 : l2.val;
                int summary = x + y + carry;
                carry = summary/10;
                summary = summary%10;
                current.next = new ListNode(summary);
                current = current.next;
                if (l1!=null){
                    l1 = l1.next;
                }
                if(l2!=null) {
                    l2 = l2.next;
                }

            }
            if(carry==1){
                current.next = new ListNode(carry);
            }
            return head.next;
        }
    }
}
