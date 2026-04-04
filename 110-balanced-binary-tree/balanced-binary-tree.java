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
    int heigth(TreeNode root){
        if(root == null)
        return 0;
        int lh = heigth(root.left);
        if(lh == -1)return -1;

        int rh = heigth(root.right);
        if(rh == -1)
        return -1;
        if(Math.abs(lh-rh) > 1)
        return -1;
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int ans = heigth(root);
        if(ans == -1)
        return false;
        else
        return true;

        
        
        
    }
}