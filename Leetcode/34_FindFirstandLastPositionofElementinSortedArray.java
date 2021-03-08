class Solution {
    // bound type'U' -> upper, 'L' -> lower, others -> assertion error
    private int getBound(int[] arr, int x, char boundType) {
        assert(boundType == 'U' || boundType == 'L');
        int l = 0, r = arr.length-1, m, ans = -1;
        while (l <= r) {
            m = (l+r) / 2;
            if (arr[m] == x) {
                ans = m;
                if (boundType == 'U') {
                    l = m+1;
                }
                else {
                    r = m-1;
                }
            }
            else if (arr[m] < x) {
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return ans;
    }
    
    public int[] searchRange(int[] arr, int x) {
        return new int[] { getBound(arr, x, 'L'), getBound(arr, x, 'U') } ;
    }
}