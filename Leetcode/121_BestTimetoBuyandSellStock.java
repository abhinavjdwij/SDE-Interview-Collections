class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        if (n < 2) { return 0; }
        int[] maxOnRight = new int[n];
        maxOnRight[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxOnRight[i] = Math.max(maxOnRight[i+1], arr[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxOnRight[i]-arr[i]);
        }
        return maxProfit;
    }
}