class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]<0 && k>0){
                nums[i]=nums[i]*-1;
                k--;
            }
        }
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]<min){
                min=nums[i];
            }
        }
        if(k%2==1){
            sum-=2*min;
        }
        return sum;
    }
}