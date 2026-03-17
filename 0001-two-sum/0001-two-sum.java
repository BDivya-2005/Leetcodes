class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int res=target-nums[i];
            if(h.containsKey(res)&& h.get(res)!=i)
            {
                return new int[]{i,h.get(res)};
            }
        }
        return new int[]{};

    }
}