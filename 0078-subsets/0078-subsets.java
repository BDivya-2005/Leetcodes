class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>path=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        backtrack(res,path,0,nums);
        return res;
    }
    public void backtrack(List<List<Integer>>res,List<Integer>path,int s,int[] nums){
        res.add(new ArrayList<>(path));
        for(int i=s;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(res,path,i+1,nums);
            path.remove(path.size()-1);
        }
    }
}