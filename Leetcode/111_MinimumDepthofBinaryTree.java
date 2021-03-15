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
    public int minDepth(TreeNode t) {
        if (t == null) { return 0; }
        if (t.left == null && t.right == null) { return 1; }
        int l = (t.left == null) ? Integer.MAX_VALUE : minDepth(t.left);
        int r = (t.right == null) ? Integer.MAX_VALUE : minDepth(t.right);
        return 1 + Math.min(l, r);
    }
}