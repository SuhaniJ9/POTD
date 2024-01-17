class Solution{
    static int numberSequence(int m, int n)
    {
        int[][] dp = new int[n + 1][m + 1];

        // Initialize the base case: there is 1 way to create a sequence of length 0
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 1;
        }

        // Fill the dp array using bottom-up dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If seq[i] = 2 * seq[i-1], then dp[i][j] += dp[i-1][j/2]
                dp[i][j] += dp[i - 1][j / 2];

                // Add the possibilities where seq[i] != 2 * seq[i-1]
                dp[i][j] += dp[i][j - 1];
            }
        }

        // The result is stored in the last cell of the dp array
        return dp[n][m];
    }
}
