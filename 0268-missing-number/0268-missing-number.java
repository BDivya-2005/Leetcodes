class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int act=0;
        int ex=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            act=act+nums[i];
        }
        return ex-act;
    }
}