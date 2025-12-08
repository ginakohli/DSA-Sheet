/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {

      if(root == null){
        return 0;
      }

      int depth = 1;
      Queue<TreeNode> qu = new LinkedList<>();
      qu.add(root);

      while(!qu.isEmpty()){
        int size = qu.size();

        for(int i = 0; i < size; i++){
        TreeNode temp = qu.remove();
        if(temp.left == null && temp.right == null){
            return depth;
        }

        if(temp.left != null){
            qu.add(temp.left);
        }

        if(temp.right != null){
            qu.add(temp.right);
        }

        }
        depth ++;
      }
      return 0;
}
}