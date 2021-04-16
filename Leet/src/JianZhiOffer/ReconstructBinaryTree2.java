package JianZhiOffer;

import java.util.HashMap;

public class ReconstructBinaryTree2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    int[] preorder;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recurse(0,0,inorder.length-1);
    }
    private TreeNode recurse(int pre_root_idx, int in_left_idx, int in_right_idx){
        if (in_left_idx > in_right_idx) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre_root_idx]);
        int idx = map.get(preorder[pre_root_idx]);
        root.left = recurse(pre_root_idx+1,in_left_idx,idx-1);
        //pre_root_idx+(idx-in_left_idx)+1 含义为 根节点索引 + 左子树长度 + 1
        root.right = recurse(pre_root_idx+(idx-in_left_idx)+1,idx+1,in_right_idx);
        return root;
    }
}
