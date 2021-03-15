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
    private void solve(TreeNode t,int x,int s,List<Integer> arr,List<List<Integer>> ans) {
        if (t == null) { return; }
        if (t.left == null && t.right == null) {
            if (t.val + s == x) {
                arr.add(t.val);
                ans.add(new ArrayList<>(arr));
                arr.remove(arr.size()-1);
                return;
            }
        }
        arr.add(t.val);
        solve(t.left, x, s+t.val, arr, ans);
        solve(t.right, x, s+t.val, arr, ans);
        arr.remove(arr.size()-1);
            
    }
    
    public List<List<Integer>> pathSum(TreeNode t, int x) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(t, x, 0, new ArrayList<>(), ans);
        return ans;
    }
}