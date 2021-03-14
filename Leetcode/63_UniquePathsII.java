class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        assert(m >= 1);
        int n = arr[0].length;
        assert(n >= 1);
        int[][] dp = new int[m][n];
        if (dp[0][0] == 1) { return 0; }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    dp[i][j] = 0;
                }
                else if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                }
                else if (i == 0) {
                    dp[i][j] = dp[i][j-1];
                }
                else if (j == 0) {
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}