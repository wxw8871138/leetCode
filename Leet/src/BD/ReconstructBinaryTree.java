package BD;

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
    int[] pre;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        this.pre=pre;
        for (int i = 0; i < in.length; i++) {
            map.put(in[i],i );
        }
        return recur(0,0,in.length-1);


    }

    private TreeNode recur(int root, int left, int right) {

        if (left>right) return null;
        TreeNode node = new TreeNode(pre[root]);
        int i = map.get(pre[root]);
        node.left = recur(root+1, left, i -1);
        node.right = recur(root+i-left+1,i+1,right);
        return node;
    }
}
