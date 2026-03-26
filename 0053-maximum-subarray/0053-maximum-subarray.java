class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++){
            cur=Math.max(cur,0)+nums[i];
            maxi=Math.max(maxi,cur);
        }
        return maxi;
    }
}