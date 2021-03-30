package Tree;

import java.util.ArrayList;
import java.util.List;

public class Q144 {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recur(res, root);
        return res;
    }

    private void recur(List<Integer> res, TreeNode root) {
        if(root==null){
            return;
        }
        res.add(root.val);
        recur(res,root.left);
        recur(res,root.right);
    }
}
