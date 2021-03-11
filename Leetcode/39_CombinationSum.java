class Solution {
    private void check(int[] arr, int x, int s, int p, 
                       List<List<Integer>> ans, List<Integer> data) {
        if (s == x) {
            ans.add(new ArrayList<>(data));
            return;
        }
        if (s > x) {
            return;
        }
        for (int i = p; i < arr.length; i++) {
            data.add(arr[i]);
            check(arr, x, s+arr[i], i, ans, data);
            data.remove(data.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] arr, int x) {
        List<List<Integer>> ans = new ArrayList<>();
        check(arr, x, 0, 0, ans, new ArrayList<Integer>());
        return ans;
    }
}