class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        // length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        // length 2 to n
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i <= n-l; i++) {
                int j = i+l-1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (l == 2) {
                        dp[i][j] = 2;
                    }
                    else {
                        dp[i][j] = 2 + dp[i+1][j-1];
                    }
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}