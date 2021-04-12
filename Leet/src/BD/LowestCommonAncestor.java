package BD;

public class LowestCommonAncestor {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

    // write code here
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        if(root==null||root.val==-1) return -1;
        if (root.val==o1||root.val==o2) return root.val;
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if (left==-1) return right;
        if (right==-1) return left;
        return root.val;
    }
}
