package BD;

public class SumTwoLinkendList {
    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }


    int carry = 0;
    ListNode cur = null;
    public ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        while (head1 != null || head2 != null) {
            addInList(head1!=null?head1:null,head2!=null?head2:null);
            int n1 = head1!=null?head1.val:0;
            int n2 = head2!=null?head2.val:0;
            int sum = n1 + n2 + carry;
            ListNode node = new ListNode(sum%10);
            carry = sum / 10;
            node.next = cur;
            cur = node;
        }
        if(carry==1){
            ListNode node = new ListNode(1);
            node.next = cur;
            cur = node;
        }
        return cur;
    }
}
