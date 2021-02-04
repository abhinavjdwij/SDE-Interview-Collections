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
    public int maxDepth(TreeNode t) {
        if (t == null) { return 0; }
        if (t.left == null && t.right == null) {
            return 1;
        }
        return 1 + Math.max(maxDepth(t.left), maxDepth(t.right));
    }
}