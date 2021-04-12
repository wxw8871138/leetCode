package BD;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class ZTreeTraversal {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public int[] levelOrder(TreeNode root) {
          if (root==null) return new int[0];
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left!=null) queue.add(node.left);
            if (node.right!=null) queue.add(node.right);
        }
        int[] resArray = new int[res.size()];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    /*public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int flag = 1;
        while (!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

            }
            TreeNode node = queue.poll();
            level.add(node)
            if(flag==1){

            }
        }

    }*/
}
