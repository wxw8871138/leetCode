package linkedList;

import java.util.HashMap;
import java.util.Map;

public class Q138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node pre = new Node(0);
        pre.next = head;
        Map<Node,Node> hashmap = new HashMap<>();
        while(head!=null){
            Node copiedNode = new Node(head.val);
            hashmap.put(head, copiedNode);
            head = head.next;
        }
        head = pre.next;
        while (head!=null){
            hashmap.get(head).next = hashmap.get(head.next);
            hashmap.get(head).random = hashmap.get(head.random);
            head = head.next;
        }
        return hashmap.get(pre.next);
    }

}
