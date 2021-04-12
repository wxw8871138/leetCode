package JianZhiOffer;

import java.util.ArrayList;
import java.util.Stack;

public class ReversePrintLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int len = 0;
        while (head!=null){
            stack.push(head);
            head = head.next;
            len++;
        }
        int[] res = new int[len];
        int i = 0;
        while (!stack.isEmpty()){
            res[i] = stack.pop().val;
            i++;
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        recur(list, head);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public void recur(ArrayList list, ListNode head){
        if (head==null){
            return;
        }
        recur(list,head.next);
        list.add(head.val);
    }
}
