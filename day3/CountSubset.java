public class CountSubset {

    static int countSubset(int num[], int T) {
        int n = num.length;
        int dp[][] = new int    [n + 1][T + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= T; j++) {
                if (num[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - num[i - 1]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][T];
    }

    public static void main(String[] args) {
        int num[] = {3, 1, 2};
        int ans = countSubset(num, 3);
        System.out.println(ans);
    }
}