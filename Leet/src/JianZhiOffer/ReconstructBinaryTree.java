package JianZhiOffer;

import java.util.HashMap;

public class ReconstructBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
    }
    TreeNode recurse(int[] preorder, int pre_root_idx, int in_left_idx, int in_right_idx){
        if (in_left_idx > in_right_idx) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[pre_root_idx]);
        int idx = map.get(preorder[pre_root_idx]);
        node.left = recurse(preorder,pre_root_idx+1,in_left_idx,idx-1);
        node.right=recurse(preorder,pre_root_idx+idx-in_left_idx+1, idx+1,in_right_idx);
        return node;
    }
}
