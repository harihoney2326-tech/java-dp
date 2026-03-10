import java.util.Arrays;
public class TribonacciM {
    static int dp[];
    static int trib(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = trib(n - 1) + trib(n - 2) + trib(n - 3);

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(trib(n));
    }
}