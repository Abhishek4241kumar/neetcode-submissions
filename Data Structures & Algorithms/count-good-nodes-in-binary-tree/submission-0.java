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
    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }

    int count = 0;
    private int helper(TreeNode root, int max){
        if(root == null) return 0;

        if(Math.max(root.val,max) == root.val) count++;
         max = Math.max(root.val,max);
        int left = helper(root.left,max);
        int right = helper(root.right,max);

        return count;
    }
}
