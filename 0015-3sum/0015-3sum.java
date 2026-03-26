class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            HashSet<Integer>seen=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int c=-nums[i]-nums[j];
                if(seen.contains(c)){
                    hs.add(Arrays.asList(nums[i],c,nums[j]));
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(hs);
    }
}