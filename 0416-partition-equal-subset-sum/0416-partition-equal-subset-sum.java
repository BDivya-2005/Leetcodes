class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        if(total%2!=0){
            return false;
        }
        int half=total/2;
        boolean[]dp=new boolean[half+1];
        dp[0]=true;
        for(int n:nums){
            for(int i=half;i>=n;i--){
                if(dp[i-n]){
                    dp[i]=true;
                }
            }
        }
        return dp[half];
    }
}