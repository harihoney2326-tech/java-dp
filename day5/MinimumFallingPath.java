//https://leetcode.com/problems/minimum-falling-path-sum/
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int j=0;j<n;j++)
            dp[0][j] = matrix[0][j];
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int minAbove = dp[i-1][j];
                if(j>0)
                    minAbove = Math.min(minAbove,dp[i-1][j-1]);
                if(j<n-1)
                    minAbove = Math.min(minAbove,dp[i-1][j+1]);
                dp[i][j] = matrix[i][j] + minAbove;
            }
        }
        int ans = Integer.MAX_VALUE;

        for(int j=0;j<n;j++)
            ans = Math.min(ans,dp[n-1][j]);
        return ans;
    }
}