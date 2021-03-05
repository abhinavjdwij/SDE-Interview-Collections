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
    public void flatten(TreeNode t) {
        if (t == null) { return; }
        if (t.left == null && t.right == null) {
            return;
        }
        if (t.left != null) {
            flatten(t.left);
            TreeNode right = t.right;
            t.right = t.left;
            t.left = null;
            TreeNode temp = t.right;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = right;
        }
        flatten(t.right);
    }
}