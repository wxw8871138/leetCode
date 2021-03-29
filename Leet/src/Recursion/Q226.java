package Recursion;

public class Q226 {
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
//    public void invertNode(TreeNode r1, TreeNode r2){
//        if(r1==null||r2==null){
//            return;
//        }
//
//        invertNode(r1.left,r2.right);
//        invertNode(r1.right,r2.left);
//    }
}
