package linkedList;

public class Q19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode first = head;
            ListNode second = first;
            for (int i=0;i<n;i++){
                second = second.next;
            }
            if(second==null){
                return head.next;
            }
            while (second.next!=null){
                first = first.next;
                second = second.next;
            }
            first.next = first.next.next;
            return head;
        }
    }
}
