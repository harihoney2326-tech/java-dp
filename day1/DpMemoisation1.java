import java.util.Arrays;

public class DpMemoisation1 {

    static int dp[];

    static int fibD(int n){

        if(n==0)
            return 0;

        if(n==1)
            return 1;

        if(dp[n] != -1)
            return dp[n];

        dp[n] = fibD(n-1) + fibD(n-2);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 7;

        dp = new int[n+1];

        Arrays.fill(dp, -1);

        int fib = fibD(n);

        System.out.println(fib);
    }
}