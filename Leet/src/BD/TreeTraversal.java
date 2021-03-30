package BD;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {
      public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
      }
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer> preTraversal = new ArrayList<>();
        List<Integer> inTraversal = new ArrayList<>();
        List<Integer> postTraversal = new ArrayList<>();
        preTraversal(preTraversal,root);
        List<int[]> traversals = new ArrayList<>();
        int[] preArray = preTraversal.stream().mapToInt(i->i).toArray();
        inTraversal(inTraversal,root);
        int[] inArray = inTraversal.stream().mapToInt(i->i).toArray();
        postTraversal(postTraversal,root);
        int[] postArray = postTraversal.stream().mapToInt(i->i).toArray();
        return new int[][] {preArray,inArray,postArray};
    }

    private void postTraversal(List<Integer> postTraversal, TreeNode root) {
        if(root==null){
            return;
        }
        postTraversal(postTraversal,root.left);
        postTraversal(postTraversal,root.right);
        postTraversal.add(root.val);
    }

    private void inTraversal(List<Integer> inTraversal, TreeNode root) {
        if(root==null){
            return;
        }
        inTraversal(inTraversal,root.left);
        inTraversal.add(root.val);
        inTraversal(inTraversal,root.right);

    }

    private void preTraversal(List<Integer> preTraversal, TreeNode root){
        if(root==null){
            return;
        }
        preTraversal.add(root.val);
        preTraversal(preTraversal,root.left);
        preTraversal(preTraversal,root.right);
    }
}
