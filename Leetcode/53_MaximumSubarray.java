class Solution {
    public int maxSubArray(int[] arr) {
        if (arr.length == 0) { return 0; }
        int c = arr[0], m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            c = Math.max(c + arr[i], arr[i]);
            m = Math.max(c, m);
        }
        return m;
    }
}
