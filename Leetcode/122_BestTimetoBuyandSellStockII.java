class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = -1;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice == -1 || buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            else {
                profit += prices[i] - buyPrice;
                buyPrice = prices[i];
            }
        }
        return profit;
    }
}