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
    private void traverse(TreeNode t, List<Integer> data) {
        if (t == null) {
            return;
        }
        data.add(t.val);
        traverse(t.left, data);
        traverse(t.right, data);
    }
    
    public List<Integer> preorderTraversal(TreeNode t) {
        List<Integer> data = new ArrayList<>();
        traverse(t, data);
        return data;
    }
}