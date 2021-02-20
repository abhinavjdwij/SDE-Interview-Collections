class Solution {
    private int min3(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }
    
    public int minDistance(String a, String b) {
        int x = a.length(), y = b.length();
        int[][] dp = new int[x+1][y+1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0) { dp[i][j] = j; }
                else if (j == 0) { dp[i][j] = i; }
                else if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1 + min3(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);
                }
            }
        }
        return dp[x][y];
    }
}