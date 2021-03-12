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
    private int solve(TreeNode t, int s) {
        if (t == null) { return 0; }
        if (t.left == null && t.right == null) {
            return s*10 + t.val;
        }
        return solve(t.left, s*10 + t.val) + solve(t.right, s*10 + t.val);
    }
    
    public int sumNumbers(TreeNode t) {
        return solve(t, 0);
    }
}