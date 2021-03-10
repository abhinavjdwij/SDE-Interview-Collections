class Solution {
    public int threeSumClosest(int[] arr, int x) {
        Arrays.sort(arr);
        int n = arr.length;
        Integer ans = null; 
        for (int i = 0; i < n; i++) {
            int l = i+1;
            int r = n-1;
            while (l < r) {
                int s = arr[i] + arr[l] + arr[r];
                if (s == x) {
                    return x;
                }
                else if (s < x) {
                    l++;
                }
                else {
                    r--;
                }
                if (ans == null) {
                    ans = s;
                }
                if (Math.abs(x-s) < Math.abs(x-ans)) {
                    ans = s;
                }
            }
        }
        return ans.intValue();
    }
}