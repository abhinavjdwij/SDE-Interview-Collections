class Solution {
    public int searchInsert(int[] arr, int x) {
        int l = 0, r = arr.length-1, m, ans = arr.length;
        while (l <= r) {
            m = (l+r) / 2;
            if (x == arr[m]) {
                return m;
            }
            else if (x > arr[m]) {
                ans = m+1;
                l = m+1;
            }
            else {
                ans = m;
                r = m-1;
            }
        }
        return ans;
    }
}
