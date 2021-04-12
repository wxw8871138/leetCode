package BD;

import java.util.HashMap;

public class LRUCCachePrac {
    class DoubldeLinkedList{
        int key;
        int value;
        DoubldeLinkedList prev;
        DoubldeLinkedList next;

        public DoubldeLinkedList() {
        }

        public DoubldeLinkedList(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private HashMap<Integer,DoubldeLinkedList> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DoubldeLinkedList head,tail;

    public LRUCCachePrac(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DoubldeLinkedList();
        tail = new DoubldeLinkedList();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        DoubldeLinkedList node = cache.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(DoubldeLinkedList node) {
        node.next = head.next;
        node.next.prev = node;

    }
}
