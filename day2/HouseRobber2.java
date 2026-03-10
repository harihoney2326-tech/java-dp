//https://leetcode.com/problems/house-robber-ii/

class HouseRobber2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int[] temp1 = new int[n-1];
        int[] temp2 = new int[n-1];
        int j=0;
        int k = 0;
        for(int i=0;i<n;i++){
            if(i!=n-1){
                temp1[j++] = nums[i];
            }
            if(i!=0){
                temp2[k++] = nums[i];
            }
        }
        
        int[] dp = new int[n-1];
        Arrays.fill(dp,-1);
       int max1 = strategy(0,temp1,n-1,dp);
       System.out.println(max1);
       Arrays.fill(dp,-1);
       int max2 = strategy(0,temp2,n-1,dp);
       System.out.println(max2);
       return Math.max(max1,max2);
    
    }

    public int strategy(int index,int[] nums, int n,int[] dp){
        if(index==n-1){
            return nums[index];
        }
        if(index>=n)
            return 0;
        if(dp[index]!=-1)return dp[index];
        int pick = nums[index] + strategy(index+2,nums,n,dp);
        int notPick = strategy(index+1,nums,n,dp);
        return dp[index] = Math.max(pick,notPick);
    }
   
}