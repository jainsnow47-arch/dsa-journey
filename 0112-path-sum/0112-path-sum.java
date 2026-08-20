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
    public boolean solve(TreeNode root,int sum,int targetSum){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            sum+=root.val;
            return sum==targetSum;
        }
        boolean left = solve(root.left,sum+root.val,targetSum);
        boolean right = solve(root.right,sum+root.val,targetSum);
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return solve(root,0,targetSum);

    }
}