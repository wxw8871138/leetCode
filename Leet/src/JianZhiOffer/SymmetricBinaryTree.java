package JianZhiOffer;

public class SymmetricBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return recur(root,root);
    }
    private boolean recur(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val!= root2.val) {
            return false;
        }
        return recur(root1.left,root2.right)&&recur(root1.right,root2.left);
    }
}
