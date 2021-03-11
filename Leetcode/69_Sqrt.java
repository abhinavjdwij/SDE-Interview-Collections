class Solution {
    public int mySqrt(int x) {
        // 46430 is sqrt Integer.MAX_VALUE
        int ans = 0, l = 0, r = 46340, m;
        while (l <= r) {
            m = r - (r-l)/2;
            if (m*m == x) {
                return m;
            }
            else if (m*m < x) {
                ans = m;
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return ans;
    }
}