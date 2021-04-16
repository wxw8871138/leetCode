package DailyChanllenge;

import java.util.HashMap;

public class LinkedListPartition {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode partition(ListNode head, int x) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        int i = 0;
        int xIdx = 0;

        while (head!=null){
            if (x == head.val) {
                xIdx = i;
            }
            map.put(i,head);
            i++;
            head=head.next;
        }
        map.put(-1, new ListNode(0,map.get(0)));

        swap(map,0, xIdx);
        int k = 1;
        for (int j = 1; j < map.size(); j++) {
            if (map.get(j).val<x){
                swap(map,k,j);
                k++;
            }
        }
        map.get(k).next=map.get(0);
        map.get(0).next = map.get(k+1);
        return map.get(1);

    }
    private void swap(HashMap<Integer,ListNode> map,int i, int j){
          map.get(i-1).next=map.get(j);
          map.get(j-1).next=map.get(i);
          map.get(j).next = map.get(i+1)!=null?map.get(i+1):null;
          map.get(i).next = map.get(j+1)!=null?map.get(j+1):null;
          ListNode temp = map.get(i);
          map.put(i,map.get(j));
          map.put(j,temp);
    }
}
