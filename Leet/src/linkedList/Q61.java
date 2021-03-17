package linkedList;

public class Q61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            ListNode cur = head;
            if(head==null||head.next==null||k==0){
                return head;
            }
            int length = 1;
            while (cur.next!=null) {
                cur = cur.next;
                length++;
            }
            cur.next = head;
            cur = head;
            k = k % length;
            for(int i=0;i<length-k;i++){
                cur = cur.next;
            }
            ListNode newHead = cur.next;
            cur.next = null;
            return newHead;
        }
    }
}
