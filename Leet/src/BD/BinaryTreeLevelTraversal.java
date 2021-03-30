package BD;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BinaryTreeLevelTraversal {
      public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
      }
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
