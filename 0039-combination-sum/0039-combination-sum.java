class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>path=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        backtrack(path,res,0,0,candidates,target);
        return res;
    }
    public void backtrack(List<Integer>path,List<List<Integer>>res,int sum,int s,int[]nums,int tar){
        if(sum==tar){
            res.add(new ArrayList<>(path));
            return;
        }
        if(sum>tar){
            return;
        }
        for(int i=s;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(path,res,sum+nums[i],i,nums,tar);
            path.remove(path.size()-1);
        }
    }
}