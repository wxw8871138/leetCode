package Tree;

import java.util.Map;

public class ReconstructTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Map<Integer, Integer> indexMap;

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {

        }

        public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
            if (preorder_left > preorder_right) {
                return null;
            }

            int preoderRoot = preorder_left;
            int inorderRoot = indexMap.get(preorder[preoderRoot]);
            TreeNode root = new TreeNode(preorder[preoderRoot;
            int sizeLeftSubtree = inorderRoot - inorder_left;
            root.left = myBuildTree(preorder,inorder,preorder_left+1)
        }
    }
}
