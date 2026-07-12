class Solution {
    public int minSubArrayLen(int target, int[] nums)     
    {
        int n=nums.length;
        int l=0,r=0;
        int s=0;
        int len=Integer.MAX_VALUE;
        
        for(r=0;r<n;r++)
        {
            s=s+nums[r];
            while(s>=target)
            {
                len=Math.min(len,r-l+1);
                s=s-nums[l];
                l++;
            }
        }
        if (len==Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return len;
        }
    }
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5};
        int tar=11;
        Solution sol = new Solution();

        System.out.println(sol.minSubArrayLen(tar,nums));
    }

}