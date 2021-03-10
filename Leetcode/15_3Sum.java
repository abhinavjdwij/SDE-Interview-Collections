class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i-1]) {
                continue; // remove duplicates
            }
            int l = i+1;
            int r = n-1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == 0) {
                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    l++;
                    r--;
                    while (l < r && arr[l] == arr[l-1]) {
                        l++; // remove duplicates
                    }
                    while (r > l && arr[r] == arr[r+1]) {
                        r--; // remove duplicates
                    }
                }
                else if (arr[i] + arr[l] + arr[r] < 0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return ans;
    }
}