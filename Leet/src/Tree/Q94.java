package Tree;

import java.util.ArrayList;
import java.util.List;

public class Q94 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(res,root);
        return res;
    }

    private void traversal(List<Integer> res, TreeNode root) {
        if(root==null) return;
        traversal(res,root.left);
        res.add(root.val);
        traversal(res,root.right);
    }

}
