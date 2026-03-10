public class SubsetSum {
    static boolean subsetSum(int num[], int T) {
        int n = num.length;
        boolean dp[][] = new boolean[n + 1][T + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= T; j++) {
                if (num[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - num[i - 1]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][T];
    }

    public static void main(String[] args) {
        int num[] = {3, 1, 2};
        boolean ans = subsetSum(num, 3);
        System.out.println(ans);
    }
    
}
